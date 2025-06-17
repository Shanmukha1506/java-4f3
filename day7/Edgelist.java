import java.util.HashSet;
public class Edgelist
{
	public static void main(String[] args) {
		Graph g = new Graph(4,true);
		g.addedge(0,1);
		g.addedge(0,3);
		g.addedge(0,2);
		g.printgraph();
	}
}
class Edge {
	int s;
	int d;
	int weight;
	Edge(int s,int d,int weight) {
		this.s=s;
		this.d=d;
		this.weight=weight;
	}
	Edge(int src,int dest) {
		s= src;
		d = dest;

	}
	@Override
	public String toString(){
	    return s + " --> " + d + "[weight = " + weight + " ]";
	}
}
class Graph {
	HashSet<Edge> graph;
	int vertices;
	boolean isdirected;
	Graph(int vertices,boolean isdirected) {
		this.vertices=vertices;
		this.isdirected=isdirected;
		graph=new HashSet<Edge>();
	}
	public void addedge(int s,int d) {
		if(isvalid(s,d)) {
			Edge e=new Edge(s,d);
			graph.add(e);
			if(isdirected) {
				Edge e2=new Edge(d,s);
				graph.add(e2);
			}
			else {
				return;
			}
		} else {
			return;
		}
	}
	public void addedge(int s,int d,int weight) {
		if(isvalid(s,d)) {
			Edge e=new Edge(s,d,weight);
			graph.add(e);
			if(isdirected) {
				Edge e2=new Edge(d,s,weight);
				graph.add(e2);
			}
			else {
				return;
			}
		} else {
			return;
		}
	}
	public boolean isvalid(int s,int d) {
		return (s>=0&&d>=0&&s<vertices&&d<vertices&&s!=d);
	}
	void printgraph() {
		System.out.println(graph);
	}

}
