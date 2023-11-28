package Projects;
import java.util.HashMap;
import java.util.Map;
public class PracticeProject6 {
	public static void main(String[] args) {
		HashMap<String,Integer> empIds = new HashMap();
		empIds.put("Dhanush", 4428);
		empIds.put("Kumar", 5231);
		empIds.put("Chandu", 8764);
		empIds.put("Sumanth", 4381);
		System.out.println(empIds);	
		//to get employee id
		System.out.println(empIds.get("Kumar"));
		//checking whether key is present or not
		System.out.println(empIds.containsKey("Sumanth"));
		//checking whether value is present or not
		System.out.println(empIds.containsValue(5376));
		//to replace a value
		empIds.replace("Kumar", 1234);
		System.out.println(empIds);
		}
}
