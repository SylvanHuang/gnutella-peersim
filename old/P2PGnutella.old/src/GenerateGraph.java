import java.util.*;

public class GenerateGraph {
	
	int n=100;
	//List<Node> graph = new ArrayList<Node>();
	List<NodeOneHop> graph = new ArrayList<NodeOneHop>();
	
	public GenerateGraph(){
		
		//graph.add(new Node(0,null));
		graph.add(new NodeOneHop(0,null));
		
		for(int i=1; i<=5000; i++){
			//System.out.print(i+"'s neighbors ");
			//graph.add(new NodeOneHop(i, GenerateNeighbors()));
			//graph.add(new Node(i));
			graph.add(new NodeOneHop(i));
			//System.out.println();
		}

		// link
		
		for(int i=1; i<=5000; i++){
			//graph.get(i).addNeighbors(GenerateNeighbors());
			//for(int j=0; j<graph.get(i).fileList.size(); j++)
			//	System.out.print(" " + graph.get(i).fileList.get(j).FileName);
			//System.out.println();
		}


		
	}//end constructor
	
	
	//public List<Node> GenerateNeighbors(){
	public List<NodeOneHop> GenerateNeighbors(){
		//List<Node> nodes = new ArrayList<Node>();
		List<NodeOneHop> nodes = new ArrayList<NodeOneHop>();
		Random rand = new Random();
		
		/*
		*/
		if(graph.size() > 5){
			int numNeighbors = 1+ rand.nextInt(4);
			for(int i =0; i< numNeighbors; i++){
				int neighbor=  rand.nextInt(graph.size());
				nodes.add(graph.get(neighbor));
			}

			/*
			for(int j=0; j<nodes.size(); j++)
			{
				System.out.print(nodes.get(j).nodeId + " ");
				if ( (j+1)%5==0)
				System.out.println();
			}
			*/
		}
		else{
			//System.out.println();
			int numNeighbors = rand.nextInt(graph.size());
			for(int i =0; i< numNeighbors; i++){
				int neighbor=  rand.nextInt(graph.size());
				nodes.add(graph.get(neighbor));
			}

			/*
			//System.out.println();
			for(int j=0; j<nodes.size(); j++)
			{
				System.out.print(nodes.get(j).nodeId + " ");
				if ( (j+1)%5==0)
				System.out.println();
			}
			*/
		}
		return nodes;
	}

}
