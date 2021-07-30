package NAVEENQUESTIONS;

public class StringBufferExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s=new StringBuffer("harshini");
		System.out.println(s.capacity());
		String s1="anuroop";
		String s2="harshini123";
		s2=s2.replaceAll("[0-9]","");
		System.out.println(s2);
		//StringBuffer sb2= new StringBuffer(s1);
		

	}

}
