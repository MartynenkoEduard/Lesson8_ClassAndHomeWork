package HomeTask_3;

public class Main {
    public static void main(String[] args) {
        Matrix m1 = new Matrix(2);
        Matrix m2 = new Matrix(2);
        Matrix m4 = new Matrix(2);

        m1.matrix[0][0]= 1;
        m1.matrix[0][1]= 2;
        m1.matrix[1][0]= 3;
        m1.matrix[1][1]= 5;

        m2.matrix[0][0]= 2;
        m2.matrix[0][1]= 6;
        m2.matrix[1][0]= 3;
        m2.matrix[1][1]= 7;

        Matrix m3 = Matrix.sum(m1,m2);
        m3.print();

        m1.subtract(m2);
        m1.print();

        m2.multiplyBy(2);
        m2.print();

        m4.matrix = m2.matrix.clone();
        m4.print();
        m3.print();
        System.out.println( m3.isIdentity(m4) );
    }


}
