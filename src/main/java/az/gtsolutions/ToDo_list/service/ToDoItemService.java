package az.gtsolutions.ToDo_list.service;

import az.gtsolutions.ToDo_list.entity.ToDoItemEntity;

import java.util.List;

public interface ToDoItemService {
    ToDoItemEntity addToDoItem(ToDoItemEntity toDoItem);

    List<ToDoItemEntity> getAllToDoItems();

    void softDeleteToDoItem(Long id);

    ToDoItemEntity updateToDoItem(ToDoItemEntity toDoItemEntity);

    ToDoItemEntity getToDoItem(Long id);
}
