
public class Bubblesort
{
	public static void main(String[] args) {
	    int[] arr={19,21,1,2,3,8,9,10};
	    for(int j=0;j<arr.length-1;j++){
	        for(int i=0;i<arr.length-1;i++){
	            if(arr[i]>arr[i+1]){
	                int temp=arr[i];
	                arr[i]=arr[i+1];
	                arr[i+1]=temp;
	            }
	        }
	    }
	    for(int val:arr){
	        System.out.println(val);
	    }
		
	}
}
