package Spil;

import java.util.Scanner;
import java.lang.Math;
public class Spil_2 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Skriv første spillers navn");
        String navn1 = input.nextLine();
        System.out.println("Skriv anden spillers navn");
        String navn2 = input.nextLine();

        int min = 1;
        int max = 6;
        int t = 0;
        int to = 0;
        int to2 = 0;

        while (true) {
            while (to2 < 40 && to < 40) {
                int d1 = (int) (Math.random() * (max - min + 1) + min);
                int d2 = (int) (Math.random() * (max - min + 1) + min);
                //Terningerne har d1 og d2
                System.out.println(d1);
                System.out.println(d2);
                //Summen af terningerne er s
                int s = d1 + d2;
                System.out.println(s);


                if (t == 0) {
                    //Spiller 1 = total
                    to = s + to;

                    //Hvis man slå to 1 bliver total 0
                    if (s == 2) {
                        to = 0;
                        break;
                    }
                    //Hvis man slå to ens terninger får man en tur mere
                    if (d1==d2){
                        break;
                    }
                    System.out.println(to);
                    t = 1;


                } else if (t == 1) {
                    //Spiller 2 = total
                    to2 = s + to2;
                    //Hvis man slår to 1 bliver total 0
                    if (s == 2) {
                        to = 0;
                        break;
                    }
                    //Hvis man slår to ens terninger får man en tur mere
                    if (d1==d2){
                        break;
                    }
                    System.out.println(to2);
                    t = 0;

                }
                if (to >= 40) {
                    System.out.println(navn1 + " vandt med " + to);
                    System.out.println(navn2 + " endte med " + to2);
                }
                if (to2 >= 40) {
                    System.out.println(navn2 + " vandt med " + to2);
                    System.out.println(navn1 + " endte med " + to);
                }


            }
        }
    }
}
