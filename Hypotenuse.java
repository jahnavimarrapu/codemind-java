import java.util.Scanner;
public class Hypotenuse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float h=(float)Math.sqrt((a*a)+(b*b));
        System.out.printf("%.2f",h);
    }
}