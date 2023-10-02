package Fabric;

import Interface.iGameItem;
import Product.EmeraldReward;

public class EmeraldGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new EmeraldReward();
    }
}
