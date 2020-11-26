package be.intecbrussel.eatables;

public class Magnum implements Eatable{
    private MagnumType type;

    public Magnum(){
        this(MagnumType.MILK_CHOCOLATE);
    }

    public Magnum(MagnumType type){
        this.type = type;
    }

    public MagnumType getType(){
        return this.type;
    }

    @Override
    public void eat() {
        System.out.println("You eat " + this.type);
    }

    public enum MagnumType {
        MILK_CHOCOLATE(1),
        WHITE_CHOCOLATE(0.75),
        BLACK_CHOCOLATE(1.25),
        ALPINE_NUTS(1.5),
        ROMANTICS_STRAWBERRIES(1.5);

        private double value;

        private MagnumType(double value){
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
}
