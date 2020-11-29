package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList(2, 1.5, 2.5);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);
        Cone.Flavor[] balls = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA};

        Eatable order1 = iceCreamSeller.orderCone(balls);
        Eatable order2 = iceCreamSeller.orderIceRocket();
        Eatable order3 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUTS);

        Eatable[] orders = {order1, order2, order3};

        for (Eatable iceCream : orders) {
            iceCream.eat();
        }
        System.out.println("Total Profit: " + "€"+iceCreamSeller.getProfit());
    }
}
