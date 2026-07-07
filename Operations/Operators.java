package Operations;

public class Operators {
    public static void main(String[] args) {
        int addend1 = 10, addend2 = 20, sum;
        sum = addend1 + addend2;
        System.out.println("Sum of: " + sum);
        int minuend = 30, subtrahend = 15, difference;
        difference = minuend - subtrahend;
        System.out.println("Difference of: " + difference);
        int multiplicand = 5, multiplier = 4, product;
        product = multiplicand * multiplier;
        System.out.println("Product of: " + product);
        float dividend = 17, divisor = 4;
        float floatQuotient = (float) dividend / divisor;
        System.out.println("Float Quotient of: " + floatQuotient);
        int remainder = (int) dividend % (int) divisor;
        System.out.println("Remainder of: " + remainder);
    }
}
