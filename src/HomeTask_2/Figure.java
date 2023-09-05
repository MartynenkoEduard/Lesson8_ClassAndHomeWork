package HomeTask_2;

import java.util.Arrays;

public class Figure {
    private Point[] points;
    private String title;

    public Point[] getPoints() {
        return points;
    }

    public void setPoints(Point[] points) {
        this.points = points;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Figure(String title,Point point1, Point point2, Point point3) {
        points = new Point[3];
        points[0] = point1;
        points[1] = point2;
        points[2] = point3;
        setTitle(title);


    }


    public Figure(String title, int pointsNumber) {
        points = new Point[pointsNumber];
        setTitle(title);
    }

    public double LengthSide(Point point1, Point point2) {
        double kat1, kat2;
        kat1 = Math.abs(point1.getX() - point2.getX());
        kat2 = Math.abs(point1.getY() - point2.getY());

        return Math.sqrt(kat1 * kat1 + kat2 * kat2);
    }

    public double PerimeterCalculator() {
        double perimeter = 0;
        if (points.length == 3)
            if (checkTriangle()) {
                for (int i = 0; i < points.length; i++) {
                    perimeter += this.LengthSide(points[i], points[(i + 1) % points.length]);
                }
            } else {
                perimeter = -1;
            }
        if (points.length == 4)
            for (int i = 0; i < points.length; i++) {
                perimeter += this.LengthSide(points[i], points[(i + 1) % points.length]);
            }
        return perimeter;
    }

    @Override
    public String toString() {

        String result = "\n" +  this.title + "\n";
        for (Point point : points) {
            result += point + "\n";
        }
        result += "Perimeter: " + String.format("%5.2f", PerimeterCalculator());
        return result;
    }

    public boolean checkTriangle() {
        boolean result = true;
        if (points[0].getX() == points[1].getX() && points[0].getX() == points[2].getX()
                || points[0].getY() == points[1].getY() && points[0].getY() == points[2].getY()) {
            result = false;
        }
        return result;
    }
}
