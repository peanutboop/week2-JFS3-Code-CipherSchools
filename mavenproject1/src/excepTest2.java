import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
public class excepTest2 {
    int n1, n2, result;
    Scanner sc = new Scanner(System.in);

    void calc() {
        try {
            System.out.println("Enter the first number");
            n1 = sc.nextInt();

            System.out.println("Enter the second number");
            n2 = sc.nextInt();

            if(n2==2) {
                throw new ArithmeticException();
            }
            result = n1 / n2;
        }
        catch (InputMismatchException ime) {
            System.out.println("IME Detected");
        }
        catch (ArithmeticException ae) {
            System.out.println("AE Detected");
        }
        catch (Exception e) {
            System.out.println("Exception Detected"+ e.getMessage());
            e.printStackTrace();
        }
        System.out.println("The answer is " + result);
    }

    public static void main(String[] args) {
        excepTest2 obj = new excepTest2();
        obj.calc();
    }
}
//try: : represents/contains code that we think has probability to generate/throw Error at Runtime(exception)
//catch : executes only if any error/Exception Occurs in Try Block. if there is no exception it will not execute
//finally : executes irrespective of if any exception
//throw : used to raise exception manually
//throws : temporary exception fix, indicates need of try/catch block
