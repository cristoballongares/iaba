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