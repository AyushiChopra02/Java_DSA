package lec26;

public class climb_stair {
public static void main(String[] args) {
	kuud(0 , "" , 4);
}
public static void kuud(int curr , String path , int dest) {
	if(curr == dest) { //+ve Base Case
		System.out.println(path);
		return ;
		
	}
	if(curr > dest) {
		return ;
	}
	kuud(curr +1 ,  path+1 , dest);
	kuud(curr+2 , path+2 , dest);
}
}
