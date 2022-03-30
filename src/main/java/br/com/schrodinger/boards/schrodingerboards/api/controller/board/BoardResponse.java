package br.com.schrodinger.boards.schrodingerboards.api.controller.board;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class BoardResponse {

    public BoardResponse(Board board){
        this.id = board.getId();
        this.name = board.getName();
        this.leader = board.getLeader();
        this.createdAt = board.getCreatedAt();
    }

    private UUID id;
    private String name;
    private UUID leader;
    private LocalDateTime createdAt;

}
