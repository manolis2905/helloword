package gr.dit.hua.helloword;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello word");
		Person1 x;
		Person1 y;
		x=new Person1("Manolis","Soiles", 25);
		y=new Person1("Florios","Soiles", 30);
		System.out.println("My name is " + x.getFirstname() + ".");
		y.setFirstname("Giannis");
		System.out.println("My name is " + y.getFirstname() + ".");
	}

}
