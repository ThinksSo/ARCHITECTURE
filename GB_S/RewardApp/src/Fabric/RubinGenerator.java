package Fabric;

import Interface.iGameItem;
import Product.Rubin;

public class RubinGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Rubin();
    }
    
}
