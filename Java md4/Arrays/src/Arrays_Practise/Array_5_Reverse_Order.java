package Arrays_Practise;
//WAP to create an array int type and add some data by ip taken-
//-from scanner class and print reverse format
import java.util.Scanner;

public class Array_5_Reverse_Order {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your array size:");
       int size=sc.nextInt();
       System.out.println("Enter your values:");
       int n[]=new int[size];//array creation
       for(int i=0;i<size;i++)// logic for size execution
       {
    	   n[i]=sc.nextInt();
       }
       System.out.println("Your array values are:");
       for(int m=size-1;m>=0;m--)// logic for printing & in reverse order
    	   // size-1=> Reverse order
       {
    	   System.out.println(n[m]);
    	   sc.close();//method of scanner
    	   
       }
       
	}

}
//here m,n,i are local variables