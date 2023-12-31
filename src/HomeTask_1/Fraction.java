package HomeTask_1;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public static Fraction BackFraction(Fraction fraction) {
        if (fraction.numerator == 0) {
            return new Fraction(fraction.denominator, 1);
        } else {
            return new Fraction(fraction.denominator, fraction.numerator);
        }
    }

    public static Fraction BackFraction(int numerator, int denominator) {
        if (numerator == 0) {
            return new Fraction(denominator, 1);
        } else {
            return new Fraction(denominator, numerator);
        }
    }

    @Override
    public String toString() {
        return
                "numerator : " + numerator +
                        ", denominator: " + denominator;
    }

    public static Fraction ReduceFraction(Fraction fraction) {
        Fraction newFraction = new Fraction();

        int a = fraction.numerator < fraction.denominator ? fraction.numerator : fraction.denominator;
        int b = fraction.numerator > fraction.denominator ? fraction.numerator : fraction.denominator;

        for (int i = b; i >= 2; ) {
            if ((a % i == 0) && (b % i == 0)) {
                a /= i;
                b /= i;
            } else {
                i--;
            }
        }
        return new Fraction(b, a);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void Add(Fraction fraction) {
        Fraction newFraction = new Fraction(
                this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator,
                this.denominator * fraction.getDenominator());
        this.numerator = newFraction.getNumerator();
        this.denominator = newFraction.getDenominator();

        this.numerator = Fraction.ReduceFraction(newFraction).numerator;
        this.denominator = Fraction.ReduceFraction(newFraction).denominator;
    }

    public static Fraction Add(Fraction fraction1, Fraction fraction2) {
        return new Fraction(
                fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator(),
                fraction1.getDenominator() * fraction2.getDenominator());
    }

    public Fraction sum(Fraction fraction) {
        Fraction newFraction = new Fraction();
        if (this.denominator == fraction.denominator) {
            return new Fraction(this.numerator + fraction.denominator, denominator);
        } else {
            return new Fraction(this.numerator * fraction.denominator + fraction.denominator * this.numerator,
                    this.denominator * fraction.denominator);
        }
    }

    public static Fraction Subtraction(Fraction fraction1, Fraction fraction2) {
        return new Fraction(
                fraction1.getNumerator() * fraction2.getDenominator() - fraction2.getNumerator() * fraction1.getDenominator(),
                fraction1.getDenominator() * fraction2.getDenominator());
    }

    public Fraction subtract(Fraction fraction) {
        Fraction newFraction = new Fraction();
        if (this.denominator == fraction.denominator) {
            return new Fraction(this.numerator - fraction.denominator, denominator);
        } else {
            return new Fraction(this.numerator * fraction.denominator - fraction.denominator * this.numerator,
                    this.denominator * fraction.denominator);
        }
    }

}


