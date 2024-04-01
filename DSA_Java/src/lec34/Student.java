package lec34;

public class Student {
String Name ="gun shudaa" ;
int Age = 10;
public void Intro() {
	System.out.println(Name + "-" + Age);
	System.out.println(this);
}
public void partyWith(String Name) {
	System.out.println(this.Name + "party with" + Name);
}
public Student() {
	
}
public Student(int I) {
	Age = I ;
}
public Student(String str) {
	Name = str;
}
}
