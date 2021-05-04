package calculate;
//calculator program
import java.util.Scanner;

public class pg1Calculator {
    int a;
    int b;

    public void addtion() {
        int result = a + b;
        System.out.println(result);

        //return result;
    }

    public void subtraction() {
        int result = a - b;
        System.out.println(result);
    }

    public void multiplication() {
        int result = a * b;
        System.out.println(result);
    }

    public void division() {
        int result = a / b;
        System.out.println(result);
    }

    public void calculateResult() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scan.nextInt();
        System.out.println("Enter the second number:");
        int b = scan.nextInt();

        System.out.println("Enter the symbol(+,-,*,/):");

        char ch = scan.next().charAt(0);

int result = 0;
        switch (ch) {
            case '+':
                result = a + b;

                System.out.println("Total: "+ result);
                break;

            case '-':
                result = a - b;
                System.out.println("Total: "+ result);
                break;

            case '*':
                result = a * b;
                System.out.println("Total: "+ result);
                break;

            case '/':
                result = a / b;
                System.out.println("Total: "+ result);
                break;

            default:
                System.out.println("Please enter valid input");
                break;

        }
        System.out.println("Would you like to do more calculation please enter 'Y'or'n'?: ");
        Scanner s=new Scanner(System.in);
        char choice = s.next().charAt(0);
        while (choice=='Y'||choice=='y'){
            calculateResult();}
            while((choice<=9)&&(choice=='N'||choice=='n')) {

                break;
            }

       }
    }


