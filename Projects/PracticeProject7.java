package Projects;
//class inside a class

class Practice7 {
	String name;
	public void OuterClass() {
		System.out.println("We are in Outer Class ");
	}
	 class Practice7_1 {
		 public void InnerClass() {
			 System.out.println("We are in Inner Class ");
		 }
	 }
}
public class PracticeProject7 {

	public static void main(String[] args) {
		//calling outer class
		Practice7 obj = new Practice7();
		obj.OuterClass();
		
		//calling inner class 
		Practice7.Practice7_1 obj1 = obj.new Practice7_1();
		obj1.InnerClass();
	}
}
