package Graphs;
/*OUTPUT
 Enter number of vertices and edges
5
5
Enter 5 edges
0 4
4 3
3 2
2 1
1 2
Enter source and destination
0 1
Possible: true
 */
import java.util.*;

public class Graph {
	private LinkedList<Integer> adj[];
	
	// constructor
	// Adjacency matrix graph creation--refer svg image
	public Graph(int v) {
		adj = new LinkedList[v];
		for(int i=0; i<v; i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
		
	}
	public void addEdge(int  source, int destination) {
		adj[source].add(destination);
		adj[destination].add(source);
	}
	
	// returns shortest distance between source and destination(BFS)
	
	public int bfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		int parent[] = new int[adj.length];
		Queue<Integer> q = new LinkedList<>();
		q.add(source);
		parent[source] = -1;
		vis[source] = true;
		while(!q.isEmpty()) {
			int cur = q.poll(); // taking out first element from queue
			if(cur == destination)
			{
				break;
			}
			for(int neighbour:adj[cur]) {
				if(!vis[neighbour]) {
					vis[neighbour] = true;
					q.add(neighbour);
					parent[neighbour] = cur;
				}
			}
		}
		int cur = destination;
		int distance = 0;
		while(parent[cur] != -1) {
			System.out.print(cur+" -> ");
			cur = parent[cur];
			distance++;
		}
		System.out.println(source);
		return distance;
	}
	
	// DFS -> path from source to destination exists or not.(USING RECURCIVE FUNCTION)
	private boolean dfsUtil(int source, int destination, boolean vis[])
	{
		if(source == destination)
		{
			return true;
		}
		for(int neighbor: adj[source]) {
			if(!vis[neighbor]) {
				vis[neighbor] = true;
				boolean isConnected = dfsUtil(neighbor, destination, vis);
				if(isConnected) return true;
			}
			
		}
		return false;
	}
	
	// DFS-(USING STACK)
	public boolean dfsStack(int source, int destination)
	{
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		Stack<Integer> stack = new Stack<>();
		
		stack.push(source);
		while(!stack.isEmpty())
		{
			int cur = stack.pop();
			
			if(cur == destination) return true;
			
			for(int neighbor: adj[cur]) {
				if(!vis[neighbor]) {
					vis[neighbor] = true;
					stack.push(neighbor);
				}
			}
		}
		return false;
	}
	
	
	public boolean dfs(int source, int destination) {
		boolean vis[] = new boolean[adj.length];
		vis[source] = true;
		
		return dfsUtil(source, destination, vis);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of vertices and edges");
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		Graph graph = new Graph(v);
		System.out.println("Enter "+e+" edges");
		for (int i = 0; i < e; i++) {
			int source = sc.nextInt();
			int destination = sc.nextInt();
			
			graph.addEdge(source, destination);
		}
		System.out.println("Enter source and destination");
		int source = sc.nextInt();
		int destination = sc.nextInt();
		
//		int distance = graph.bfs(source, destination);
//		System.out.println("Min Distance is: "+distance);
		
		System.out.println("Possible: "+graph.dfsStack(source, destination));
		
		

	}
	

}
