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
    public Eatable orderCone(Cone.Flavor[] balls) throws NoMoreIceCreamException {
        if (stock.getBalls() >= balls.length) {
            if (stock.getCones() > 0) {
                return prepareCone(balls);
            } else {
                throw new NoMoreIceCreamException("No more Cones in stock");
            }
        } else {
            throw new NoMoreIceCreamException("Not enough Balls in stock");
        }
    }

    private Cone prepareCone(Cone.Flavor[] balls){
        stock.setBalls(balls.length);
        stock.setCones(1);
        profit+= balls.length * priceList.getBallPrice();
        return new Cone(balls);
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {
        if(stock.getIceRockets() > 0){
            return prepareRocket();
        }
        throw new NoMoreIceCreamException("No more Ice Rocket in stock");
    }

    private IceRocket prepareRocket(){
        profit+=priceList.getRocketPrice();
        stock.setIceRockets(1);
        return new IceRocket();
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) throws NoMoreIceCreamException {
        if(stock.getMagni() > 0) {
            return prepareMagnum(magnumType);
        }
        throw new NoMoreIceCreamException("No more Magnum in stock");
    }

    public Magnum prepareMagnum(Magnum.MagnumType magnumType){
        stock.setMagni(1);
        profit+=priceList.getMagnumPrice(magnumType);
        return new Magnum(magnumType);
    }

    @Override
    public double getProfit() {
        return this.profit;
    }
}
