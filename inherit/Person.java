package inherit;

public class Person {
int age;
String name;

Person(){
	
}
Person(int age){
	this.age=age;
}

Person(int age,String name){
	this(age);
	this.name=name;
}
public void displayPer() {
	System.out.println(age);
	System.out.println(name);
	
	
}
}
