package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Creator {
    @Id
    private Long id;
    private String firstName;
    private String lastName;

    public Creator(List<Recept> recepts) {
        this.recepts = recepts;
    }

    @Override
    public String toString() {
        return "Creator{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", recepts=" + recepts +
                '}';
    }

    public List<Recept> getRecepts() {
        return recepts;
    }

    public void setRecepts(List<Recept> recepts) {
        this.recepts = recepts;
    }

    @OneToMany(mappedBy = "creator")
    private List<Recept> recepts;
    public Creator() {
    }

    public Creator(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
