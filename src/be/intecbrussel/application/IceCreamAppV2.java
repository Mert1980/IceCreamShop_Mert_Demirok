package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.sellers.*;

public class IceCreamAppV2 {
    public static void main(String[] args) {
        PriceList priceList = new PriceList(2, 1.5, 2.5);
        Stock stock = new Stock(1, 1, 8, 1);
        IceCreamSeller iceCreamSeller = new IceCreamCar(priceList, stock);

        Cone.Flavor[] balls = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA};

        Eatable[] orders = new Eatable[10];

        try {
            Eatable order = iceCreamSeller.orderCone(balls);
            orders[0] = order;
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Eatable order = iceCreamSeller.orderIceRocket();
            orders[1] = order;
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Eatable order = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUTS);;
            orders[2] = order;
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Eatable order = iceCreamSeller.orderCone(balls);
            orders[3] = order;
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Eatable order = iceCreamSeller.orderIceRocket();
            orders[4] = order;
        } catch (Exception e){
            e.printStackTrace();
        }

        try {
            Eatable order = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACK_CHOCOLATE);
            orders[5] = order;
        } catch (Exception e){
            e.printStackTrace();
        }

        for (Eatable iceCream : orders) {
            if(iceCream != null){
                iceCream.eat();
            }
        }
        System.out.println("Total Profit: " + "€"+iceCreamSeller.getProfit());
    }
}
