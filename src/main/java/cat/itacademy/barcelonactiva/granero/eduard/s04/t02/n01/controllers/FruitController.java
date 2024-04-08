package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class FruitController {
    @Autowired
    FruitService fruitService;

    @GetMapping("/fruits/getOne/{id}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable long fruitId){
        return ResponseEntity.ok().body(this.fruitService.getOne(fruitId));
    }

    @GetMapping("/fruits/getAll")
    public ResponseEntity<List<Fruit>> getAllFruit(){
        return ResponseEntity.ok().body(this.fruitService.getAll());
    }
    @PostMapping("/fruits/add")
    public ResponseEntity <Fruit> addFruit (@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(this.fruitService.add(fruit));
    }

    @PutMapping("/fruits/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(this.fruitService.update(fruit));
    }

    @DeleteMapping("/fruits/delete/{id}")
    public HttpStatus deleteFruit(@PathVariable long fruitId){
        this.fruitService.delete(fruitId);
        return HttpStatus.OK;
    }
}
