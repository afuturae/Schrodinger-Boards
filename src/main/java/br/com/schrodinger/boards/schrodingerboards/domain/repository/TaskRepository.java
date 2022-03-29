package br.com.schrodinger.boards.schrodingerboards.domain.repository;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Task;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, UUID> {
}
