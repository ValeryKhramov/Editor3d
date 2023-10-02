package Fabric;

import Interface.iGameItem;
import Product.CoalReward;

public class CoalGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new CoalReward();
    }
}
