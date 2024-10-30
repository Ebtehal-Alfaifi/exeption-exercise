import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner num = new Scanner(System.in);
//        try {
//            System.out.println("Enter the first number:");
//            int firstnumber = num.nextInt();
//            System.out.println("Enter the second number:");
//            int secondnumber = num.nextInt();
//
//            int sum = firstnumber + secondnumber;
//            System.out.println(firstnumber + " + " + secondnumber + " = " + sum);
//
//            int sub = firstnumber - secondnumber;
//            System.out.println(firstnumber + " - " + secondnumber + " = " + sub);
//
//            int mul = firstnumber * secondnumber;
//            System.out.println(firstnumber + " * " + secondnumber + " = " + mul);
//
//            if (secondnumber == 0) {
//                throw new ArithmeticException("Division by zero is not allowed.");
//            }
//            int dev = firstnumber / secondnumber;
//            System.out.println(firstnumber + " / " + secondnumber + " = " + dev);
//
//            int mod = firstnumber % secondnumber;
//            System.out.println(firstnumber + " mod " + secondnumber + " = " + mod);
//
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter valid integers.");

//**************************************************************************************
//
//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10
//              try {
//            System.out.print("Enter a number: ");
//            int n = num.nextInt();
//            int i = 1;
//            while (i <= 10) {
//                System.out.println(n + " * " + i + " = " + (n * i));
//                i++;
//            }
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//     *********************************************************************************


//3. Write a Java program to print the area and perimeter of a circle.
//        try {
//
//            System.out.println("Enter the radius: ");
//            double rad = num.nextDouble();
//            double perimeter = 2 * rad * 3.14;
//            double area = 3.14 * rad * rad;
//            System.out.println("Perimeter is = " + perimeter);
//            System.out.println("Area is = " + area);
//        } catch (Exception e) {
//            System.out.println("you can not enter");
//        }
//    }
//}

//*************************************************************************************

//4. Java program to find out the average of a set of integers


//        try {
//            System.out.print("Enter the count of numbers: ");
//            int count = num.nextInt();
//
//            if (count <= 0) {
//                throw new IllegalArgumentException("Count must be a positive integer.");
//            }
//
//            int sum = 0;
//            for (int i = 0; i < count; i++) {
//                System.out.print("Enter an integer: ");
//                int number = num.nextInt();
//                sum += number;
//            }
//
//            double av = (double) sum / count; // التحويل إلى double لتجنب القسمة الصحيحة
//            System.out.println("The average is: " + av);
//
//        } catch (ArithmeticException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        } catch (IllegalArgumentException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Invalid input. Please enter valid integers.");
//   **************************************************************************

//        5. Write a Java program that accepts three integers as input, adds the first two integers
//        together, and then determines whether the sum is equal to the third integer


//try {
        //  using tring and catch to handling the exception

//        System.out.println("enter the first number");
//        int num1 = num.nextInt();
//        System.out.println("enter the second number");
//        int num2 = num.nextInt();
//        System.out.println("enter the therd number");
//        int num3 = num.nextInt();
//        int sum = num1 + num2;
//        boolean equal = (sum == num3);
//        System.out.println("The result is: " + equal);
//}catch (InputMismatchException e) {
//    System.out.println("the value is not correct");
//}
//    }}
//    *******************************************************************
//        6. Write a Java program to reverse a word.


//
//
//
////        System.out.println("Enter the word that you want to reverse:");
////        String wor = num.nextLine();
////        StringBuilder reversed = new StringBuilder();
////        for (int i = wor.length() - 1; i >= 0; i--) {
////            reversed.append(wor.charAt(i));
////        }
////        System.out.println("Reversed string: " + reversed.toString());
////    }}
//
////*****************************************************************************************


//        7.Java program to check whether the given number is even or odd

//        try {
//
//
//            cheknum();
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter an integer.");
//        } catch (Exception e) {
//            System.out.println("An unexpected error occurred: " + e.getMessage());
//        }
//    }
//    public static void cheknum () throws InputMismatchException{
//        Scanner num=new Scanner(System.in);
//        System.out.println("Enter a number:");
//
//        int number;
//        try {
//            number = num.nextInt();
//        } catch (InputMismatchException e) {
//            throw new InputMismatchException("Input must be an integer.");  // استخدمه اذا اليوزر دخلا قيمه خاطئه
//        }
//
//        if (number < 0) {
//            throw new IllegalArgumentException("Number cannot be negative."); // استخدمو اذا يمكن ان المستخدم يدخل قيم سالبة
//        }
//
//        if (number % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }}}


//*************************************************************************


//        8 - Java program to convert the temperature in Centigrade to Fahrenheit

//               try {
//            System.out.print("Enter temperature in Centigrade: ");
//            double centigrade = num.nextDouble();
//
//            if (centigrade < -273.15) {
//                throw new IllegalArgumentException("Temperature cannot be below absolute zero (-273.15°C).");
//            }
//
//            double fahrenheit = (centigrade * 9/5) + 32;
//            System.out.println("Temperature in Fahrenheit is: " + fahrenheit);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid number.");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error: " + e.getMessage());
//     }}}
//****************************************************************************************


//        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.
//        try {
//            System.out.print("Input a string: ");
//            String inString = num.nextLine();
//
//            System.out.print("Input a number: ");
//            int ind = num.nextInt();
//
//            if (ind < 0) {
//                throw new IllegalArgumentException("Index cannot be negative.");
//            }
//
//            if (ind >= inString.length()) {
//                throw new IndexOutOfBoundsException("Index out of bounds for the input string.");
//            }
//
//            char ch = inString.charAt(ind);
//            System.out.println("Character at index " + ind + " is: " + ch);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error: " + e.getMessage());
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Error: " + e.getMessage());}}}


