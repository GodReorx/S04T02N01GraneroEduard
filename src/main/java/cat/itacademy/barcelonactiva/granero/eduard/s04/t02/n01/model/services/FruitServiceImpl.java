package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.domain.Fruit;
import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class FruitServiceImpl implements FruitService{

    @Autowired
    private FruitRepository fruitRepository;
    @Override
    public Fruit add(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    @Override
    public Fruit update(Fruit fruit) {
        Optional<Fruit> fruitDb = this.fruitRepository.findById(fruit.getId());
        if(fruitDb.isPresent()){
            Fruit fruitUpdate = fruitDb.get();
            fruitUpdate.setId(fruit.getId());
            fruitUpdate.setName(fruit.getName());
            fruitUpdate.setQuantityKilos(fruit.getQuantityKilos());
            fruitRepository.save(fruitUpdate);
            return fruitUpdate;
        } else {
            throw new RuntimeException("Record not found with ID: " + fruit.getId() );
        }
    }

    @Override
    public void delete(long fruitId) {
        Optional<Fruit> fruitDb = this.fruitRepository.findById(fruitId);
        if(fruitDb.isPresent()){
            this.fruitRepository.deleteById(fruitId);
        } else {
            throw new RuntimeException("Record not found with ID: " + fruitId);
        }
    }

    @Override
    public Fruit getOne(long fruitId) {
        Optional<Fruit> fruitDb = this.fruitRepository.findById(fruitId);
        if(fruitDb.isPresent()){
            return fruitDb.get();
        } else {
            throw new RuntimeException("Record not found with ID: " + fruitId);
        }
    }

    @Override
    public List<Fruit> getAll() {
        return this.fruitRepository.findAll();
    }
}
