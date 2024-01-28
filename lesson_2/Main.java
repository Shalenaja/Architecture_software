import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<GenItem> fabricList = new ArrayList<>();
        fabricList.add(new GenGoldReward());
        fabricList.add(new GenGemReward());
        fabricList.add(new GenSilverReward());
        fabricList.add(new GenRubyReward()); // добавлен новый генератор
        createAndOpenReward(fabricList); // добавлен новый генераторНить
    }

    static void createAndOpenReward(List<GenItem> fabricList) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            IGameItem fabric = fabricList.get(Math.abs(rnd.nextInt() % fabricList.size())).createItem();
            fabric.open();
        }
    }
}
