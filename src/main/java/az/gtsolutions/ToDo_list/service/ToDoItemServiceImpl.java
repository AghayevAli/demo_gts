package az.gtsolutions.ToDo_list.service;

import az.gtsolutions.ToDo_list.entity.ToDoItemEntity;
import az.gtsolutions.ToDo_list.repository.ToDoItemDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoItemServiceImpl implements ToDoItemService {

    @Autowired
    private ToDoItemDTO toDoItemDTO;

    @Override
    public ToDoItemEntity addToDoItem(ToDoItemEntity toDoItem) {
        return toDoItemDTO.save(toDoItem);
    }

    @Override
    public List<ToDoItemEntity> getAllToDoItems() {
        return toDoItemDTO.findAll();
    }

    @Override
    public void softDeleteToDoItem(Long id) {
        ToDoItemEntity toDoItemEntity = toDoItemDTO.findById(id).get();
        toDoItemEntity.setActive(false);
        toDoItemDTO.save(toDoItemEntity);
    }

    @Override
    public ToDoItemEntity updateToDoItem(ToDoItemEntity toDoItemEntity) {
        return toDoItemDTO.save(toDoItemEntity);
    }

    @Override
    public ToDoItemEntity getToDoItem(Long id) {
        return toDoItemDTO.findById(id).get();
    }
}