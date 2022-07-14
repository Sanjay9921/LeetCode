class Solution {
         public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        HashMap<String,ArrayList<Pair>> hm =new HashMap<>();
        double []res=new double[queries.size()];
        
        for(int i=0;i<equations.size();i++){
            List<String> eqn=equations.get(i);
            if(!hm.containsKey(eqn.get(0))){
                hm.put(eqn.get(0),new ArrayList<Pair>());
            }
            hm.get(eqn.get(0)).add(new Pair(eqn.get(1),values[i]));
            
            if(!hm.containsKey(eqn.get(1))){
                hm.put(eqn.get(1),new ArrayList<Pair>());
            }
            hm.get(eqn.get(1)).add(new Pair(eqn.get(0),1/values[i]));
        }

        
        int index=0;
        for(List<String> ls: queries){
            String src=ls.get(0);
            String dest=ls.get(1);
            res[index]=finder(src,dest,hm,1,new HashSet<>());
            index++;
        }
        
        return res;
    }
    
    public double finder(String src,String dest,HashMap<String,ArrayList<Pair>> hm,double val,HashSet<String> hs){

        if(!hm.containsKey(src) || !hm.containsKey(dest)){
            return -1;
        }
        if(src.equals(dest)){
            return val;
        }
        hs.add(src);
        for(Pair n: hm.get(src)){
            if(!hs.contains(n.u)){
                double calc=finder(n.u,dest,hm,val*n.cost,hs);
                if(calc!=-1){
                    return calc;
                }
            }
        }
        
        return -1;
        
    }

class Pair{
    String u;
    double cost;
    public Pair(String u, double cost){
        this.u=u;
        this.cost=cost;
    }
    
    public String toString(){
        return u+" : "+cost;
    }
    }
}