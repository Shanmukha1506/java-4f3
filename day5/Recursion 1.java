
public class Recursion1
{
	public static void main(String[] args) {
		printrange(1,5);
		int f=fact(5);
		System.out.println(f);
		int p=pow(2,5);
		System.out.println(p);
		System.out.println("-------");
		int n=5;
		for(int i=1;i<=n;i++){
		    System.out.println(fibi(i));
		}
		
	}

	public static void printrange(int start,int end) {
		if(start>end) {
			return;
		}

		printrange(start+1,end);
		System.out.println(start);
	}
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		int val=n*fact(n-1);
		return val;

	}
	public static int pow(int n,int x) {
		if(x==0) {
			return 1;
		}
		int val=n*pow(n,x-1);
		return val;
	}
	public static int fibi(int n){
	    if(n<=1){
	        return 1;
	    }
	    int val=fibi(n-1)+fibi(n-2);
	    return val;
	}
}

