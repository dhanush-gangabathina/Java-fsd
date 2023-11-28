package Projects;

 class PracticeProject2 {
	 public int publicField = 10;
	 private int privateField = 20;
	 protected int protectedField = 30;
	 int defaultField = 40;
	 public void publicMethod() {
	     System.out.println("Public Method");
	 }
	 private void privateMethod() {
	     System.out.println("Private Method");
	 }
	 protected void protectedMethod() {
	     System.out.println("Protected Method");
	 }
	 void defaultMethod() {
	     System.out.println("Default Method");
	 }
  public static void main(String[] args) {
	  PracticeProject2 pp = new PracticeProject2();
      System.out.println("Public Field: " + pp.publicField);
      pp.publicMethod();
      System.out.println("Protected Field: " + pp.protectedField);
      pp.protectedMethod();
      System.out.println("Default Field: " + pp.defaultField);
      pp.defaultMethod();
  }
}





