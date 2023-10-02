import Fabric.*;
import Product.ItemReward;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemGenerator f1 = new GemGenerator(); // 1
        ItemGenerator f2 = new GoldGenerator(); // 3
        ItemGenerator f3 = new SilverGenerator(); // 10
        ItemGenerator f4 = new BronzeGenerator(); // 10
        ItemGenerator f5 = new CoalGenerator(); // 10
        ItemGenerator f6 = new CopperGenerator(); // 10
        ItemGenerator f7 = new EmeraldGenerator(); // 10
        ItemGenerator f8 = new IronGenerator(); // 10
        // 64

        List<ItemGenerator> itemGeneratorList = new ArrayList<>();
        itemGeneratorList.add(f1);
        itemGeneratorList.add(f2);
        itemGeneratorList.add(f3);
        itemGeneratorList.add(f4);
        itemGeneratorList.add(f5);
        itemGeneratorList.add(f6);
        itemGeneratorList.add(f7);
        itemGeneratorList.add(f8);

        //Random random = ThreadLocalRandom.current();
        Random random = new Random();

        for (int i = 0; i <20; i++) {
            int ratio = random.nextInt(1,65);
            if(ratio == 1){itemGeneratorList.get(0).openReward();}
            if(ratio > 1 && ratio <= 4){itemGeneratorList.get(1).openReward();}
            if(ratio > 4 && ratio <= 14){itemGeneratorList.get(2).openReward();}
            if(ratio > 14 && ratio <= 24){itemGeneratorList.get(3).openReward();}
            if(ratio > 24 && ratio <=34){itemGeneratorList.get(4).openReward();}
            if(ratio > 34 && ratio <=44){itemGeneratorList.get(5).openReward();}
            if(ratio > 44 && ratio <=54){itemGeneratorList.get(6).openReward();}
            if(ratio > 54 && ratio <=64){itemGeneratorList.get(7).openReward();}
        }



    }



}
