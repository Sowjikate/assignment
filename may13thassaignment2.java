// Question 2: The Assignment Operators (+=, -=, *=, /=, %=)
// Points: 5 Marks
// Skill Mapping: Basic
// Description - Consider a variable - num1 = 10
// Write a Java program utilizing Assignment Operators to produce the following output:
// After addition: num = 12
// After subtraction: num = 8
// After multiplication: num = 56
// After division: num = 14
// After modulus: num = 2
import java.util.*;
public class may13thassaignment2{
     public static void main(String[] args) 
        {
        int num1=10;
        int num2=2;
        num1 += num2;
        System.out.println("After addition: num " + num1);
        int num3=10;
        num3 -=num2;
        System.out.println("After substraction: num " +num3);
        int num4=28;
        num4 *= num2;
        System.out.println("After multiplication:num " +num4);
        int num5=28;
        num5 /= num2;
        System.out.println("After division:num " +num5);
        int num6=11;
        num6 %= 3;
        System.out.println("After modulus: num " +num6);

    
}}