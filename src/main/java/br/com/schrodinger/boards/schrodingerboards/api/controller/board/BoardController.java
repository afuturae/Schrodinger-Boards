package br.com.schrodinger.boards.schrodingerboards.api.controller.board;

import br.com.schrodinger.boards.schrodingerboards.domain.service.BoardService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.UUID;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/boards")
@Tag(name = "Boards", description = "Boards to add tasks")
public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @Operation(summary = "Create a new board")
    @PostMapping
    public ResponseEntity<BoardResponse> create(@RequestBody BoardRequest board) {
        var createdBoard = boardService.create(board.toBoard());

        return ResponseEntity.status(HttpStatus.CREATED).body(new BoardResponse(createdBoard));
    }

    @Operation(summary = "Returns a user by id or throw not found exception")
    @GetMapping("/{id}")
    public ResponseEntity<BoardResponse> getById(@PathVariable UUID id) {
        var foundedBoard = boardService.getById(id);

        return ResponseEntity.ok().body(new BoardResponse(foundedBoard));
    }

}
