package ranushka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double no1,no2,result;
        char operator;

        System.out.print("enter first num=");
        no1= sc.nextDouble();

        System.out.print("select the operator(+,-,/,*)");
        operator=sc.next().charAt(0);  // how to get user input in char value


        System.out.print("enter second number=");
        no2= sc.nextDouble();

        switch (operator){
            case '+':
                result=no1+no2;
                System.out.print("answer is ="+result);
                break;

            case '-':
                result=no1-no2;
                System.out.print("answer is ="+result);
                break;

            case '*':
                result=no1*no2;
                System.out.print("answer is ="+result);
                break;

            case '/':
                result=no1/no2;
                System.out.print("answer is ="+result);
                break;
            default:
                System.out.println("invalid");
                break;
        }





    }
}
