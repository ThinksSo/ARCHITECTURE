package Fabric;

import Interface.iGameItem;
import Product.Tytan;

public class TytanGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Tytan();
    }
    
}
