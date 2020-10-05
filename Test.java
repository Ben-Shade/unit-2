

//Written by Joseph Hall and Ben Shade

import java.util.Scanner;
public class Test
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
    {
        Scanner numerator = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        Scanner denominator = new Scanner(System.in);
        System.out.println("Enter a denominator: ");
        
        String Numerator = numerator.next();
        String Denominator = denominator.next();
        
        int numerator_1 = Integer.parseInt(Numerator);
        int denominator_1 = Integer.parseInt(Denominator);
        
        Fraction input = new Fraction(numerator_1, denominator_1);
        
        Fraction one_half = new Fraction(1,2);
        Fraction one_third = new Fraction(1,3);
        Fraction one_fourth = new Fraction(1,4);
        
        System.out.println(input.add(one_half));
        System.out.println(input.subtr(one_half));
        System.out.println(input.mult(one_half));
        System.out.println(input.div(one_half));
        
        System.out.println(" ");
        
        System.out.println(one_half.add(one_third));
        System.out.println(one_half.subtr(one_third));
        System.out.println(one_half.mult(one_third));
        System.out.println(one_half.div(one_third));
        
        System.out.println(" ");
        
        System.out.println(one_third.add(one_third));
        System.out.println(one_third.subtr(one_fourth));
        System.out.println(one_third.mult(one_fourth));
        System.out.println(one_third.div(one_fourth));
        
        System.out.println(" ");

    }
}
