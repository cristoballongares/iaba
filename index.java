import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.math.*;
import java.util.*;
public class index{

		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		// Array
		char[] characters = new char[4];
		String respuesta;
		char[] compareR = new char[4];
		// variables uso general
		int i=0,j,k,l,m,b=0,r=0,a,c;

		// Booleano para determinar si gano o pardio dksajdsd
		Boolean win = false;

		characters[0] = 'b';
		characters[1] = 'a';
		characters[2] = 'b';
		characters[3] = 'b';

		/*
		while(i<4){
		characters[i] = (char)(ran.nextInt(26)+'a');
		i++;
		}
		*/		
		for(char x:characters){
			System.out.print(x);
		}

		m=1;
		i=1;
		l=0;
		boolean case1,case2,case3 = false;
		System.out.println();
		System.out.println("Dispones de 10 intentos para adivinar la combinacion de palabras al azar!\n'B: x': Si la letra se encuentra en la mismsa posicion\n'R: x': Si la letra coincide pero no esta en la misma posicion");
		while(i<11){
			b=0; // puntaje
			r=0; // puntaje
			m=0;
			l=0;
			a=0;
			c=0;
			System.out.print("\nIntento "+i+"\nEscribe la combinacion que piensas que sea correcta >> [uhdl], [fkcy] ");
			respuesta = in.nextLine();
			System.out.println();
			i++;
			for(j=0;j<4;j++){
				compareR[j] = respuesta.charAt(j);
					if(compareR[j]==characters[j]){
						b++;
					}
			}
			for(k=0;k<4;k++){
				l=k+1;
				System.out.println("L: "+l); // Basicamente lo hago que es, comparar del 0 al 4, el del 4 al 0 del 0 a una posicion antes y asi aaaa
				if(compareR[0]==characters[k] && compareR[k]==characters[0] && compareR[0]!=characters[l-1] && compareR[l-1]!=characters[0] && compareR[k]!=characters[k] && l!=0){
						r++;
				System.out.println("0: "+r);
				 }
				if(compareR[1]==characters[k] && compareR[k]==characters[1] &&  compareR[1]!=characters[l-1] && compareR[l-1]!=characters[1] && compareR[k]!=characters[k] && l!=1){
						r++;
					System.out.println("1: "+r);
				} 
				if(compareR[2]==characters[k] && compareR[k]==characters[2] &&  compareR[2]!=characters[l-1] && compareR[l-1]!=characters[2] && compareR[k]!=characters[k] && l!=2){
						r++;
					System.out.println("2: "+r);
				} 
				if(compareR[3]==characters[k] && compareR[k]==characters[3] &&  compareR[3]!=characters[l-1] && compareR[l-1]!=characters[3] && compareR[k]!=characters[k] && l!=3){
						r++;
					System.out.println("3: "+r);
				}
			
			}
				

			/*
			}
			*/
			System.out.print("\nB: "+b+"\nR: "+r);

		
	}
}
}