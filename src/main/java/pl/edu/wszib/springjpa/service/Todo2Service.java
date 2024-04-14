package pl.edu.wszib.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.edu.wszib.springjpa.ToDo2;
import pl.edu.wszib.springjpa.model.ToDo;
import pl.edu.wszib.springjpa.model.ToDoStatus;
import pl.edu.wszib.springjpa.repository.Todo2Repository;
import pl.edu.wszib.springjpa.repository.TodoRepository;
import pl.edu.wszib.springjpa.specifications.ToDoSpecifications;

import java.util.List;
import java.util.UUID;

@Service
public class Todo2Service implements CrudService<ToDo2, UUID> {

    @Autowired
    private Todo2Repository repository;

    @Override
    public List<ToDo2> list() {
        return repository.findAll();
    }

    @Override
    public ToDo2 get(UUID s) {
        return repository.findById(s).get();
    }

    @Override
    public ToDo2 create(ToDo2 toDo2) {
        return repository.save(toDo2);
    }

    @Override
    public ToDo2 update(ToDo2 toDo2) {
        return repository.save(toDo2);
    }

    @Override
    public void delete(UUID s) {
        repository.deleteById(s);
    }
}
