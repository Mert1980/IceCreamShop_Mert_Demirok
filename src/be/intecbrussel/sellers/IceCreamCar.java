package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller {
    private PriceList priceList;
    private Stock stock;
    private double profit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Eatable orderCone(Cone.Flavor[] flavors) {

        if(prepareCone(flavors) == null){
            System.out.println("Not enough cones in stock");
            return null;
        }
        profit+= flavors.length * priceList.getBallPrice();
        return new Cone(flavors);
    }

    private Cone prepareCone(Cone.Flavor[] flavors){
        if(stock.getBalls() >= flavors.length && stock.getCones() > 0){
            stock.setBalls(flavors.length);
            stock.setCones(1);
            return new Cone(flavors);
        } else {
            return null;
        }
    }

    @Override
    public IceRocket orderIceRocket() {
        if(prepareRocket() == null){
            System.out.println("Not enough ice rockets in stock");
            return null;
        }
        profit+=priceList.getRocketPrice();
        return new IceRocket();
    }

    private IceRocket prepareRocket(){
        if(stock.getIceRockets() > 0){
            stock.setIceRockets(1);
            return new IceRocket();
        }
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        if(prepareMagnum(magnumType) == null){
            System.out.println("Not enough magnums in stock");
            return null;
        }
        profit+=priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    public Magnum prepareMagnum(Magnum.MagnumType magnumType){
        if(stock.getMagni() > 0){
            stock.setMagni(1);
            return new Magnum(magnumType);
        }
        return null;
    }

    @Override
    public double getProfit() {
        return this.profit;
    }

}
