package br.com.schrodinger.boards.schrodingerboards.domain.service;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import br.com.schrodinger.boards.schrodingerboards.domain.repository.BoardRepository;
import java.time.LocalDateTime;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board create(Board board) {
        board.setCreatedAt(LocalDateTime.now());

        if (Boolean.FALSE.equals(boardRepository.existsByName(board.getName())))
            return boardRepository.save(board);

        throw new RuntimeException("Não é possível cadastrar dois boards com o mesmo nome");
    }

    public Board getById(UUID id){
        return boardRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Not found")
        );
    }

}
