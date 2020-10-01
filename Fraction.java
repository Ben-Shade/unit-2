
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
        return new Fraction(1,3);
    }
    
    public int getNum()
    {
        return numerator;
    }
    
    public int getDen()
    {
         return denominator;
    }
    
    public String toString()
    {
        return numerator + "/" + denominator;
    }
    
    public int add(Fraction input, Fraction standard)
    {
        String Addition = (input.getNum() * standard.getDen() + standard.getNum() * input.getDen())+ "/" + (standard.getDen() * input.getDen()); 
        int intAddition = Integer.parseInt(Addition);
        return intAddition;
    }
    
    public int subtr(Fraction input , Fraction standard)
    {
        String Subtraction = (input.getNum() * standard.getDen() - standard.getNum() * input.getDen())+ "/" + (standard.getDen() * input.getDen()); 
        int intSubtraction = Integer.parseInt(Subtraction);
        return intSubtraction;
    }
    
    public int mult(Fraction input , Fraction standard)
    {
        String Multiplication = (input.getNum() * standard.getNum())+ "/" + (standard.getDen() * input.getDen()); 
        int intMultiplication = Integer.parseInt(Multiplication);
        return intMultiplication;
    }
    
    public int div(Fraction input , Fraction standard)
    {
        String Division = (input.getNum() * standard.getDen())+ "/" + (standard.getNum() * input.getDen()); 
        int intDivision = Integer.parseInt(Division);
        return intDivision;
    }
    
    public static void main(String [] args)
    {
         
        Fraction one_half = new Fraction(1,2);
        Fraction one_thrid = new Fraction(1,3);
        System.out.println(one_half.add(one_half,OtherFraction()));
        

    }
}

