package br.com.schrodinger.boards.schrodingerboards.domain.model;

import br.com.schrodinger.boards.schrodingerboards.domain.enums.TaskStatusEnum;

import java.time.LocalDateTime;
import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID userAssigned;

    @ManyToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    private String title;

    private String description;

    private TaskStatusEnum status;

    private LocalDate deadline;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
