package br.com.schrodinger.boards.schrodingerboards.domain.model;

import br.com.schrodinger.boards.schrodingerboards.domain.enums.TaskStatusEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column
    private UUID user;

    @OneToOne
    @JoinColumn(name = "board_id", nullable = false)
    private Board board;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private TaskStatusEnum status;

    @Column
    private LocalDate deadline;

    @Column
    private LocalDate createdAt;

    @Column
    private LocalDate updatedAt;
}
