package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(2, 1.5, 2.5);
        Stock stock = new Stock(2, 2, 6, 2);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);

        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA};

        Eatable order1 = iceCreamSeller.orderCone(flavors);
        Eatable order2 = iceCreamSeller.orderCone(flavors);
        Eatable order3 = iceCreamSeller.orderCone(flavors); // out of stock
        Eatable order4 = iceCreamSeller.orderIceRocket();
        Eatable order5 = iceCreamSeller.orderIceRocket();
        Eatable order6 = iceCreamSeller.orderIceRocket(); // out of stock
        Eatable order7 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUTS);
        Eatable order8 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ROMANTICS_STRAWBERRIES);
        Eatable order9 = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACK_CHOCOLATE); // out of stock

        Eatable[] orders = {order1, order2, order3, order4, order5, order6, order7, order8, order9};
        for (Eatable iceCream : orders) {
            if(iceCream != null){
                iceCream.eat();
            }
        }
        System.out.println("Total Profit: " + iceCreamSeller.getProfit());
    }
}
