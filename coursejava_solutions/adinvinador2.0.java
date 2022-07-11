import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class index{

public static class Coche{
 String color,marca;
 int km;
}
		public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Random numbers = new Random(); // Generamos numero random
	int count=0,inputNumber=0;
	int secretNumber = numbers.nextInt(100)+1; // Asigamos un valor aleatorio entre el 1 al 100

	System.out.println("Adinivinador 2.0 - Dispones de 10 intentos para adivinar.");

	while(inputNumber!=secretNumber&&count!=10){

		System.out.printf("Intento %d: ",count+1);
		inputNumber = in.nextInt();
			if(inputNumber>secretNumber){
				System.out.printf("El numero a adivinar es mayor\n");
			} else if(inputNumber<secretNumber){
				System.out.printf("El numero a adivinar es menor\n");
			}else if(inputNumber==secretNumber){
				break;
			}
			count++;
	}


	if(count==10){
		System.out.printf("PERDISTE, el numero era %d\n", secretNumber);
	} else if(inputNumber==secretNumber){
		System.out.printf("GANASTE!!\n");
	} else {

	}

	}
}