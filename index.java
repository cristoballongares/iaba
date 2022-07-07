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

long[] arr = new long[5];
int i,j;
long k=0,l=0;

    for(i=0;i<arr.length;i++){
        arr[i] = in.nextLong();

    }
    Arrays.sort(arr);
    for(j=1;j<arr.length;j++){
        k+=arr[j];
    }

    for(j=0;j<arr.length-1;j++){
        l+=arr[j];
    }
System.out.println(l+" "+k);

    }
}