package lec37;

public class client {
public static void main(String[] args) {
	//Case1
	C obj1 = new C();
	System.out.println(obj1.dataP);
	System.out.println(obj1.dataC);
	
	
	System.out.println(obj1.data); // variable  ka collison is resolved by RHS
	//jis b type ka obj1 adrss h us type ka data call kr skte h
	System.out.println(((P)obj1).data);
	
	
	//Case2
     P obj2 = new C();//complier only looks at LHS kuki jb m obj2. kri hu to muje child c ki prpty nai dikhri
     //runtime (JVM) dekhte h RHS
     //agr child C ki properties dekhni h to pahle type caste krenge C m fr uski prpty acss kr skte
     System.out.println(obj2.dataP);
     System.out.println(((C)obj2).data);
     System.out.println(((C)obj2).dataC);
     
     
     //Case3
     P obj3 = new C();
     System.out.println(obj3.dataP);
     //obj3 k trgh sari prpty acss krte kuki iske pass dono ki h
     
     //case 4 never exist
     //C obj4 = new P();
}
}
