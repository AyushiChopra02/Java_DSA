package questn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mazepath_D {

    static void countWays(int i, int j, int N, int[] ans, StringBuilder curr, List<String> res ){

        if( i==N || j==N )
            return ;
        if(i==N-1 && j==N-1 ){
            res.add(curr.toString())  ;
            ans[0]++;
            return;
        }

        curr.append('V');
        countWays(i+1,j,N,ans,curr,res);
        curr.deleteCharAt(curr.length()-1);
        curr.append('H');
        countWays(i,j+1,N,ans,curr,res);
        curr.deleteCharAt(curr.length()-1);

        if( i==j ){
            curr.append('D');
            countWays(i+1,j+1,N,ans,curr,res);
            curr.deleteCharAt(curr.length()-1) ;
        } 

    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt();
        sc.close();

        int[] ans = {0};
        StringBuilder curr = new StringBuilder();
        List<String> res = new ArrayList<>();
        countWays(0,0,N,ans,curr,res);

        System.out.println(ans[0]);
        for(String str : res)
            System.out.print(str + " ");
        System.out.println();
    }
}
