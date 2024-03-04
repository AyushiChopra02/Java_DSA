package lec33;

public class Oops_swap {
public static void main(String[] args) {
	Student s1 = new Student();
	s1.Name = "A";
	s1.age = 10;
	Student s2 = new Student();
	s2.Name ="B";
	s2.age =20;
	System.out.println(s1.Name + s1.age);
	System.out.println(s2.Name + s2.age);
	Test2(s1 , s2);
	//swapping k baad print
	System.out.println(s1.Name + s1.age);
	System.out.println(s2.Name + s2.age);
}
public static void Test2(Student s1 , Student s2) {
	//name k lie
	String temp_s =s1.Name;
	s1.Name = s2.Name;
	s2.Name = temp_s;
	//Age k lie
	int temp_i = s1.age;
	s1.age = s2.age;
	s2.age = temp_i;
}

}
