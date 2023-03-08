public class Moon extends CelestialObject{
    //unique attribute
    private int value; //in dollarydoos

    //constructors:
    public Moon() {
        super();
        value = 0;
    }
    public Moon(int size, int value) {
        super(size);
        this.value = value;
    }

    //accessor and mutator:
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    //shared methods:
    public String toString() {
        return "I'm a moon!";
    }
    public void rotate() {
        super.rotate();
        System.out.println("The moon is rotating pretty quickly due to its smallness.");
    }

    //unique methods:
    public void causeTides() {
        System.out.println("The moon causes a planet to have tides.");
    }
    public void escape() {
        System.out.println("The moon escapes the gravitational pull of the planet it was orbiting and is now free!");
    }
}
