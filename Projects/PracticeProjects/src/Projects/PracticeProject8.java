 package Projects;

public class PracticeProject8 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Dhanush");
		sb.append(" Kumar");
		sb.insert(13, " Gangabathina");
		System.out.println(sb);
		StringBuilder sbd = new StringBuilder("Dhanush Kumar Gangabathina");
		sbd.reverse();
		System.out.println(sbd);
	}

}
