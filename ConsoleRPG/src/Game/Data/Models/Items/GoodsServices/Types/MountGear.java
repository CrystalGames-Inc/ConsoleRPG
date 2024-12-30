package Game.Data.Models.Items.GoodsServices.Types;

import Game.Data.Models.Items.Item;

public class MountGear extends Item {

    public double weight;

    public MountGear(String name, int id, double cost, double weight) {
        super(name, id, cost);
        this.weight = weight;
    }
}