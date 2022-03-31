package br.com.schrodinger.boards.schrodingerboards.domain.repository;

import br.com.schrodinger.boards.schrodingerboards.domain.model.Board;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, UUID> {

    Boolean existsByName(String name);

}
