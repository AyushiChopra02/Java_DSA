package lec6;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxDistance(int[][] grid) {
        int n = grid.length;
        int[][] distance = new int[n][n];
        Queue<int[]> queue = new LinkedList<>();
        
        boolean hasWater = false, hasLand = false;
        
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    distance[i][j] = 0;
                    hasLand = true;
                } else {
                    distance[i][j] = -1;
                    hasWater = true;
                }
            }
        }
        
               if (!hasLand || !hasWater) {
            return -1;
        } 
        
               int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};
        
                while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int row = cell[0];
            int col = cell[1];
             
            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];
                
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n && distance[newRow][newCol] == -1) {
                    distance[newRow][newCol] = distance[row][col] + 1;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
        }   
              
           
        int maxDist = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) { 
                    maxDist = Math.max(maxDist, distance[i][j]);
                }
            }
        }   
        
        return maxDist;
    }
}
