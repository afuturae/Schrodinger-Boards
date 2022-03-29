package br.com.schrodinger.boards.schrodingerboards.domain.model;

import br.com.schrodinger.boards.schrodingerboards.domain.enums.TaskStatusEnum;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
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
