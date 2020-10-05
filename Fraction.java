import java.util.Scanner;
public class Fraction
{
    // instance variables - replace the example below with your own
    private int numerator;
    private int denominator;
    
    public Fraction(int numerator1, int denominator1)
    {
        numerator = numerator1;
        denominator = denominator1;
        
    }
    
    public static Fraction OtherFraction()
    {
        return new Fraction(1,1);
    }
    
    public int getNum()
    {
        return numerator;
    }
    
    public int getDen()
    {
         return denominator;
    }
    
    public String toString(int Fraction)
    {
        return Integer.toString(Fraction);
    }
    
    public String add(Fraction standard)
    {
        int AdditionNum = (numerator * standard.getDen() + standard.getNum() * denominator); 
        int AdditionDen = (standard.getDen() * denominator);
        
        String StringAdd = toString(AdditionNum) + "/" + toString(AdditionDen);
        return StringAdd;
    }
    
    public String subtr(Fraction standard)
    {
        int SubtractionNum = (numerator * standard.getDen() - standard.getNum() * denominator); 
        int SubtractionDen = (standard.getDen() * denominator); 
        
        String StringSubtr = toString(SubtractionNum) + "/" + toString(SubtractionDen);
        return StringSubtr;
    }
    
    public String mult(Fraction standard)
    {
        int MultiplicationNum = (numerator * standard.getNum()); 
        int MultiplicationDen = (standard.getDen() * denominator); 
        
        String StringMult = toString(MultiplicationNum) + "/" + toString(MultiplicationDen);
        return StringMult;
    }
    
    public String div(Fraction standard)
    {
        int DivisionNum = (numerator * standard.getDen());
        int DivisionDen = (standard.getNum() * denominator); 
         
        String StringDiv = toString(DivisionNum) + "/" + toString(DivisionDen);
        return StringDiv;
    }
    
    
}


