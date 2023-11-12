package Fabric;

import Interface.iGameItem;


public abstract class ItemGenerator {
    public abstract iGameItem createItem();

    public void openReward() {
        createItem().open();
    }

    public ItemGenerator get(int nextInt) {
        return null;
    }
}
