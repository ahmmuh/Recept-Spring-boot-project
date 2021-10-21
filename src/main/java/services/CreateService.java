package services;

import entities.Creator;
import org.springframework.stereotype.Service;
import repository.CreatorRepository;

import java.util.List;

@Service
public class CreateService {
    private final CreatorRepository creatorRepository;

    public CreateService(CreatorRepository creatorRepository) {
        this.creatorRepository = creatorRepository;
    }
    public List<Creator> getAllCreators(){
        return creatorRepository.findAll();
    }

    public Creator getCreator(Long id){
        return creatorRepository.getById(id);
    }

    public void addCreator(Creator creator){
        creatorRepository.save(creator);
    }
    public Creator updateCreator(Creator creator){
       return creatorRepository.save(creator);
    }
    public void deleteCreator(Long id){
        creatorRepository.deleteCreator(id);
    }
}
