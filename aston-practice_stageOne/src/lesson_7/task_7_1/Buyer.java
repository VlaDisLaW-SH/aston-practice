package lesson_7.task_7_1;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Buyer implements IBuyer, IUseBasket {

    private final HashMap<String, Integer> goods;
    private final HashMap<String, Integer> chooseGoods = new HashMap<>();
    private final HashMap<String, Integer> basket = new HashMap<>();
    private final Random random = new Random();

    public Buyer(HashMap<String, Integer> goods) {
        this.goods = goods;
    }

    @Override
    public void enterToMarket() {
        System.out.println("Buyer inter to market");
    }

    @Override
    public void chooseGoods() {
        int goodsCount = 1 + random.nextInt(4);

        List<String> keys = new ArrayList<>(goods.keySet());
        Collections.shuffle(keys);

        for (int j = 0; j < goodsCount; j++) {
            String key = keys.get(j);
            chooseGoods.put(key, goods.get(key));
            System.out.println("Buyer choose the good - " + key);

            try {
                Thread.sleep(500 + random.nextInt(1501));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void goOut() {
        System.out.println("Buyer go out of market");
    }

    @Override
    public void takeBasket() {
        System.out.println("Buyer take basket");

        try {
            Thread.sleep(500 + random.nextInt(1501));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void putGoodsToBasket() {
        chooseGoods.forEach((good, price) -> {
            basket.put(good, price);
            System.out.println("Buyer put " + good + " cost " + price + " of rubles in basket");
            try {
                Thread.sleep(500 + random.nextInt(1501));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
