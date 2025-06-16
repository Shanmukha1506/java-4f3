
import java.util.Scanner;
public class Prime5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("input:");
	    int x=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=x;i++){
	        if(x%i==0){
	            count++;
	        }
	    }
	    if(count==2){
	        System.out.print("prime");
	    }
	    else{
	        System.out.println("not prime");
	    }
	}
		
}