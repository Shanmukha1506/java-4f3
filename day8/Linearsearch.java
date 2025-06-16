
public class Linearsearch
{
	public static void main(String[] args) {
	    int[] nums={10,2,3,556,87};
	    int target=3;int index=-1;
	    for(int i=0;i<nums.length;i++){
	        if(target==nums[i]){
	            index=i;
	        }
	    }
	    System.out.println(index==-1?"element not found":"element found at index:"+index);
	    
	
	}
}
