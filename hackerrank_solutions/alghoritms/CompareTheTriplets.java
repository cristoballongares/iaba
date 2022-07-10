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

    int a[] = new int[3];
    int b[] = new int[3];
    int i,j,aCount=0,bCount=0;

        for(i=0;i<3;i++){
            a[i] = in.nextInt();
            b[i] = in.nextInt();

                if(a[i]>b[i]){
                    aCount++;
                } else if(b[i]>a[i]){
                    bCount++;
                } else{

                }
            }
        
        System.out.printf("%d | %d\n",aCount,bCount);


    }
}