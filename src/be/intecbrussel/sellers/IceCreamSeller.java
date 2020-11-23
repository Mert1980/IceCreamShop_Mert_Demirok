package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public interface IceCreamSeller extends Profitable{
    Eatable orderCone(Cone.Flavor[] flavors);
    IceRocket orderIceRocket();
    Magnum orderMagnum(Magnum.MagnumType magnumType);
}
