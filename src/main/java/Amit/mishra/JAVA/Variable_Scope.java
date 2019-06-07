package Amit.mishra.JAVA;

public class Variable_Scope 
{
    public static void main(String args[])
    {
        {
            int x = 5;
            {
                 x = 10;
                System.out.println(x);
            }
        }
    }
}
