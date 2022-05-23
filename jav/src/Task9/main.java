package Task9;
import Task8.CustomDouble;

public class main {
    public static void main(final String[] args) {
        try {
            final CustomDouble test1 = new CustomDouble(6, -0.5);
            final CustomDouble test2 = new CustomDouble(-2, 0.5);

            final Calculator calculator = new Calculator();

            System.out.println(calculator.operations(test1, '+', test2));
            System.out.println(calculator.operations(test1, '-', test2));
            System.out.println(calculator.operations(test1, '*', test2));
            System.out.println(calculator.operations(test1, '/', test2));
        }
        catch(final ArithmeticException error)
        {
            System.out.println(error.getMessage());
        }

    }
}
