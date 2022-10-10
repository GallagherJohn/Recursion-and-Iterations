/* John Gallagher
 * Java program to show the difference between recursion and iteration.
 */

import java.util.*;

class RecursiveVsIterative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to see sum of digits: ");
        int number = sc.nextInt();
        System.out.println("Sum of digit using recursion for number is " + sumOfDigits(number));

        System.out.println("Sum of digit using Iteration for number is " + sumOfDigitsIterative(number));
        System.out.print("Enter number to convert to binary:\n ");
        number = sc.nextInt();
        Lab10 dtb = new Lab10();
        System.out.println("Number in Binary format: ");
        dtb.printBinaryFormat(number);
        System.out.println("\nNumber in Binary format: ");
        convert(number);

    }

    public void printBinaryFormat(int number1) {
        int binary[] = new int[25];
        int index = 0;
        while (number1 > 0) {
            binary[index++] = number1 % 2;
            number1 = number1 / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print("" + binary[i]);
        }
    }

    public static int sumOfDigits(int number) {
        if (number / 10 == 0)
            return number;
        return number % 10 + sumOfDigits(number / 10);
    }

    public static int sumOfDigitsIterative(int number) {
        int result = 0;
        while (number != 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }

    public static void convert(int num) {
        if (num > 0) {
            convert(num / 2);
            System.out.print(num % 2);
        }
    }

}