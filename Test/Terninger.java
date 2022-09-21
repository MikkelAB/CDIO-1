package Test;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class Terninger {

        public static void main(String[] args) {


            Scanner input = new Scanner(System.in);
            int n;
            int min=1;
            int max=6;
            int d1= (int)(Math.random()*(max-min+1)+min);
            int d2=(int)(Math.random()*(max-min+1)+min);
            //Terningerne har d1 og d2
            System.out.println(d1);
            System.out.println(d2);
            //Summen af terningerne er s
            int s=d1+d2;
            System.out.println(s);






        }
}
