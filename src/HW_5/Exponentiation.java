package HW_5;

public class Exponentiation {

    public double exp(int number, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent > 0) {
            return number * exp(number, --exponent);
        } else {
            return 1/(exp(number, -exponent));
        }
    }
}
