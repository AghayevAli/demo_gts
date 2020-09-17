package az.gtsolutions.ToDo_list.repository;

import az.gtsolutions.ToDo_list.entity.ToDoItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemDTO extends JpaRepository<ToDoItemEntity, Long> {

}
