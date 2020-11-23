package be.intecbrussel.application;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Magnum;

public class IceCreamApp {
    public static void main(String[] args) {
        Eatable iceCream = new Magnum();
        iceCream.eat();

        Eatable iceCream2 = new Magnum(Magnum.MagnumType.ALPINE_NUTS);
        iceCream2.eat();

        Cone.Flavor[] flavors = {Cone.Flavor.BANANA, Cone.Flavor.CHOCOLATE, Cone.Flavor.MOKKA};
        Eatable iceCream3 = new Cone(flavors);
        iceCream3.eat();
    }
}
