public class Asteroid extends CelestialObject {
    //unique attribute
    private String shape;

    //constructors:
    public Asteroid() {
        super();
        shape = "boring. mid.";
    }
    public Asteroid(int size, String shape) {
        super(size);
        this.shape = shape;
    }

    //accessor and mutator:
    public String getShape() {
        return shape;
    }
    public void setShape(String shape) {
        this.shape = shape;
    }

    //shared methods:
    public String toString() {
        return "I'm an asteroid!";
    }
    public void rotate() {
        super.rotate();
        System.out.println("The asteroid gets funky with those spins.");
    }

    //unique methods:
    public void crash() {
        System.out.println("The asteroid crashes into something and explodes.");
    }
    public void developSentience() {
        System.out.println("The asteroid is now sentient. Soon it shall conquer the galaxy.");
    }
}
