package controllers;

import entities.Recept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.ReceptService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recepts")
public class ReceptController {
    private final ReceptService receptService;
    @Autowired
    public ReceptController(ReceptService receptService) {
        this.receptService = receptService;
    }

    @GetMapping("/recepts")
    public ResponseEntity<List<Recept>> getAllRecept(){
       List<Recept> recepts =  receptService.getRecepts();
       return new ResponseEntity<>(recepts, HttpStatus.OK);
    }
    @GetMapping("/recept/{id}")
    public ResponseEntity<Recept> getRecept(Long id){
        Recept recept = receptService.getRecept(id);
        return new ResponseEntity<>(recept,HttpStatus.OK);
    }
@PutMapping("/recept/{id}")
    public ResponseEntity<Recept> updateRecept(Recept recept){
        Recept updatedRecept = receptService.updateRecept(recept);
        return new ResponseEntity<>(updatedRecept,HttpStatus.OK);
    }
    @PostMapping("/recept/add")

    public ResponseEntity<?> addRecept(@RequestBody Recept recept){
        receptService.addRecept(recept);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public ResponseEntity<?> deleteRecept(Recept recept){
        receptService.deleteRecept(recept);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
