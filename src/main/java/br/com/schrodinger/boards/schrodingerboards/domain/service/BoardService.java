package br.com.schrodinger.boards.schrodingerboards.domain.service;

import br.com.schrodinger.boards.schrodingerboards.domain.repository.BoardRepository;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    private BoardRepository boardRepository;

    // Dependency injection by constructor
    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }
}
