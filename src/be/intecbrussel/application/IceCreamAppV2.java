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
            Eatable order1 = iceCreamSeller.orderCone(balls);
            orders[0] = order1;
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            Eatable order2 = iceCreamSeller.orderCone(balls);
            orders[1] = order2;
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            Eatable order3 = iceCreamSeller.orderIceRocket();
            orders[2] = order3;
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            Eatable order4 = iceCreamSeller.orderIceRocket();
            orders[3] = order4;
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            Eatable order5 = iceCreamSeller.orderMagnum(Magnum.MagnumType.ALPINE_NUTS);;
            orders[4] = order5;
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            Eatable order6 = iceCreamSeller.orderMagnum(Magnum.MagnumType.BLACK_CHOCOLATE);
            orders[4] = order6;
        } catch (Exception e){
            e.printStackTrace();
        }
        for (Eatable iceCream : orders) {
            if(iceCream instanceof Exception){
                continue;
            }
            if(iceCream != null){
                iceCream.eat();
            }
        }
        System.out.println("Total Profit: " + iceCreamSeller.getProfit());
    }
}
