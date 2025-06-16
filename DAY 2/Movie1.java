public class Movie1{
    public static void main(String[] args) {
         
	    Movie m1= new Movie("khaleja",9,"2:45");
	    Movie m2=new Movie("sye",7,"10:34");
	    m1.details();
	    m2.details();
     	}
}

class Movie{
       String name;
       int  rating;
       String duration;  
       Movie(String name,int rating,String duration)
    {
        this.name=name;
        this.rating=rating;
        this.duration=duration;
    }
    void details(){
        System.out.println(name);
        System.out.println(rating);
        System.out.println(duration);
        if(rating>9){
            System.out.println("hit");
        }
        else{
            System.out.println("average");
        }
    }
 }
 
