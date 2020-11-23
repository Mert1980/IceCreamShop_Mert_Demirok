package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Magnum;

public class PriceList {
    double ballPrice;
    double rocketPrice;
    double magnumStandardPrice;

    // CONSTRUCTORS
    public PriceList(){

    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    // SETTERS
    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    // GETTERS
    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(Magnum.MagnumType magnumType) {
        return magnumStandardPrice * magnumType.getValue();
    }
}
