package lec54;

import java.util.HashMap;

public class Graph {
    private HashMap<Integer, HashMap<Integer, Integer>> G;

    public Graph(int initial) {
        G = new HashMap<>();
        for (int U = 1; U <= initial; U++) {
            G.put(U, new HashMap<>());
        }
    }
    public void signIn(int Users) {
      
        G.putIfAbsent(Users, new HashMap<>());
    }
    public boolean isNgh(int V1, int V2) {
        HashMap<Integer, Integer> N_V1 = G.get(V1);
        return N_V1 != null && N_V1.containsKey(V2);
    }
    public void addEdge(int V1, int V2, int Wt) {
        signIn(V1);
        signIn(V2);
        HashMap<Integer, Integer> N_V1 = G.get(V1);
        N_V1.put(V2, Wt);

        HashMap<Integer, Integer> N_V2 = G.get(V2);
        N_V2.put(V1, Wt);
    } 
    public void removeEdge(int V1, int V2) {
        HashMap<Integer, Integer> N_V1 = G.get(V1);
        if (N_V1 != null) {
            N_V1.remove(V2);
        }
        HashMap<Integer, Integer> N_V2 = G.get(V2);
        if (N_V2 != null) {
            N_V2.remove(V1);
        }
    }
}
