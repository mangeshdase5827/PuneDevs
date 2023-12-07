import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;


public class RomanSymbols {

	public static void main(String[] args){
		HashMap< String, Integer> romanMap = new HashMap<>();
		romanMap.put("I", 1);
		romanMap.put("V", 5);
		romanMap.put("X", 10);
		romanMap.put("L", 50);
		romanMap.put("C", 100);
		romanMap.put("D", 500);
		romanMap.put("M", 1000);
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		Integer value = convertStringToInteger(romanMap, str);
		System.out.println("Value :" +value);
		}
	}

	private static Integer convertStringToInteger(HashMap<String, Integer> romanMap, String str){
		String[] strSplit = str.split("");
		ArrayList<String> str2 = new ArrayList<>(Arrays.asList(strSplit));
		Integer value =0;
		for(int i=0; i<str2.size(); i++) {
			if(romanMap.containsKey(str2.get(i))){
			  	Integer integer = romanMap.get(str2.get(i));
			  	value = value + integer;
			}
			else {
				System.out.println("enter correct string...");
			}
		}
		return value;
	}

}
