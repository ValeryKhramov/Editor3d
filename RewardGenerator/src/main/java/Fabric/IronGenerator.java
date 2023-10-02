package Fabric;

import Interface.iGameItem;
import Product.IronReward;

public class IronGenerator extends ItemGenerator{
    @Override
    public iGameItem createItem() {
        return new IronReward();
    }
}
