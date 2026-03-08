
public class Person {
int id;
String email;
int age;

public Person(int id,String email,int age) {
	this.id=id;
	this.email=email;
	this.age=age;
		
}
public String toString() {
	return "id"+id+"email"+email+"age"+age;
}
public int hashCode() {
	return id;
}
public boolean equals(Person p2) {
	if(p2.email==this.email && p2.hashCode()==this.hashCode()) {
		return true;
	}
	else {
		return false;
	}
	
}

}
