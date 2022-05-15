package class01;

public class Main {
    public static void main(String[] args) {
        SolarSystem FactorX = new SolarSystem();
        FactorX.sun = "1";
        FactorX.moon = "4";
        FactorX.planets = "2";
        FactorX.stars = "10000";

        // adding features to our sun
        FeatureSun xFact= new FeatureSun();
        xFact.color= "green";
        xFact.radius= "10000";
        xFact.heat= "1203oi4";
        
    }
}
