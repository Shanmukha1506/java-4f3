import java.util.ArrayList;
public class Adj
{
	public static void main(String[] args) {
		Graph g=new Graph(4);
		g.addedge(0,1);
		g.addedge(1,2);
		g.addedge(2,3);
		g.addedge(3,1);
		g.printgraph();


	}
}
class Graph {
	ArrayList<ArrayList<Integer>>graph;
	int vertices;
	Graph(int vertices) {
		this.vertices=vertices;
		this.graph=new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<vertices; i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
	void addedge(int s,int d) {
		if(isvalid(s,d)) {
			graph.get(s).add(d);
			graph.get(d).add(s);
		} else {
			return;
		}
	}
	void removeedge(int s,int d) {
		if(isvalid(s,d)) {
			graph.get(s).remove(d);
			graph.get(d).remove(s);
		} else {
			return;
		}
	}
	boolean isvalid(int s,int d) {
		return (s>=0&&d>=0&&s<vertices&&d<vertices&&s!=d);
	}
	public ArrayList<Integer>neighbours(int node) {
		return graph.get(node);
	}
	boolean ishavingedge(int s,int d) {
		if(isvalid(s,d)) {
			Node arr=graph.get(s);
			for(int i=0; i<arr.size(); i++) {
				if(arr.get(i)==d) {
					return true;
				}
				return false;
			}
			return false;
		}
		return false;
	}
	void printgraph() {
		for(int i=0; i<vertices; i++) {

			System.out.println(graph.get(i));
		}

	}
}
