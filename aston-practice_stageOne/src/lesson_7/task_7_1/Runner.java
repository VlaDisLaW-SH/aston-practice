package lesson_7.task_7_1;

import java.util.HashMap;
import java.util.Random;

public class Runner {

    private final static Integer TOTAL_COUNT_SECONDS = 120;

    public static void main(String[] args) {

        HashMap<String, Integer> goods = new HashMap<>();
        goods.put("Bread", 50);
        goods.put("Milk", 80);
        goods.put("Carrot", 40);
        goods.put("Fruits", 100);

        for (int i = 0; i < TOTAL_COUNT_SECONDS; i++) {
            int buyersCount = new Random().nextInt(3);

            for (int j = 0; j < buyersCount; j++) {
                Thread thread = new Thread(() -> {
                    Buyer buyer = new Buyer(goods);
                    buyer.enterToMarket();
                    buyer.takeBasket();
                    buyer.chooseGoods();
                    buyer.putGoodsToBasket();
                    buyer.goOut();
                });
                thread.start();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
