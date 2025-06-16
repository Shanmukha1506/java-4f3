public class Binary
{
	public static void main(String[] args) {
	    int[] nums={1,2,3,4,45,54};
	    int target=45;
	    int left=0;
	    int right=nums.length-1;
	    int index=-1;
	    while(left<=right){
	        int mid=(left+right)/2;
	        if(target>nums[mid]){
	            left=mid+1;
	        }else if(target<nums[mid]){
	            right=mid-1;
	                
	            }else{
	                index=mid;
	                break;
	            }
	        }
	       System.out.print(index==-1?"element not found":"element found at index:"+index);
	    }
	}
	
	

