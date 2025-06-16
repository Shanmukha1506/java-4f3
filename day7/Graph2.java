class Graph{
    int[][] graph;
    int vertices;
    Graph(int vertices){
        this.graph=new int[vertices][vertices];
        this.vertices=vertices;
    }
    void addedge(int s,int d){
        if(isvalid(s,d)){
            graph[s][d]=1;
            graph[d][s]=1;
        }
        else{
            return;
        }
    }
        void removeedge(int s,int d){
            if(isvalid(s,d)){
                graph[s][d]=0;
                graph[d][s]=0;
            }else{
                return;
            }
        }
        boolean isvalid(int s,int d){
            return (s>=0&&d>=0&&s<vertices&&d<vertices&&s!=d);
        }
        boolean havingedge(int s,int d){
            if(isvalid(s,d)){
                if(graph[s][d]==1){
                    return true;
                }
                else{
                    return false;
                }
            }else{
                 System.out.println("invalid");
                 return false;
            }
        }
        void printgraph(){
            for(int i=0;i<vertices;i++){
                for(int j=0;j<vertices;j++){
                     System.out.print(graph[i][j]);
                }
                System.out.println(" ");
            }
        }
        
    }
    
public class Graph2{
    public static void main(String[] args){
        Graph g=new Graph(4);
        g.addedge(0,1);
        g.addedge(2,1);
        g.addedge(3,1);
        g.addedge(1,2);
        g.printgraph();
    }
}
