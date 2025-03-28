public class TestRegularPolygon {

    public static void main(String[] args) {
        // Create three RegularPolygon objects
        RegularPolygon polygon1 = new RegularPolygon(); // Using no-arg constructor
        RegularPolygon polygon2 = new RegularPolygon(6, 4); // Using RegularPolygon(6, 4)
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8); // Using RegularPolygon(10, 4, 5.6, 7.8)

        // Display the perimeter and area for each polygon
        System.out.println("Polygon 1 (default constructor):");
        System.out.println("Perimeter: " + polygon1.getPerimeter());
        System.out.println("Area: " + polygon1.getArea());

        System.out.println("\nPolygon 2 (6 sides, side length 4):");
        System.out.println("Perimeter: " + polygon2.getPerimeter());
        System.out.println("Area: " + polygon2.getArea());

        System.out.println("\nPolygon 3 (10 sides, side length 4, center at (5.6, 7.8)):");
        System.out.println("Perimeter: " + polygon3.getPerimeter());
        System.out.println("Area: " + polygon3.getArea());
    }
}
