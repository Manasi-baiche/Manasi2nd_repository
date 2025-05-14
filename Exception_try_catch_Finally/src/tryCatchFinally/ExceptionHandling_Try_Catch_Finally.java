package tryCatchFinally;

public class ExceptionHandling_Try_Catch_Finally {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 0};
        try {
            int result = numbers[1] / numbers[2]; // division by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}
