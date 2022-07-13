import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.math.*;
public class index{

public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  
		public static void main(String[] args) {
	var console = new Scanner(System.in);
	var aleatorio = new Random();

	int[] arr = new int[10], position = new int[10];
	int limit= -1;
	int findNumber;

	// Create random numbers

		for(int i=0;i<10;i++){
			arr[i] = aleatorio.nextInt(10)+1;
			}
			System.out.println("Number searched >> ");
			findNumber = console.nextInt(); console.nextLine();

		for(int i=0;i<10;i++){
			if(findNumber==arr[i]){
				limit++;
				position[limit]=i;
			}
		}

	System.out.print("Original array:");
	for(int i:arr){
		System.out.print(" "+i);
	}
	
	System.out.print("\nNumero buscado: "+findNumber);
	System.out.print("\nPosiciones: ");

		for(int i=0;i<=limit;i++){
			System.out.print(" "+position[i]);
		}
	System.out.println("");
}
}