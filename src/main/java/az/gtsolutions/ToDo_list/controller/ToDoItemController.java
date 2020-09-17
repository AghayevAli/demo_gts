package az.gtsolutions.ToDo_list.controller;

import az.gtsolutions.ToDo_list.entity.ToDoItemEntity;
import az.gtsolutions.ToDo_list.service.ToDoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/toDoList")
public class ToDoItemController {

    @Autowired
    private ToDoItemService toDoItemService;

    @PostMapping
    public ToDoItemEntity addToDoItem(@RequestBody ToDoItemEntity toDoItemEntity) {
        return toDoItemService.addToDoItem(toDoItemEntity);
    }

    @GetMapping
    public List<ToDoItemEntity> getAllToDoItems() {
        return toDoItemService.getAllToDoItems();
    }

    @DeleteMapping("/{id}")
    public void softDeleteToDoItem(@PathVariable Long id) {
        toDoItemService.softDeleteToDoItem(id);
    }

    @PutMapping
    public ToDoItemEntity updateToDoItem(@RequestBody ToDoItemEntity toDoItemEntity) {
        return toDoItemService.updateToDoItem(toDoItemEntity);
    }

    @GetMapping("{id}")
    public ToDoItemEntity getToDoItem(@PathVariable Long id) {
        return toDoItemService.getToDoItem(id);
    }
}
