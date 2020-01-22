package patronesDiseno.behavioralPatterns.strategy;

public class StrategyPatternExample {
    public static void main(String[] args) {
        System.out.println("***Strategy Pattern Demo***");
        Vehicle vehicleContext = new Boat();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
        System.out.println("____________________________");

        vehicleContext = new Aeroplane();
        vehicleContext.showMe();
        vehicleContext.showTransportMedium();
    }
}
