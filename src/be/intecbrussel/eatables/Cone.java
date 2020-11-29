package be.intecbrussel.eatables;

public class Cone implements Eatable{
    private Flavor[] balls;

    public Cone(){
        this.balls[0] = Flavor.CHOCOLATE;
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
        text.deleteCharAt(text.length()-2);
        System.out.println(text.toString());
    }

    public enum Flavor{
        STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
    }
}
