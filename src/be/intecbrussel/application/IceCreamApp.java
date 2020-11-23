package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {
        // compete part 1.4
        PriceList priceList = new PriceList(2, 1.5, 2.5);
        IceCreamSeller iceCreamSeller = new IceCreamSalon(priceList);

        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA};

        Eatable[] order = {iceCreamSeller.orderCone(flavors), iceCreamSeller.orderIceRocket(), iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUTS)};
        for (Eatable iceCream : order) {
            iceCream.eat();
        }
        System.out.println("Total Profit: " + iceCreamSeller.getProfit());
    }
}
