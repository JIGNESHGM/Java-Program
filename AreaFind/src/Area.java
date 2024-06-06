public class Area {
    private double length;
    private double breadth;

    
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public double getArea() {
        return length * breadth;
    }
}
