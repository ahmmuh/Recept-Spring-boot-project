package repository;

import entities.Recept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceptRepository extends JpaRepository<Recept, Long> {
    void deleteRecept(Recept recept);
}
