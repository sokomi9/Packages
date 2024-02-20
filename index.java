import calculators.*;
public class index
{
    public static void main(String a[])
    {
     CalcB obj = new CalcB();
     int r1 = obj.add(8, 4);
     int r2 = obj.subtract(10, 4);

     System.out.println(r1);
     System.out.println(r2);
    }
}