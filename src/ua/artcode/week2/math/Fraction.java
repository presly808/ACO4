package ua.artcode.week2.math;

/**
 * Created by serhii on 15.02.15.
 */
public class Fraction {

    private int dividend;
    private int divisor;

    public Fraction(int dividend, int divisor) {
        this.dividend = dividend;
        this.divisor = divisor;
    }

    // 45 / 90 = 1/2
    // 1/2  +  2/5 = 5 + 4 /10 = 9/10
    public Fraction add(Fraction input){
        int newDividend = this.dividend * input.divisor +
                input.dividend * this.divisor;
        int newDivisor = this.divisor * input.divisor;
        return new Fraction(newDividend, newDivisor);

    }

    public void simplify(){
        int gcd = gcd(dividend, divisor);
        this.dividend /= gcd;
        this.divisor /= gcd;//divisor = divisor / gcd
    }

    // this + input
    public Fraction multiply(Fraction input){
        int dividendRes = this.dividend * input.dividend;
        int divisorRes = this.divisor * input.divisor;
        return new Fraction(dividendRes, divisorRes);
    }

    public int gcd(int d1, int d2){
        int res = d1 % d2;
        if(res == 0){
            return d2;
        } else {
            return gcd(d2, res);
        }

    }


    public String format(){
        return String.format("[%d/%d]", dividend, divisor);
    }
}
