package be.intecbrussel.eatables;

public class Cone implements Eatable{
    Flavor[] balls;

    public Cone(){
        this.balls = new Flavor[8];
    }

    public Cone(Flavor[] flavors){
        this.balls = flavors;
    }

    @Override
    public void eat() {
        StringBuilder text = new StringBuilder();
        text.append("You eat cone with flavors; ");
        for (Flavor flavor:balls){
            text.append(flavor).append(", ");
        }
        System.out.println(text.toString());
    }

    public enum Flavor{
        STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
    }
}
