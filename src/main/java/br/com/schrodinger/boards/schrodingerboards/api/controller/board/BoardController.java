package br.com.schrodinger.boards.schrodingerboards.api.controller.board;

import br.com.schrodinger.boards.schrodingerboards.domain.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/boards")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping
    public ResponseEntity<BoardResponse> create(@RequestBody BoardRequest board) {
        var createdBoard = boardService.create(board.toBoard());

        return ResponseEntity.ok().body(new BoardResponse(createdBoard));
    }

}
