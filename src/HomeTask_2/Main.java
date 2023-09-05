package HomeTask_2;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(2,6,"A");
        System.out.println(point);

        Figure triangle = new Figure("Triangle",3);
        triangle.getPoints()[0] = point;
        triangle.getPoints()[1] = new Point(3,9, "B");
        triangle.getPoints()[2] = new Point(0,0,"C");
        System.out.println(triangle);

//        Figure rectangle = new Figure(new Point(5,1), new Point(4,1), new Point(8,1));
//        System.out.println(rectangle);

        Figure rectangle = new Figure("Rectangle",4);
        rectangle.getPoints()[0] = new Point(3,9, "A");
        rectangle.getPoints()[1] = new Point(2,9, "B");
        rectangle.getPoints()[2] = new Point(1,5, "C");
        rectangle.getPoints()[3] = new Point(4,5, "D");
        System.out.println(rectangle);
        System.out.println();
        System.out.println(rectangle.getPoints()[0]);
    }
}
