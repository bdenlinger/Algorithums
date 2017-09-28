/* 
 * This file is part of an Algorithums test library
 * Brian Denlinger
 * brian.denlinger1@gmail.com
 * 
 * THis is free software: you can redistribute it and/or modify  
 * it under the terms of the GNU Lesser General Public License as   
 * published by the Free Software Foundation, version 2.1.
 *
 * This is distributed in the hope that it will be useful, but 
 * WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Bogosort<String> bogosort = new Bogosort<String>();
		List<String> input = new ArrayList<String>();
		List<String> output = new ArrayList<String>();
		input.add("Evan");
		input.add("Brian");
		input.add("Eric");
		input.add("Shannon");
		input.add("LeeAnn");
		input.add("Rick");
		input.add("Cindy");
		input.add("Jesse");
		input.add("Liesel");
		input.add("Britney");	
		
		long startTime = System.nanoTime();
		output = bogosort.sort(input);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		System.out.println("Execution took " + duration/1000000 + " milliseconds.");
		printList(output);		
	}
	
	private static <T> void printList(List<T> ltp) {
		ltp.forEach((k)->System.out.println(k));
	}
}