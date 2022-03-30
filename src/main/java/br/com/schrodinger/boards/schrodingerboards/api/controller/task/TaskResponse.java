package br.com.schrodinger.boards.schrodingerboards.api.controller.task;

import br.com.schrodinger.boards.schrodingerboards.domain.enums.TaskStatusEnum;
import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import br.com.schrodinger.boards.schrodingerboards.domain.model.Task;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Data;

@Data
public class TaskResponse {

    public TaskResponse(Task task){
        this.id = task.getId();
        this.board = task.getBoard();
        this.deadline = task.getDeadline();
        this.title = task.getTitle();
        this.status = task.getStatus();
        this.description = task.getDescription();
        this.createdAt = task.getCreatedAt();
        this.userAssigned = task.getUserAssigned();
    }

    private UUID id;
    private String title;
    private String description;
    private TaskStatusEnum status;
    private LocalDate deadline;
    private LocalDateTime createdAt;
    private UUID userAssigned;
    private Board board;

}
