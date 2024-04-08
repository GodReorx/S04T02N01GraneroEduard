package cat.itacademy.barcelonactiva.granero.eduard.s04.t02.n01.model.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantityKilos")
    private int quantityKilos;

    public Fruit() {

    }

    public Fruit(String name, int quantityKilos){
        this.name = name;
        this.quantityKilos = quantityKilos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityKilos() {
        return quantityKilos;
    }

    public void setQuantityKilos(int quantityKilos) {
        this.quantityKilos = quantityKilos;
    }

    @Override
    public String toString() {
        return "Fruit [ID: " + id + ", Name: " + name + ", Quantity Kilos: " + quantityKilos;
    }
}
