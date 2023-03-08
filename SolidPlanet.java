public class SolidPlanet extends Planet {
    //unique attribute
    private boolean habitable;

    //constructors:
    public SolidPlanet() {
        super();
        habitable = false;
    }
    public SolidPlanet(int size, boolean hasRing, boolean habitable) {
        super(size, hasRing);
        this.habitable = habitable;
    }

    //accessor and mutator:
    public boolean getHabitable() {
        return habitable;
    }
    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    //shared methods:
    public String toString() {
        return "I'm a solid planet!";
    }
    public void rotate() {
        super.rotate();
        System.out.println("Very standard, boring rotation.");
    }

    //unique methods:
    public void changeEnvironment() {
        double rand = Math.random();
        if (rand < 0.25) {
            System.out.println("The solid planet becomes habitable!");
            habitable = true;
        } else if (rand < 0.5) {
            System.out.println("The solid planet becomes rocky.");
            habitable = false;
        } else if (rand < 0.75) {
            System.out.println("The solid planet becomes barren.");
            habitable = false;
        } else {
            System.out.println("The solid planet becomes volcanic");
            habitable = false;
        }
    }
    public void developLife() {
        if (habitable == true) {
            System.out.println("The solid planet develops life.");
        } else {
            System.out.println("The solid planet is incapable of developing life.");
        }
    }
}
