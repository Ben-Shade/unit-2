import java.util.Scanner;
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denominator;
    // In this section teh numerator and denominator have been declared and this allows the input to be taken in and used in the code.
    public Fraction(int numerator1, int denominator1)
    {
        numerator = numerator1;
        denominator = denominator1;
        
    }
    // This sets the base value of the default fraction on which the code can work.
    public static Fraction OtherFraction()
    {
        return new Fraction(1,1);
    }
    // This returns the numerator.
    public int getNum()
    {
        return numerator;
    }
    // This returns the denominator
    public int getDen()
    {
         return denominator;
    }
    // this is the required instance of toString where it returns the faction with both numerator and denominator
    public String toString(int Fraction)
    {
        return Integer.toString(Fraction);
    }
    // This code actually adds the numerator and denominator together by taking the inputed numerator and then getting the default or standard fraction and adding them togethere, the same is done for teh denominator
    public String add(Fraction standard)
    {
        int AdditionNum = (numerator * standard.getDen() + standard.getNum() * denominator); 
        int AdditionDen = (standard.getDen() * denominator);
        
        String StringAdd = toString(AdditionNum) + "/" + toString(AdditionDen);
        return StringAdd;
    }
    // Just like in the addition code, the same applies for subraction.
    public String subtr(Fraction standard)
    {
        int SubtractionNum = (numerator * standard.getDen() - standard.getNum() * denominator); 
        int SubtractionDen = (standard.getDen() * denominator); 
        
        String StringSubtr = toString(SubtractionNum) + "/" + toString(SubtractionDen);
        return StringSubtr;
    }
    // The same also applies for the multiplication code.
    public String mult(Fraction standard)
    {
        int MultiplicationNum = (numerator * standard.getNum()); 
        int MultiplicationDen = (standard.getDen() * denominator); 
        
        String StringMult = toString(MultiplicationNum) + "/" + toString(MultiplicationDen);
        return StringMult;
    }
    // The same also applies for the division code.
    public String div(Fraction standard)
    {
        int DivisionNum = (numerator * standard.getDen());
        int DivisionDen = (standard.getNum() * denominator); 
         
        String StringDiv = toString(DivisionNum) + "/" + toString(DivisionDen);
        return StringDiv;
    }
    
    
}


