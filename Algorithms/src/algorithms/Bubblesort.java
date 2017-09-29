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

import java.util.List;

public class Bubblesort<T> {
	
	@SuppressWarnings("unchecked")
	public List<T> sort(List<T> input) {
		if(input.isEmpty()) {
			return input;
		}
		boolean isSorted;
		do {
			isSorted = true;
			for(int i = 0; i < input.size()-1; i++) {
				String left = input.get(i).toString();
				String right = input.get(i+1).toString();
				if(left.compareTo(right) > -1) {
					input.set(i, (T) right);
					input.set(i+1, (T) left);
					isSorted = false;
				}		
			}
			
		}while(!isSorted);
		
		return input;
	}
	

}
