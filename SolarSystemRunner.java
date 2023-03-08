public class SolarSystemRunner {
    public static void main(String[] args) {
        //celestial object demonstration
        CelestialObject celest = new CelestialObject();
        celest.orbitStar();
        CelestialObject celest2 = new CelestialObject(1000);
        celest2.absorbMaterial();

        //asteroid demonstration
        Asteroid aster = new Asteroid();
        System.out.println(aster.getShape());
        Asteroid aster2 = new Asteroid(200, "cylinder-y");
        aster2.developSentience();

        //moon demonstration
        Moon mun = new Moon();
        mun.causeTides();
        Moon mun2 = new Moon(3000, 700);
        mun2.escape();

        //planet demonstration
        Planet plant = new Planet();
        System.out.println(plant.getHasRing());
        Planet plant2 = new Planet(10000, true);
        System.out.println(plant2.getHasRing());

        //gas giant demonstration
        GasGiant gassy = new GasGiant();
        gassy.confuse15thCenturyScientists();
        GasGiant gassy2 = new GasGiant(99999, true, 6000);
        gassy2.absorbMaterial();

        //solid planet demonstration
        SolidPlanet sold = new SolidPlanet();
        sold.changeEnvironment();
        SolidPlanet sold2 = new SolidPlanet(5000, false, true);
        sold2.developLife();

        //shared functions demonstration
        CelestialObject[] thingies = {celest2, aster2, mun2, plant2, gassy2, sold2};
        for (CelestialObject x : thingies) {
            System.out.println(x);
            x.rotate();
        }
    }
}
