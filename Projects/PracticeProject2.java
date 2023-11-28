package Projects;
 class PracticeProject2 {
	 public int publicField = 7;
	 private int privateField = 3;
	 protected int protectedField = 9;
	 int defaultField = 5;
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
      System.out.println("Private Field: "+ pp.privateField);
      pp.privateMethod();
      System.out.println("Protected Field: " + pp.protectedField);
      pp.protectedMethod();
      System.out.println("Default Field: " + pp.defaultField);
      pp.defaultMethod();
  }
}





