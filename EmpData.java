import java.util.*;
class Readempdata
  {
    void edata(byte eno,String ename,float esal)
    {
     
    System.out.println("The Given Employee Number is: " +eno);
    System.out.println("The Given Employee Name is: " +ename);
    System.out.println("The Given Employee Salary is :"  +esal);
    }
  }
class EmpData
  {
    public static void main(String args[])
    {
      byte eno;
      String ename;
      float esal;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter employee number as Integer: ");
      eno=sc.nextByte();
      System.out.println("Enter employee name as String: ");
      ename=sc.next();
      System.out.println("Enter employee salary as decimal value: ");
      esal=sc.nextFloat();
      Readempdata r=new Readempdata();
      r.edata(eno,ename,esal);
    }
  }