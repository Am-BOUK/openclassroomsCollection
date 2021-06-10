package lambda;

public class Launcher {
	
	static int operate(int operand11, int operand22, InterfaceFonctionnelle1 myInterface) {
		return myInterface.operation(operand11, operand22);
	}
	
	public static void main (String arg[]) {
		
		InterfaceFonctionnelle1 add = (int x, int y) ->x+y;
		InterfaceFonctionnelle1 multiply = (int x, int y) ->x*y;

		int resultAdd = operate(2, 8, add);
		int resultMultiply = operate(2, 8, multiply);
		System.out.println("Resultat de addition = "+resultAdd);
		System.out.println("Resultat de multiplication = "+resultMultiply);
	
		InterfaceFonctionnelle2 fog = (String message)->{
			System.out.println("Hello "+message);
		};
		
		fog.sayMessage("Super Dev");
	}
}
