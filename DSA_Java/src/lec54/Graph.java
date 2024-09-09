package lec54;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

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

    public boolean hasPath(int src, int dest) {
        if (src == dest) {
            return true;
        }

        Set<Integer> visited = new HashSet<>();
        return hasPathHelper(src, dest, visited);
    }

    private boolean hasPathHelper(int src, int dest, Set<Integer> visited) {
        if (visited.contains(src)) {
            return false;
        }

        visited.add(src);

        if (src == dest) {
            return true;
        }

        HashMap<Integer, Integer> neighbors = G.get(src);
        if (neighbors != null) {
            for (int nbr : neighbors.keySet()) {
                if (hasPathHelper(nbr, dest, visited)) {
                    return true;
                }
            }
        }

        return false;
    }
       
    public void BFS(int src) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(src);
        Set<Integer> visited = new HashSet<>();
        
        while (!Q.isEmpty()) {
            int V = Q.poll();
            if (visited.contains(V)) {
                continue; 
            }
            
            System.out.println(V); 
            visited.add(V);

            for (int nbr : G.get(V).keySet()) {
                if (!visited.contains(nbr)) {
                    Q.add(nbr);
                }
            }
        }
    }
}
