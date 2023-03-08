public class CelestialObject {
    //unique attribute
    private int size;

    //constructors:
    public CelestialObject() {
        size = 1;
    }
    public CelestialObject(int size) {
        this.size = size;
    }

    //accessor and mutator:
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    //shared methods:
    public String toString() {
        return "I'm a celestial object!";
    }
    public void rotate() {
        System.out.println("The celestial object rotates.");
    }

    //unique methods:
    public void absorbMaterial() {
        size = (int) (size*1.1);
        System.out.println("This object gained mass, it's now " + size + " pounds.");
    }
    public void orbitStar() {
        System.out.println("Star sucessfully orbited.");
    }
}