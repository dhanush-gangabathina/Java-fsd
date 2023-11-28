package Projects;
import java.util.*;
public class PracticeProject4 {
	public int regNo;
	public String name;
	PracticeProject4(String str,int n){
		name=str;
		regNo=n;
	}
	public static void main(String[] args) {
	//default constructor
	PracticeProject4 pp4 = new PracticeProject4();
	System.out.println(pp4.regNo);
	System.out.println(pp4.name);

	}
	//parameterized constructor
	public PracticeProject4() {
		System.out.println("This is parameterized constructor");
		PracticeProject4 pp4 = new PracticeProject4("Def",357);
		System.out.println(pp4.name);
		System.out.println(pp4.regNo);
		regNo=2;
		name="Dhanu";
		System.out.println("This is default Constructor");
		
	}
}
