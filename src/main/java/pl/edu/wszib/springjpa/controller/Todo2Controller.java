package pl.edu.wszib.springjpa.controller;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;
import pl.edu.wszib.springjpa.ToDo2;
import pl.edu.wszib.springjpa.model.ToDo;
import pl.edu.wszib.springjpa.model.ToDoStatus;
import pl.edu.wszib.springjpa.service.Todo2Service;
import pl.edu.wszib.springjpa.service.TodoService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todos2")
public class Todo2Controller {

    @Autowired
    private Todo2Service service;

    @GetMapping
    public List<ToDo2> list() {
        return service.list();
    }

    @GetMapping("/{id}")
    public ToDo2 get(@PathVariable UUID id) {
        return service.get(id);
    }

    @PostMapping
    public ToDo2 create(@RequestBody ToDo2 toDo) {
        return service.create(toDo);
    }

    @PutMapping("/{id}")
    public ToDo2 update(@PathVariable UUID id, @RequestBody ToDo2 toDo) {
        toDo.setId(id);
        return service.update(toDo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        service.delete(id);
    }

}