//        *********************************************************************

//        10. Write a Java program to print the area and perimeter of a rectangle

//        System.out.print("Enter the width: ");
//        double width = num.nextDouble();
//        System.out.print("Enter the height: ");
//        double height = num.nextDouble();
//        double area = width * height;
//        double perimeter = 2 * (width + height);
//        System.out.println("Area is " + width + " * " + height + " = " + area);
//        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);}}

//    *************************************************************************************************


//        11. Write a Java program to compare two numbers.

//   try {
//            System.out.print("Enter first number: ");
//            int Number1 = num.nextInt();
//
//            System.out.print("Enter second number: ");
//            int Number2 = num.nextInt();
//
//            if (Number1 != Number2) {
//                System.out.println(Number1 + " != " + Number2);
//            }
//            if (Number1 < Number2) {
//                System.out.println(Number1 + " < " + Number2);
//            }
//            if (Number1 <= Number2) {
//                System.out.println(Number1 + " <= " + Number2);
//            }
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter valid integers.");}}}
//     ************************************************************************



//        12. Write a Java program to convert seconds to hours, minutes and seconds.
//        Sample Output

//        try {
//            System.out.print("Input seconds: ");
//            int integerSeconds = num.nextInt();

//            if (integerSeconds < 0) {             // احتملت احتمال من عندي انو يمكن يدخل ثواني برقم سالب
//                throw new IllegalArgumentException("Seconds cannot be negative.");
//            }
//
//            int hours = integerSeconds / 3600;
//            int minutes = (integerSeconds % 3600) / 60;
//            int seconds = integerSeconds % 60;
//
//            System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
//
//        } catch (InputMismatchException e) {
//            System.out.println("Invalid input. Please enter a valid integer.");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Error: " + e.getMessage());}}

//*************************************************************************************

//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.
////
//        try {
//            System.out.print("Input first number: ");
//            int Number1 = num.nextInt(); // قد يثير InputMismatchException
//
//            System.out.print("Input second number: ");
//            int Number2 = num.nextInt(); // قد يثير InputMismatchException
//
//            System.out.print("Input third number: ");
//            int Number3 = num.nextInt(); // قد يثير InputMismatchException
//
//            System.out.print("Input fourth number: ");
//            int Number4 = num.nextInt(); // قد يثير InputMismatchException
//
//            if (Number1 == Number2 && Number1 == Number3 && Number1 == Number4) {
//                System.out.println("Numbers are equal!");
//            } else {
//                System.out.println("Numbers are not equal!");
//            }
//
//        } catch (Exception e) {
//            System.out.println("An unexpected error occurred: " + e.getMessage());}}}
//******************************************************************************************
//        14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive


//        try {
//        System.out.print("Input a number: ");
//        int number = num.nextInt();
//        if (number > 0) {
//        System.out.println("Number is positive");
//        } else if (number < 0) {
//        System.out.println("Number is negative");
//        } else {
//        System.out.println("Number is zero");}}
//            catch(Exception e){
//                System.out.println("you have an wrong vaild");
//            }
//        }}
//*************************************************************************


//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered (End loop use -1 ,
//                Don’t count -1).
//
//        int positiveCount = 0;
//        int negativeCount = 0;
//        int zeroCount = 0;
//        int positiveEntries = 0;
//        int negativeEntries = 0;
//
//        System.out.println("Enter numbers (end with -1):");
//
//        while (true) {
//            try {
//                int number = num.nextInt(); // قد يثير InputMismatchException
//
//                if (number == -1) {
//                    break;
//                }
//
//                if (number > 0) {
//                    positiveCount++;
//                    positiveEntries++;
//                } else if (number < 0) {
//                    negativeCount++;
//                    negativeEntries++;
//                } else {
//                    zeroCount++;
//                }
//            } catch (InputMismatchException e) {
//                throw new IllegalArgumentException("Invalid input. Please enter valid integers.");
//            }
//        }
//
//        System.out.println("Positives: " + positiveCount + " (Entries: " + positiveEntries + ")");
//        System.out.println("Negatives: " + negativeCount + " (Entries: " + negativeEntries + ")");
//        System.out.println("Zeros: " + zeroCount);}}
//}


//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.
// try {
//        int number = num.nextInt();
//        int reversNumber = 0;
//        while (number != 0) {
//            int digit = number % 10;
//            reversNumber = reversNumber * 10 + digit;
//            number /= 10;
//            throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
//        }
//        System.out.println("Reversed number: " + reversNumber);
//    } catch (InputMismatchException e) {

//    } catch (Exception e) {
//        System.out.println("An unexpected error occurred: " + e.getMessage());}}}

//    ************************************************************************

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        boolean hasNumbers = false;
//        String input;
//        System.out.println("Enter numbers (type 'exit' to stop):");
//        while (true) {
//            input = num.nextLine();
//            if (input.equalsIgnoreCase("exit")) {
//                break;
//            }
//            try {
//                int number = Integer.parseInt(input);
//                if (number > max) {
//                    max = number;
//                }
//                if (number < min) {
//                    min = number;
//                }
//                hasNumbers = true;
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid integer or 'exit' to stop.");
//            }}
//        if (hasNumbers) {
//            System.out.println("Largest number: " + max);
//            System.out.println("Smallest number: " + min);
//        } else {
//            System.out.println("No numbers were entered.");
//        }}}






//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.

//System.out.println("Enter a string:");
//        String input = num.nextLine();
//
//        if (input.isEmpty()) {
//            throw new IllegalArgumentException("Input cannot be empty.");
//        }
//        int count = 0;
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) == 'a') {
//                count++;
//            } }
//        System.out.println("Number of 'a's: " + count);}}
//        ****************************************************************
