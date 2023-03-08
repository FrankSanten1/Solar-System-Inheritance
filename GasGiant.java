public class GasGiant extends Planet {
    //unique attribute
    private int gasAmount;

    //constructors:
    public GasGiant() {
        super();
        gasAmount = 1;
    }
    public GasGiant(int size, boolean hasRing, int gasAmount) {
        super(size, hasRing);
        this.gasAmount = gasAmount;
    }

    //accessor and mutator:
    public int getGasAmount() {
        return gasAmount;
    }
    public void setGasAmount(int gasAmount) {
        this.gasAmount = gasAmount;
    }

    //shared methods:
    public String toString() {
        return "I'm a gas giant!";
    }
    public void rotate() {
        super.rotate();
        System.out.println("It at least has some neat swirlies.");
    }

    //unique methods:
    public void fling() {
        System.out.println("The gas giant flings an asteroid far away.");
    }
    public void confuse15thCenturyScientists() {
        System.out.println("The 15th century scientists have no idea what this is.");
    }
}
