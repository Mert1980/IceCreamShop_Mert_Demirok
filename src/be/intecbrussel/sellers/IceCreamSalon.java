package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList;
    private double totalProfit;

    public IceCreamSalon(PriceList priceList){
        this.priceList = priceList;
        this.totalProfit = 0;
    }


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        totalProfit+= flavors.length * priceList.getBallPrice();
        return new Cone(flavors);
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit+=priceList.getRocketPrice();
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        totalProfit+=priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
