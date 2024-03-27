
import java.util.Scanner;

public class Exercicio5 {

	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Para mutiplicar digite:");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 >= 0 && num2 >= 0) {
			System.out.println(num1 + "X" + num2 + "=" + num1 * num2);
		} else {
			System.out.println(num1 + "X" + num2 + "=" + num1 * num2);
		}
	}
	
}