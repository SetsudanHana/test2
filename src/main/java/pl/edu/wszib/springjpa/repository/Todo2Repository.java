package pl.edu.wszib.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.ToDo2;
import pl.edu.wszib.springjpa.model.ToDo;
import pl.edu.wszib.springjpa.model.ToDoStatus;

import java.util.List;
import java.util.UUID;

@Repository
public interface Todo2Repository extends JpaRepository<ToDo2, UUID>, JpaSpecificationExecutor<ToDo2> {

}
