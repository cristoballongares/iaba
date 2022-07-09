import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.time.format.DateTimeFormatter


public class index{


    public static void main(String[] args) {
DateTimeFormatter dtf = DateTimeFormatter.offPatter("hh:mm:ssa")

	Scanner in = new Scanner(System.in);
	String time = in.nextLine();
	   DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
       DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");
Date date = null;

try{
	date = inFormat.parse(s);
}catch(ParseException e){
	e.printStackTrace();
}

if(date!=null){
	String outdate = outFormat.format(time);
	System.out.println(time);
}

    }
}
/* Other solution... 
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class index{

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
System.out.println(la);
System.out.println(hour);
int n = hour;
sum = hour+i;
res = hour-j;
switch(la){
	case "PM":
		while(i<=sum){
		i++;
	}
	la = la.substring(0,0) + la.substring(2);

	System.out.println(i+":"+oh[1]+":"+oh[2]);
	break;

	case "AM":
			if(hour==12){
				while(j>=res){
					j--;
				}
				System.out.println(j+":"+oh[1]+":"+oh[2]);		
			}

			System.out.println(oh[0]+":"+oh[1]+":"+oh[2]);

		break;
}

    }
}

*/
