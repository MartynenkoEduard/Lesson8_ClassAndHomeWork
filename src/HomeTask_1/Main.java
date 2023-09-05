package HomeTask_1;

public class Main {

    public static void main(String[] args) {
    Fraction fraction = new Fraction(25, 5);
        System.out.println(fraction);
        System.out.println( Fraction.BackFraction(fraction));
        fraction = Fraction.ReduceFraction(fraction);
        System.out.println(fraction);

        System.out.println();
        Fraction fraction1 = Fraction .Subtraction (new Fraction(5,2), new Fraction(1,2));
        System.out.println(fraction1);
        fraction1 = Fraction.ReduceFraction(fraction1);
        System.out.println(fraction1);



    }
}