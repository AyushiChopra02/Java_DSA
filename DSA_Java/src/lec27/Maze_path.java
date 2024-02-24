package lec27;

public class Maze_path {
public static void main(String[] args) {
	solve(0,0,"",2,2);
}
	public static void solve(int r , int c ,String path , int des_r , int des_c) {
		//final destn jha phonchna
		if(r== des_r && c == des_c) {
			System.out.println(path);
			return;
		}
		//agr ise jayda chle gye to mtlb khai m gir gye
		if(r >des_r || c >des_c) {
			return;
		}
		//agr Right jayege to column m ek add
		//agr Down jayege to Row m ek add krenge
		solve(r ,c+1 , path +"R" , des_r , des_c);
		solve(r+1 ,c , path +"D" , des_r , des_c);
		
}
}
