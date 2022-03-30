package br.com.schrodinger.boards.schrodingerboards.domain.service;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import java.util.UUID;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardServiceTest {

    @Autowired
    private BoardService boardService;

    private Board board;

    @BeforeEach
    void init() {
        board = new Board();
        board.setLeader(UUID.randomUUID());
        board.setName("Schrodinger New Board");
    }

    @Test
    void should_create_a_new_board() {
        var boardExpected = this.board;
        var createdBoard = boardService.create(boardExpected);

        Assertions.assertThat(boardExpected.getName()).isEqualTo(createdBoard.getName());
        Assertions.assertThat(boardExpected.getLeader()).isEqualTo(createdBoard.getLeader());

        Assertions.assertThat(createdBoard.getCreatedAt()).isNotNull();
        Assertions.assertThat(createdBoard.getId()).isNotNull();
    }

    @Test
    void should_throw_exception_when_trying_two_boards_with_same_name() {
        var board = this.board;

        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> boardService.create(board));

        org.junit.jupiter.api.Assertions.assertThrows(RuntimeException.class, () -> boardService.create(board));
    }

}
