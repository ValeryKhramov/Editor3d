package Fabric;

import Interface.iGameItem;
import Product.CoalReward;
import Product.CopperReward;

public class CopperGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new CopperReward();
    }
}
