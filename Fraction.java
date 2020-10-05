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
    
    public String add(Fraction input, Fraction standard)
    {
        int AdditionNum = (input.getNum() * standard.getDen() + standard.getNum() * input.getDen()); 
        int AdditionDen = (standard.getDen() * input.getDen());
        String StringAdd = toString(AdditionNum) + "/" + toString(AdditionDen);
        return StringAdd;
    }
    
    public String subtr(Fraction input , Fraction standard)
    {
        int SubtractionNum = (input.getNum() * standard.getDen() - standard.getNum() * input.getDen()); 
        int SubtractionDen = (standard.getDen() * input.getDen()); 
        
        String StringSubtr = toString(SubtractionNum) + "/" + toString(SubtractionDen);
        return StringSubtr;
    }
    
    public String mult(Fraction input , Fraction standard)
    {
        int MultiplicationNum = (input.getNum() * standard.getNum()); 
        int MultiplicationDen = (standard.getDen() * input.getDen()); 
        
        String StringMult = toString(MultiplicationNum) + "/" + toString(MultiplicationDen);
        return StringMult;
    }
    
    public String div(Fraction input , Fraction standard)
    {
        int DivisionNum = (input.getNum() * standard.getDen());
        int DivisionDen = (standard.getNum() * input.getDen()); 
         
        String StringDiv = toString(DivisionNum) + "/" + toString(DivisionDen);
        return StringDiv;
    }
    
    
}


