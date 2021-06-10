package exeptions;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

	public static void main(String[] args) {
		try {
			List<Integer> recordedTemperatureInDegreesCelcius = new ArrayList<Integer>();

			/** Remplissage de la liste à partir des valeur fournies en ligne de commande */
			for (String stringRepresentationOfTemperature : args) {
				int temperature = Integer.parseInt(stringRepresentationOfTemperature);
				recordedTemperatureInDegreesCelcius.add(temperature);
			}

//			/** Protection contre la liste vide */
//			if(recordedTemperatureInDegreesCelcius.size()==0) {
//				System.out.println("Cannot calculate average of empty list");
//			}else {
			/** Calcul et affiche de la température moyenne */
			int averageTemperature = SimpleMaths.calculateAverage(recordedTemperatureInDegreesCelcius);
			System.out.println("the average temperature is : " + averageTemperature);
//		}
		} catch (NumberFormatException e) {
			System.out.println("All argument should be provided as numbers");
			System.exit(-1);
		} catch (ArithmeticException e) {
			System.out.println("At least one temperature should be provided");
			System.exit(-1);
		}
	}
}
