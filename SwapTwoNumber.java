package javaintrotask;

import java.util.Scanner;

public class SwapTwoNumber {
public static void main(String[] args)
{
int i,j,z;
System.out.println("Enter the value for i ");	
Scanner sc= new Scanner(System.in);
i=sc.nextInt();
System .out.println("Enter the value for j");
Scanner sc1= new Scanner(System.in);
j=sc1.nextInt();
System.out.println("Before swap"+"i="+i+""+"j="+j);
z=i;i=j;j=z;
System.out.println("After swap"+"i="+i+""+"j="+j);

}
}
