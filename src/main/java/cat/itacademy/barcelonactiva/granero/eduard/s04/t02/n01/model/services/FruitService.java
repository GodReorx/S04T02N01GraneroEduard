package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.services;

import cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.domain.Fruit;

import java.util.List;

public interface FruitService {
    Fruit add (Fruit fruit);
    Fruit update (Fruit fruit);
    void delete(long fruitId);
    Fruit getOne(long fruitId);
    List<Fruit> getAll();
}
