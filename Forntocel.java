import java.util.Scanner;
class Fortocelcius
{
  void forn(double f)
  {
    double c;
    c=(f-32)*0.56f;
    System.out.println("The temperature in celcius is : "+c);
  }
}
class Forntocel
  {
    public static void main(String args[])
    {
      double f;
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter the temperature in Fahrenheit reading: ");
      f=sc.nextDouble();
      Fortocelcius fc=new Fortocelcius();
      fc.forn(f);
    }
  }