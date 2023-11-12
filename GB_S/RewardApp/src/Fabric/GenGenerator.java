package Fabric;

import Interface.iGameItem;
import Product.Gen;

public class GenGenerator extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gen();
    }
    
}
