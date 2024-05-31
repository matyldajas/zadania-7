public class Ractangle implements Figure {
    public double sideA;
    public double sideB;

    public Ractangle(double sideA, double sideB) {
        this.sideA=sideA;
        this.sideB=sideB;
    }

    @Override
    public double getPerimeter() {
        return 2*(sideA+sideB);
    }

    @Override
    public double getArea() {
        return sideA*sideB;
    }

    @Override
    public String getType() {

        return "ractangle";
    }
}
