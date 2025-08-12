// Class to store width, height, depth, and color
public class Box {
    private double w;
    private double h;
    private double d;
    private String color;

    public Box(double w, double h, double d, String color) {
        this.w = w;
        this.h = h;
        this.d = d;
        this.color = color;
    }

    public double getW() {
        return w;
    }

    public double getH() {
        return h;
    }

    public double getD() {
        return d;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("A %s box of size %.2f x %.2f x %.2f", color, w, h, d);
    }
}
