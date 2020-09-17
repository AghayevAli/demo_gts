package az.gtsolutions.ToDo_list.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Where(clause = "is_active = 1")
@NoArgsConstructor
public class ToDoItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private LocalDateTime dateTime;

    private boolean complete = false;

    private boolean isActive = true;

    @PrePersist
    private void dateTimeNow() {
        this.dateTime = LocalDateTime.now();
    }
}
