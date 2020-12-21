package ru.ssau.tk.Practice_SAS.Tasks;

public class Points {
    private Points() {
    }

    public static Point sum(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x + secondPoint.x, firstPoint.y + secondPoint.y, firstPoint.z + secondPoint.z);
    }

    public static Point subtract(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x - secondPoint.x, firstPoint.y - secondPoint.y, firstPoint.z - secondPoint.z);
    }

    public static Point divide(Point firstPoint, Point secondPoint) {
        if (secondPoint.x == 0 || secondPoint.y == 0 || secondPoint.z == 0) {
            throw new ArithmeticException("Zero");
        }
        return new Point(firstPoint.x / secondPoint.x, firstPoint.y / secondPoint.y, firstPoint.z / secondPoint.z);
    }

    public static Point multiply(Point firstPoint, Point secondPoint) {
        return new Point(firstPoint.x * secondPoint.x, firstPoint.y * secondPoint.y, firstPoint.z * secondPoint.z);
    }

    public static Point enlarge(Point point, double volume) {
        return new Point(point.x * volume, point.y * volume, point.z * volume);
    }

}
