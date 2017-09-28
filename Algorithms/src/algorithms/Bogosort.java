package algorithms;

import java.util.List;
import java.util.Random;

/*
 * See https://en.wikipedia.org/wiki/Bogosort for more details.
 * Takes set and randomizes order. If not in order repeat.
 */
public class Bogosort<T> {
	
	public List<T> sort(List<T> input) {
		//Return if empty List passed
		if(input.isEmpty()) {
			return input;
		}
		
		Random n = new Random();
		
		int count = 0;//Count number of iterations to sort
		
		//Check if sorted, and attempt sort if false.
		while(!this.isSorted(input)) {
			for(int i = input.size()-1; i > 0; i--) {
				int num = n.nextInt(input.size()-1);
				T s = input.get(i);
				input.remove(i);
				input.add(num, s);
			}
			count++;
		}		
		System.out.println(count + " Iteratons later...");		
		return input;		
	}
	
	private boolean isSorted(List<?> input) {
		for(int i = 0; i < input.size()-1; i++) {
			if(input.get(i).toString().compareTo(input.get(i+1).toString()) > 0) {
				return false;
			}
		}		
		return true;
	}
};
