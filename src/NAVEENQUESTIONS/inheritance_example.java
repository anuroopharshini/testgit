package NAVEENQUESTIONS;

public class inheritance_example {
	public static void main(String[] args) {
		
	
	baby b=new baby();
	b.m2();
	b.m1();
	
	}

}

class mother{
	public void m1() {
		System.out.println("hello");
	}
	
	
	
}

class baby extends mother{
	
	public void m2() {
		
		m1();
	}
	
	
	
	
}