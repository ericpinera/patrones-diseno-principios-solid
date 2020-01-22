package patronesDiseno.behavioralPatterns.strategy;

public class WaterTransport implements TransportMedium {

    @Override
    public void transport() {
        System.out.println("I am transporting in water");
    }
}
