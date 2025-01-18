package SpiritEngine.Data.Models.Items.GoodsServices.Types;

import SpiritEngine.Data.Models.Items.Item;

public class Drink extends Item {

    double weight;

    public Drink(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}