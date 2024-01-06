import java.util.Scanner;
public class Area
{
    public static void main(String[] args)
    {
        Scanner ac=new Scanner(System.in);
        int a=ac.nextInt();
        int area=a*a;
        int perimeter=4*a;
        System.out.printf("%d %d",area,perimeter);
    }
}