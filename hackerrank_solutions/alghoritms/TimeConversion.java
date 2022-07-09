import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	

public class index{

    public static String
    removingUpperCaseCharacters(String la)
    {
 
        String regex = "[A-Z]";
 
        Pattern pattern = Pattern.compile(regex);
 
        Matcher matcher = pattern.matcher(la);
 
        return matcher.replaceAll("");
    }


    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
String time;
int count=0,i=11,sum=0,j=11,res=0;
System.out.print("Ingresa la hora formato HH:mm:ssPM/AM : ");
time = in.next();

String[] oh = time.split(":");

int hour = Integer.parseInt(oh[0]);
String la = String.valueOf(oh[2]);
la = la.substring(0,0) + la.substring(2);
int n = hour;
sum = hour+i;
res = hour-j;
System.out.println(la);
switch(la){
	case "PM":
		while(i<=sum){
		i++;
	}
	la = la.substring(0,2);
	System.out.println(i+":"+oh[1]+":"+la);
	break;

	case "AM":
		if(hour==12){
			while(j>=res){
				j--;
			}
			System.out.println(j+":"+oh[1]+":"+removingUpperCaseCharacters(la));
			}else{				
				System.out.println(oh[0]+":"+oh[1]+":"+la);
			}
				break;
}

    }
}