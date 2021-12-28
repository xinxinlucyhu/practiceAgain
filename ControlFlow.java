import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> cars = new HashMap<>();
		Scanner input = new Scanner(System.in);
		System.out.println("What kind of car are you looking for?");
		String car = input.nextLine();
		
		cars.put("Versa note", "Nissan");
		cars.put("Frontier" , "Nissan");
		cars.put("Civic" , "Honda");
		cars.put("Odyssey" , "Honda");
		
		

		//loop through the hash map and return each key/value pair
		//for (Map.Entry<String, String> entry : cars.entrySet()){
		for(Map.Entry<String, String> entry : cars.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if(key.equals(car)) {
				System.out.println("Yes, we have it! It is a " + value +" car. ");
			
			}
		}
	}

}
