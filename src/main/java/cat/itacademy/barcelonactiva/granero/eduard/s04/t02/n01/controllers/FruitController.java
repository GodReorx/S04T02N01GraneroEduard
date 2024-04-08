package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.controllers;

import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruits")
public class FruitController {
    @Autowired
    FruitService fruitService;

    @GetMapping("/getOne/{fruitId}")
    public ResponseEntity<Fruit> getOneFruit(@PathVariable long fruitId){
        return ResponseEntity.ok().body(this.fruitService.getOne(fruitId));
    }

    @GetMapping("/getAll ")
    public ResponseEntity<List<Fruit>> getAllFruit(){
        return ResponseEntity.ok().body(this.fruitService.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity <Fruit> addFruit (@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(this.fruitService.add(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok().body(this.fruitService.update(fruit));
    }

    @DeleteMapping("/delete/{fruitId}")
    public HttpStatus deleteFruit(@PathVariable long fruitId){
        this.fruitService.delete(fruitId);
        return HttpStatus.OK;
    }
}
