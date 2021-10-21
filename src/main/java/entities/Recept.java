package entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Recept {
    @Id
    private Long id;
    private String title;
    private String description;
    private LocalDate localDate;

    @Override
    public String toString() {
        return "Recept{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                ", creator=" + creator +
                '}';
    }

    public Creator getCreator() {
        return creator;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public Recept(Creator creator) {
        this.creator = creator;
    }

    @ManyToOne
    private Creator creator;

    public Recept() {
    }

    public Recept(Long id, String title, String description, LocalDate localDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.localDate = localDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

}
