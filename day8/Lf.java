
public class Lf
{
	public static void main(String[] args) {
		System.out.println("element found at index:"+linearsearch(new int[] {10,20,35,46,12},46));
		

	}

	public static int  linearsearch(int[] nums,int target) {
		for(int i=0; i<nums.length; i++) {
			if(target==nums[i]) {
				return i;
			}
			
		}
		return -1;
	}
}
