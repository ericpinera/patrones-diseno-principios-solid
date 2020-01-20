package patronesDiseno.structuralPatterns.decorator.example2;

public class PaintDecorator extends AbstractDecorator {
    @Override
    public void makeHouse() {
        super.makeHouse();
        System.out.println("***Paint decorator is in action now ***");
        paintTheHouse();
    }

    private void paintTheHouse() {
        System.out.println("Now I am painting the house");
    }
}
