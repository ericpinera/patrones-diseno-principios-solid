package patronesDiseno.behavioralPatterns.strategy;

public abstract class Vehicle {
    TransportMedium transportMedium;

    public void showTransportMedium(){
        transportMedium.transport();
    }

    public void commonJob(){
        System.out.println("We all can be used to transport");
    }

    public abstract void showMe();
}
