package combine_strings;

import java.util.ArrayList;
import java.util.List;

public class Combine_Strings {

	public static void main(String[] args) {
		
		initPlanets();	
	}

	private static void initPlanets() {
		List <String> planets = new ArrayList<String>();
		planets.add("Mercury");
		planets.add("Venus");
		planets.add("Mars");
		joinString(planets);
	}

	private static void joinString(List<String> planets) {
		// TODO Auto-generated method stub
		String reduceString = planets.stream().reduce("Planets: ", (s1,s2)->s1.concat(s2+", "));
		System.out.println(reduceString);
	}

}
