package exeptions;

import java.util.List;

public class SimpleMaths {
	
	/** Calcul de la valeur moyenne d'une liste d'entiers  */
	public static int calculateAverage(List<Integer> listOfIntegers) {
		int average = 0;
//		if(listOfIntegers.size()==0) {
//			return 0;
//		}else {
			for(int value : listOfIntegers) {
				average+=value;
			}
			average/=listOfIntegers.size();
			return average;
		}
		
	}
	
//}
