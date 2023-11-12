import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabric.BronzeGenerator;
import Fabric.GenGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.PlatinumGenerator;
import Fabric.RubinGenerator;
import Fabric.SilverGenerator;
import Fabric.TytanGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator generator = new GenGenerator();
        generator.openReward();

        List<ItemGenerator> generators = new ArrayList<>();

        generators.add(new GenGenerator());
        generators.add(new GoldGenerator());
        generators.add(new SilverGenerator());
        generators.add(new BronzeGenerator());
        generators.add(new PlatinumGenerator());
        generators.add(new RubinGenerator());
        generators.add(new TytanGenerator());

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            generators.get(random.nextInt(generators.size())).openReward();
        }

    }
}
