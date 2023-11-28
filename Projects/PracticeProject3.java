package Projects;

public class PracticeProject3 {
    public static void MethodWithoutParameters() {
        System.out.println("HI!");
    }
    public static void MethodWithParameters(String message) {
        System.out.println("Message: " + message);
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static void displayDetails(String name, int age, double height) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
    }
    public static void main(String[] args) {
    	MethodWithoutParameters();
    	MethodWithParameters("Calling a method with parameters");
        int result = add(3, 7);
        System.out.println("Result of addition: " + result);
        displayDetails("Dhanush", 22, 178);
    }
}
