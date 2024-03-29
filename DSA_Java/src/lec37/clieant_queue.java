package lec37;

public class clieant_queue {
public static void main(String[] args) {
	queue Q = new queue();
	Q.add(10);
	Q.add(20);
	Q.add(30);
	Q.add(40);
	System.out.println(Q.poll());
	System.out.println(Q.poll());
	System.out.println(Q.poll());
	System.out.println(Q.poll()) ;
}
}
