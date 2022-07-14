class Solution {
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        StringBuilder sb = new StringBuilder();
        UnionFind uf = new UnionFind(s.length());
        Map<Integer, Queue<Character>> map = new HashMap<>();
        
        for(List<Integer> pair : pairs){
            uf.union(pair.get(0), pair.get(1));
        }
        
        for(int i=0;i<s.length();i++){
            map.computeIfAbsent(uf.find(i), k->new PriorityQueue<>() ).offer(s.charAt(i));
        }
        
        for(int i=0;i<s.length();i++){
            sb.append(map.get(uf.find(i)).poll());
        }
        
        return sb.toString();
        
    }
}

class UnionFind{
    
        private int[] id;
    
        public UnionFind(int n){
            
            id = new int[n];
            for(int i=0;i<n;i++)
                id[i] = i;
        }
            
        public int find(int u){
            return id[u] == u ? u : (id[u] = find(id[u]));
       }
            
        public void union(int u, int v){
            id[find(u)] = find(v);
        }
    }