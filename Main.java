// Basic syntax and Data types 

// public class day1 {
//  public static void main(String[] args) {
//     int a = 10;
//     int b = 20;
//     int c;
//     c = a + b;
//     System.out.println("Sum of a and b is: " + c);
//   }   
// }   


// Data Types in Java
// byte, short, int , long, float , double, char , string , boolean

// Type Casting
// Widening Casting (automatically) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double
// Narrowing casting (manually) - converting a larger type to a smaller size type
// double -> float -> long -> int -> char -> short -> byte

// public class day1{
//     public static void main(String[] args){
//         // short a = 20;
//         // int b = a;
//         // System.out.println(b);
//     }
// }




// String manipulations

// \r is very important while printing patterns
// It moves the output cursor back to the beginning of the current line without advancing to a new line
// String three = new StringBuilder(one)
                    // .append(two).toString();

// public class day1{
//     public static void main(String[] args){
        // String myString = new String("Hello dude \r");
        // String myString2 = "Hello world";

        // System.out.println(myString + " " + myString2);


        // String texString = """
        //         Hi there, this is a new
        //         method of putting "string" rolled out in
        //         JAVA 13
        //         """;
        //         System.out.println(texString);
//     }
// }





// public class day1{
//     public static void main(String[] args){
        
//         String[] strings = new String[]{"one", "two", "three"};
//         String result = null;
        
//         for(String string: strings ){
//             if(result == null){
//                 result = string;
//             }
//             result = result + string;
//         }
//         System.out.println(result);
//     }
// }

// import java.util.*;
// Take a number and print whether it’s positive, negative, or zero
// public class day1 {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       int number = input.nextInt();

//       if(number>0){
//         System.out.println("Number is positive");
//       } else if(number<0){
//         System.out.println("Number is negative");
//       }
//       else{
//         System.out.println("Number is Zero");
//       }
// input.close();
//     }
// }

// public class day1{
//     public static void main(String[] args){
        
//     }
// }


import java.util.*;
// // Take a number and print whether it’s positive, negative, or zero
// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       int number = input.nextInt();

//       if(number>0){
//         System.out.println("Number is positive");
//       } else if(number<0){
//         System.out.println("Number is negative");
//       }
//       else{
//         System.out.println("Number is Zero");
//       }
//       input.close();
//     }
// }


//  Check if a number is even or odd.
// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       int number = input.nextInt();

//       if(number %2 ==0){
//         System.out.println("Number is Even");
//       } 
    
//       else{
//         System.out.println("Number is Odd");
//       }
//       input.close();
//     }
// }


// Check if a number is divisible by 5
//  Check if a number is divisible by both 3 and 5

// public class Main {
//     public static void main(String[] args) {
//       Scanner input = new Scanner(System.in);
//       int number = input.nextInt();

//       if(number %5 ==0 && number %3 ==0){
//         System.out.println("Number is divisible by 5 and 3");
//       } 
    
//       else{
//         System.out.println("Number is not");
//       }
//       input.close();
//     }
// }



//  Check if a given year is a leap SecurityManager

// public class Main{
//   public static void main (String[] args) {
//     Scanner input = new Scanner(System.in);
//     int year = input.nextInt();

//     if(year %4==0 && year %100 !=0 || year % 400 ==0){
//       System.out.println("Leap year");
//     }
//     else{
//       System.out.println("Not leap year");
//     }
//     input.close();
//   }
// }



// Take two numbers and print the larger one
// public class Main {
//     public static void main(String[] args) {
//       Scanner consoleScanner = new Scanner(System.in);
//       int number1 = consoleScanner.nextInt();
//       int number2 = consoleScanner.nextInt();

//       if(number1 > number2){
//         System.out.println("Number1 greater");
//       } 
//       else if(number2 > number1) {
//         System.out.println("Number2 greater");
//       }
//       else{
//         System.out.println("Both are equal");
//       }
//       consoleScanner.close();
//     }
// }

// System.out.println("Hello Java!");

// abstract

//  Take a character and check if it’s a vowel or consonant.
// public class day1 {
//     public static void main(String[] args) {
//       Scanner consoleScanner = new Scanner(System.in);
//       char ch = consoleScanner.next().charAt(0);
//       ch = Character.toLowerCase(ch);

//      if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
//       System.out.println("Vowel");
//      }
//      else{
//       System.out.println("Not vowel");
//      }
//       consoleScanner.close();
//     }
// }



// 10. Take a character and check whether it’s uppercase, lowercase, a digit, or a special
// character

// public class day1 {
//     public static void main(String[] args) {
//      Scanner consoleScanner = new Scanner(System.in);
//      char ch = consoleScanner.next().charAt(0);
     
//      if(ch == Character.toUpperCase(ch) && Character.isLetter(ch) ){
//       System.out.println("Uppercase");
//      }
//      else if (ch == Character.toLowerCase(ch)&& Character.isLetter(ch) )
//      {
//       System.out.println("lowercase");
//      }
//      else if(Character.isDigit(ch))
//      {
//       System.out.println("Digit");
//      }
//      else {
//       System.out.println("Special Character");
//      }
//     }
// }



//  Take three sides and check if they form a valid triangle.

// public class day1{
//   public static void main (String[] args) {
//     Scanner consoleScanner = new Scanner(System.in);
//     int side1 = consoleScanner.nextInt();
//     int side2 = consoleScanner.nextInt();
//     int side3 = consoleScanner.nextInt();

//     if((side1 + side2) > side3 && (side2 + side3 ) > side1 && (side3 + side1) > side2){
//       System.out.println("valid triangle");
//     }
//     else {
//       System.out.println("Not valid Triangle");
//     }

//   }
// }

// 4. Check if one of two given numbers is a multiple of the other.

// public class day1 {
//     public static void main(String[] args) {
//       Scanner consoleScanner = new Scanner(System.in);
//       int number1 = consoleScanner.nextInt();
//       int number2 = consoleScanner.nextInt();

//       if(number1 % number2 == 0){
//         System.out.println("is multiple");
//       } 
//       else if(number2 % number1 == 0) {
//         System.out.println("is multiple");
//       }
//       else{
//         System.out.println("Not multiple");
//       }
//       consoleScanner.close();
//     }
// }




