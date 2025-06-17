import java.util.ArrayList;
public class Graph1
{
	public static void main(String[] args) {
	    Graph g=new Graph(4,true);
	    g.addedge(0,1);
	    g.addedge(1,2);
	    g.addedge(2,3);
	    g.addedge(3,0);
	    g.printgraph();
	    
	    
	
	}
}
class Graph{
    int[][] graph;
    int vertices;
    boolean isdirected;
    Graph(int vertices,boolean isdirected){
        this.graph=new int[vertices][vertices];
        this.vertices=vertices;
        this.isdirected=isdirected;
    }
    void addedge(int s,int d){
        if(isvalid(s,d)){
            graph[s][d]=1;
            if(!isdirected){
                graph[s][d]=1;
            }
            else{
                return;
            }
            
        }
    }
    void removeedge(int s,int d){
        if(isvalid(s,d)){
            graph[s][d]=0;
            if(!isdirected){
                graph[d][s]=0;
            }
            else{
                return;
            }
        }
        
    }
    boolean isvalid(int s,int d){
        return (s>=0&&d>=0&&s<vertices&&d<vertices&&s!=d);
    }
    public ArrayList<Integer>neighbours(int node){
        ArrayList<Integer> n=new ArrayList<Integer>();
        for(int i=0;i<vertices;i++){
            if(graph[node][i]==1){
                n.add(i);
            }
        }
        return n;
    }
    void printgraph(){
        for(int i=0;i<vertices;i++){
            for(int j=0;j<vertices;j++){
                System.out.println(graph[i][j]);
            }
        }
    }
}
