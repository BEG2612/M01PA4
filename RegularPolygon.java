public class RegularPolygon {

    // Private data fields
    private int n;      // number of sides
    private double side;  // length of each side
    private double x;    // x-coordinate of the center
    private double y;    // y-coordinate of the center

    // No-arg constructor that creates a regular polygon with default values
    public RegularPolygon() {
        this.n = 3;      // Default number of sides (triangle)
        this.side = 1.0;  // Default side length
        this.x = 0.0;    // Default x-coordinate
        this.y = 0.0;    // Default y-coordinate
    }

    // Constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0)
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    // Constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    // Accessor methods (getters)
    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Mutator methods (setters)
    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Method to calculate the perimeter of the polygon
    public double getPerimeter() {
        return n * side;
    }

    // Method to calculate the area of the polygon
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

    // Main method to test the RegularPolygon class
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(5, 3, 2, 3);

        System.out.println("Polygon 1: ");
        System.out.println("Sides: " + polygon1.getN() + ", Side Length: " + polygon1.getSide());
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());

        System.out.println("\nPolygon 2: ");
        System.out.println("Sides: " + polygon2.getN() + ", Side Length: " + polygon2.getSide());
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());

        System.out.println("\nPolygon 3: ");
        System.out.println("Sides: " + polygon3.getN() + ", Side Length: " + polygon3.getSide());
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}
