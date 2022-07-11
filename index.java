import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class index{

public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
}  

public static class Coche{
 String color,marca;
 int km;
}
		public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int inputNumber,minNumber=0,maxNumber=0,aki;
String option;
boolean win = false,trampa = false;

System.out.println("Adinivinare cualquier numero que pienes... de cualquier rango ej (0-100),(50-100),etc");
System.out.println("Cuando ponga cualquier numero deberas poner: ");
System.out.println("< Si es menor al numero que coloque");
System.out.println("> Si es mayor al numero que coloque");
System.out.println("= Si es igual al numero que coloque");
System.out.printf("Dime el rango menor: ");
minNumber = in.nextInt();
System.out.printf("Dime el rango mayor: ");
maxNumber = in.nextInt();

	for(int i=1;i<=20;i++){
	inputNumber = ((maxNumber-minNumber) / 2) + minNumber;
		System.out.printf("El numero es %d\n",inputNumber);
		option=in.nextLine();

		switch(option){
			case "<":
				maxNumber=inputNumber-1;
				break;
			case ">":
				minNumber=inputNumber+1;
				break;
			case "=":
				win = true;
				break;
		}

		if((minNumber>maxNumber)|| (maxNumber<minNumber)){
			trampa=true;
			break;
		} else if(win){
			break;
		}

	}

if(win){
	System.out.println("GANEEE, ez gg bot ezzZZzz, comprate unas manos");
} else if(trampa) {
	System.out.println("TRAMPOSO");

}




	}
}