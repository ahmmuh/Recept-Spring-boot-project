package controllers;

import entities.Creator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.CreateService;

import java.util.List;

@RestController

public class CreatorController {
    private final CreateService createService;

    @Autowired
    public CreatorController(CreateService createService) {
        this.createService = createService;
    }

    @GetMapping("/creators")
    public ResponseEntity<List<Creator>> getAllCreators(){
        List<Creator> creators = createService.getAllCreators();
        return new ResponseEntity<>(creators, HttpStatus.OK);
    }

    @GetMapping("/creator/{id}")
    public ResponseEntity<Creator> getCreator(@PathVariable("id") long id){
        Creator creator = createService.getCreator(id);
        return  new ResponseEntity<>(creator, HttpStatus.OK);
    }

    @PutMapping("/creator/{id}")
    public ResponseEntity<Creator> updateCreator(Creator creator){
        Creator updatedCreator = createService.updateCreator(creator);
        return new ResponseEntity<>(updatedCreator,HttpStatus.OK);
    }
    @PostMapping("/creator/add")
    public ResponseEntity<?> addCreator(@RequestBody Creator creator){
        createService.addCreator(creator);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/creator/{id}")
    public ResponseEntity<?> deleteCreator( @PathVariable("id") Long id){
        createService.deleteCreator(id);
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
