public class AreaCalculator {

    public static double calculateRectangleArea(double a, double b) {
        return a * b;
    }

    public static double calculateRectangleArea(int a, int b) {
        return calculateRectangleArea((double) a, b);
    }

    public static double calculateCircleArea(double r) {
        return Math.PI * r * r;
    }

    public static double calculateCircleArea(int r) {
        return calculateCircleArea((double) r);
    }

    public static double calculateTriangleArea(double a, double b) {
        return a * b / 2;
    }

    public static double calculateTriangleArea(int a, int b) {
        return (int) calculateTriangleArea((double) a, b);
    }

}
