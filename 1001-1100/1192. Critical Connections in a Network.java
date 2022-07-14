class Solution {
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> result = new LinkedList<>();
        
        //Tarjan's Algorithm 
        //Implementation Method -> DFS
        
        int[] low = new int[n];
        
        List<Set<Integer>> graph = new ArrayList<>(n);
        
        for(int i=0;i<n;i++){
            low[i] = -1;//not visited state to all the nodes
            
            graph.add(new HashSet<>());//each node has a set
        }
        
        for(List<Integer> connection: connections){
            //{u,v} nodes: u->v and v->u here
            //{0,1} represents {u,v}
            
            graph.get(connection.get(0)).add(connection.get(1));//u->v
            graph.get(connection.get(1)).add(connection.get(0));//v->u
        }
        
        /*Tarjans(currentNode, parentNode, graph, level, result, lowArr)*/
        Tarjans(0,0,graph,0,result,low);
        
        return result;
    }
    
    private int Tarjans(int currNode, int parentNode, List<Set<Integer>> graph, int level, List<List<Integer>> result, int[] low){
        low[currNode] = level; //current level of the current node
        
        for(int child: graph.get(currNode)){
            if(child == parentNode)
                continue;
            
            //Visiting the node for the first time
            if(low[child]==-1){
                int t = Tarjans(child, currNode, graph, level+1, result, low);
                low[currNode] = Math.min(low[currNode], t);//low[child->child....->leaf];
            }else{
                low[currNode] = Math.min(low[currNode], low[child]);//low[child=leaf]
            }
        }
        
        if(currNode !=0 && low[currNode] == level){//1->3 and 3->1 case
            result.add(Arrays.asList(new Integer[]{currNode, parentNode}));
        }
        
        return low[currNode];
        
    }
}