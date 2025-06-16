
public class Duplicates
{
	public static void main(String[] args) {
	    int i=0;
	    int[] nums={10,20,30,30,40,40,50};
	    for(int j=0;j<nums.length;j++){
	        if(nums[i]!=nums[j]){
	            nums[i+1]=nums[j];
	            i++;
	        }
	    }
	    for(int j=0;j<=i;j++){
	        System.out.print(nums[j]+" ");
	    }
		
	}
}
