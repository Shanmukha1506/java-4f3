
public class Tiles
{
	public static void main(String[] args) {
		int val=ways(10);
		System.out.println(val);
	}

	public static int  ways(int n) {
		if(n==1 ||n==0) {
			return 1;
		}
		return ways(n-2)+ways(n-1);
	}
}
