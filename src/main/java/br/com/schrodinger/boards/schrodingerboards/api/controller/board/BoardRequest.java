package br.com.schrodinger.boards.schrodingerboards.api.controller.board;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class BoardRequest {

    private String name;

    private UUID leader;

    public Board toBoard() {
        var board = new Board();
        board.setName(this.name);
        board.setLeader(this.leader);
        board.setCreatedAt(LocalDateTime.now());
        return board;
    }

}
