package oops.fundamenta.inheritance;

public class Child extends Parent {
	public void ChildMethod() {
		System.out.println("Child method");
	}
	//upcasting
	public static void main(String[] args) {
		Parent p=new Child();
		p.ParentMethod();
	
	Child c=(Child)p;
	c.ChildMethod();
	c.ParentMethod();
	
	Parent p2= new Parent();
	System.out.println(p2 instanceof Parent);
	System.out.println(p2 instanceof Child);
	System.out.println(p2 instanceof Child);
	if(p2 instanceof Child) {
		Child c3=(Child)p2;
		
	}
	else {
		System.out.println("upcasting is not done");
	}
	Child c2= new Child();
	System.out.println(c2 instanceof Child);
	System.out.println(c2 instanceof Parent);
	Parent p4=c2;
	if(p4 instanceof Child) {
		Child c5= (Child)p4;
		System.out.println("downcasting done");
			}
		}
	}
