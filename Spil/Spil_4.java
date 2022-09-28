package Spil;

import java.util.Scanner;

public class Spil_4 { public static void main(String[] args) {
// Giver farver til tekst i konsollen.
    final String TEXT_RESET = "\u001B[0m";
    final String TEXT_RED = "\u001B[31m";
    final String RED_BOLD = "\033[1;91m";
    final String TEXT_BLUE = "\u001B[34m";
    final String BLUE_BOLD = "\033[1;94m";
    final String GREEN_BOLD = "\033[1;92m";

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
    int six = 0;

    while (true) {
        while (to2 < 4000 && to < 4000) {
            int x = 0;
            while (x != 32) {
                System.out.println("Klik space og enter for at slå");
                char z = input.nextLine().charAt(0);
                x = z;
            }
            int d1 = (int) (Math.random() * (max - min + 1) + min);
            int d2 = (int) (Math.random() * (max - min + 1) + min);



            //Terningerne har d1 og d2
            System.out.println( TEXT_RESET+" Terning 1:  "+" Terning 2: ");
            System.out.println( "      "+BLUE_BOLD+d1+ "       "+BLUE_BOLD+d2 );
            //Summen af terningerne er s
            int s = d1 + d2;
            if (s != 2) {
                System.out.println(GREEN_BOLD+s +TEXT_RESET+ " er summen af terningerne");
            }


            if (t == 0) {
                //Spiller 1 = total
                to = s + to;


                //Hvis man slå to 1 bliver total 0
                if (s == 2) {
                    to = 0;
                    System.out.println(TEXT_RED+navn1 +RED_BOLD+ " slog desværre dobbelt 1 og har derfor 0 point, men stadig ekstra tur :)");
                    break;
                }
                //Spilleren vinder når man slår to ens og man er over 40 points
                if (to>40 && d1==d2){
                    System.out.println(RED_BOLD+"Tilykke "+TEXT_RED+ navn1 + " Vinder");
                    System.exit(1);
                }


                //Hvis man slå to ens terninger får man en tur mere
                if (d1 == d2) {
                    System.out.println( TEXT_RED+navn1 +TEXT_RESET+ "s total er "+GREEN_BOLD+to);
                    System.out.println(TEXT_RED+navn1 + RED_BOLD+" fik et dobbelt slag og får derfor en ekstra tur");
                    //Hvis man slår dobbelt 6
                    if (s == 12) {
                        six = six + 1;
                        if (six == 2) {
                            System.out.println(RED_BOLD+"Tilykke spiller " +TEXT_RED+ navn1 + RED_BOLD+" har vundet!");
                            System.exit(1);
                        }
                        System.out.println(TEXT_RED+navn1+RED_BOLD+" slog to 6, hvis dit næste slag er det samme vinder du");
                        break;
                    }
                    break;
                }
                System.out.println(TEXT_RED+ navn1 + TEXT_RESET+"s total er "+GREEN_BOLD+to);
                System.out.println(TEXT_RESET+"Nu er det " + TEXT_BLUE+navn2 + TEXT_RESET+"s tur");
                t = 1;
                six = 0;


            } else if (t == 1) {
                //Spiller 2 = total
                to2 = s + to2;
                //Hvis man slår to 1 bliver total 0
                if (s == 2) {
                    to2 = 0;
                    System.out.println(TEXT_BLUE+navn2 +RED_BOLD+ " slog desværre dobbelt 1 og har derfor 0 point, men stadig ekstra tur :)");
                    break;
                }
                //Spilleren vinder når man slår to ens og man er over 40 points
                if (to>40 && d1==d2){
                    System.out.println(RED_BOLD+"Tilykke "+ TEXT_BLUE+navn2 + RED_BOLD+" Vinder");
                    System.exit(1);
                }

                //Hvis man slår to ens terninger får man en tur mere
                if (d1 == d2) {
                    //Hvis man slår dobbelt 6
                    if (s == 12) {
                        six = six + 1;
                        if (six == 2) {
                            System.out.println(RED_BOLD+"Tilykke spiller " + TEXT_BLUE+navn2 +RED_BOLD+ " har vundet!");
                            System.exit(1);
                        }
                        System.out.println(TEXT_BLUE+navn2+RED_BOLD+" slog to 6, hvis dit næste slag er det samme vinder du");
                        break;
                    }
                    System.out.println(TEXT_BLUE+ navn2 +TEXT_RESET+ "s total er "+GREEN_BOLD+to2);
                    System.out.println(TEXT_BLUE+navn2 + RED_BOLD+" fik et dobbelt slag og får derfor en ekstra tur");
                    break;
                }
                System.out.println( TEXT_BLUE+navn2 +TEXT_RESET+ "s total er "+GREEN_BOLD+to2);
                System.out.println(TEXT_RESET+"Nu er det " + TEXT_RED+navn1 + TEXT_RESET+"s tur");
                t = 0;
                six=0;

            }
            if (to >= 40 && d1==d2) {
                System.out.println(TEXT_RED+navn1 +TEXT_RESET+ " vandt med " + GREEN_BOLD+to);
                System.out.println(TEXT_BLUE+navn2 + TEXT_RESET+" endte med " + GREEN_BOLD+to2);
                System.exit(1);
            }
            if (to2 >= 40 && d1==d2) {
                System.out.println(TEXT_BLUE+navn2 +TEXT_RESET+ " vandt med " +GREEN_BOLD+ to2);
                System.out.println(TEXT_RED+navn1 +TEXT_RESET+ " endte med " + GREEN_BOLD+to);
                System.exit(1);
            }


        }
    }
}
}
