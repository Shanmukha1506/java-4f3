class Game {
    public static void main(String[] args) {
        Gaming g1=new Gaming("subway surfers","action",9);
        g1.playing();
        g1.summary();
        
        
    }
}
class Gaming{
    String title;
    String zonor;
    int rating;
    int playcount=0;
    Gaming(String title,String zonor,int rating)
    {
        this.title=title;
        this.zonor=zonor;
        this.rating=rating;
        this.playcount=playcount;
    }
    boolean type(){
        if(zonor=="horror"){
            return true;
        }
        else{
            return false;
        }
    }
    int playing(){
        playcount=playcount+1;
        return playcount;
    }
    void summary(){
        System.out.println(title);
    System.out.println(zonor);
    System.out.println(rating);
    System.out.println(type()? "not family freindly":"family freindly");
    System.out.println(playcount);
    }
}