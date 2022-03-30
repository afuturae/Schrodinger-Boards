package br.com.schrodinger.boards.schrodingerboards.domain.service;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import br.com.schrodinger.boards.schrodingerboards.domain.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public Board create(Board board) {
        return boardRepository.save(board);
    }
}
