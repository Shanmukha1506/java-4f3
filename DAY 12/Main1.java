public class Main1
{
	public static void main(String[] args) {
	    System.out.println(napSack(8,0,new int[] {1,4,5,7}, new int[] {2,4,7,10}));
	    
		
	}
	public static int napSack(int bagweight,int selectedelement,int[] weigths,int[] profits){
	    if(selectedelement>= weigths.length||bagweight==0){
	        return 0;
	    }
	    int pick=0;
	    if(bagweight>=weigths[selectedelement]){
	        pick=profits[selectedelement]+napSack(bagweight-weigths[selectedelement],selectedelement+1,weigths,profits);
	    }
	    int notpick=napSack(bagweight,selectedelement+1,weigths,profits);
	    return Math.max(pick,notpick);
	}
}
