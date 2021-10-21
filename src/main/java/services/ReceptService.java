package services;

import entities.Recept;
import org.springframework.stereotype.Service;
import repository.ReceptRepository;

import java.util.List;

@Service
public class ReceptService {
    private final ReceptRepository receptRepository;

    public ReceptService(ReceptRepository receptRepository) {
        this.receptRepository = receptRepository;
    }
    public List<Recept> getRecepts(){
        return receptRepository.findAll();
    }
    public Recept getRecept(Long id){
        return receptRepository.getById(id);
    }

    public Recept updateRecept(Recept recept){
        return receptRepository.save(recept);
    }
    public void addRecept(Recept recept){
        receptRepository.save(recept);
    }

    public void deleteRecept(Recept recept){
        receptRepository.deleteRecept(recept);
    }
}
