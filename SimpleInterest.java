import java.util.*;
class SI
{
  void simpleinterest(float p, float t, float r)
  {
      float SI,Tot_Amt;
      SI=(p*t*r)/100;
      Tot_Amt=p+SI;
      System.out.println("The Simple Interest is: "+SI);
      System.out.println("The total amount needs to repay is: "+Tot_Amt);
  }
      
}
class SimpleInterest
  {
    public static void main(String args[])
    {
      float p,t,r;
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter the value of principle amount in Rs.: ");
      p=sc.nextFloat();
      System.out.println("Please enter the period of time to repay in months: ");
      t=sc.nextFloat();
      System.out.println("Please enter the rate of interest applied in rupees: ");
      r=sc.nextFloat();
      SI s=new SI();
      s.simpleinterest(p,t,r);
    }
  }