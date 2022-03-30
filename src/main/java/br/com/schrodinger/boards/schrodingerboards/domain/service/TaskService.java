package br.com.schrodinger.boards.schrodingerboards.domain.service;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Task;
import br.com.schrodinger.boards.schrodingerboards.domain.repository.TaskRepository;
import java.util.UUID;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository taskRepository;

    // Dependency injection by constructor
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task getById(UUID id){
        return taskRepository.findById(id).get();
    }
}
