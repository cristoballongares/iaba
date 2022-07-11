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

	while(inputNumber!=secretNumber&&count!=10){ // Mientras el numero ingresado no se igual al numero random o el numero de intentos no llegue a 10, esto se hara

		System.out.printf("Intento %d: ",count+1); //Introducimos el numero 
		inputNumber = in.nextInt();
			if(inputNumber>secretNumber){ // Pistas
				System.out.printf("El numero a adivinar es mayor\n"); // Si el numero introducido es mayor al numero random..
			} else if(inputNumber<secretNumber){
				System.out.printf("El numero a adivinar es menor\n"); // Si el numero introducido es menor al numero random..
			}else if(inputNumber==secretNumber){ // Si adivino, aqui termina el ciclo.
				break;
			}
			count++; // Incrementamos el contador en 1
	}


	if(count==10){ // Si llega al limite de intentos
		System.out.printf("PERDISTE, el numero era %d\n", secretNumber);
	} else if(inputNumber==secretNumber){ // Si adivina...
		System.out.printf("GANASTE!!\n");
	} else {

	}

	}
}