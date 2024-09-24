package nested_classes.startic_nested_classies.task;

public class Area {
    public double doubleCalc (final double length,final double  width) {
        final double a = length + 3;
        class Rectangle {
            double length;
            double width;
            public Rectangle(double length, double width) {
                this.length = length;
                this.width = width;
            }
            public double getArea() {
                return length * width;
            }
        }
        Rectangle rectangle = new Rectangle(2.2, 2.5);
        return rectangle.getArea();
    }
}
