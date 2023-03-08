public class Planet extends CelestialObject{
    //unique attribute
    private boolean hasRing; //like a ring of debris, like around saturn

    //constructors:
    public Planet() {
        super();
        hasRing = false;
    }
    public Planet(int size, boolean hasRing) {
        super(size);
        this.hasRing = hasRing;
    }

    //accessor and mutator:
    public boolean getHasRing() {
        return hasRing;
    }
    public void setHasRing(boolean hasRing) {
        this.hasRing = hasRing;
    }

    //shared methods:
    public String toString() {
        return "I'm a planet!";
    }
    public void rotate() {
        super.rotate();
        System.out.println("The planet is a pretty slow rotator, though.");
    }
    
    //unique methods:
    public Moon getAMoon() {
        return new Moon();
    }
    public void explode() {
        System.out.println("The planet goes boom!");
    }
}
