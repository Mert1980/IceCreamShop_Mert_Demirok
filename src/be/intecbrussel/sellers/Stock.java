package be.intecbrussel.sellers;

public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magni;

    // CONSTRUCTORS
    public Stock(int iceRockets, int cones, int balls, int magni) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magni = magni;
    }

    // SETTERS
    public void setIceRockets(int iceRockets) {
        this.iceRockets-= iceRockets;
    }

    public void setCones(int cones) {
        this.cones-= cones;
    }

    public void setBalls(int balls) {
        this.balls-=balls;
    }

    public void setMagni(int magni) {
        this.magni-= magni;
    }

    // GETTERS
    public int getIceRockets() {
        return iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public int getBalls() {
        return balls;
    }

    public int getMagni() {
        return magni;
    }
}

