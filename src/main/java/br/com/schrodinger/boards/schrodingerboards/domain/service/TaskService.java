package br.com.schrodinger.boards.schrodingerboards.domain.service;

import br.com.schrodinger.boards.schrodingerboards.domain.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    // Dependency injection by constructor
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
}
