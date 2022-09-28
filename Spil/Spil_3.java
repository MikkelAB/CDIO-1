package Spil;

import java.util.Scanner;
import java.lang.Math;
public class Spil_3 {
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
        int six = 0;

        while (true) {
            while (to2 < 40 && to < 40) {
                int x = 0;
                while (x != 32) {
                    System.out.println("klik space og enter for at slå");

                    char z = input.nextLine().charAt(0);
                    x = z;

                }
                int d1 = (int) (Math.random() * (max - min + 1) + min);
                int d2 = (int) (Math.random() * (max - min + 1) + min);

                //Terningerne har d1 og d2
                System.out.println("Første terning viser " + d1+ " øjne");
                System.out.println("Anden terning viser " +d2 + " øjne");
                //Summen af terningerne er s
                int s = d1 + d2;
                if (s != 2) {
                    System.out.println("Summen af terningerne er " +s );
                }


                if (t == 0) {
                    //Spiller 1 = total
                    to = s + to;

                    //Hvis man slå to 1 bliver total 0
                    if (s == 2) {
                        to = 0;
                        System.out.println(navn1 + " slog desværre dobbelt 1 og har derfor 0 point, men stadig ekstra tur :)");
                        break;
                    }
                    //Hvis man slå to ens terninger får man en tur mere
                    if (d1 == d2) {
                        System.out.println(to + " er " + navn1 + "s total");
                        System.out.println(navn1 + " fik et dobbelt slag og får derfor en ekstra tur");
                       //Hvis man slår dobbelt 6
                        if (s == 12) {
                            six = six + 1;
                            if (six == 2) {
                                System.out.println("tilykke spiller " + navn1 + " har vundet!");
                                System.exit(1);
                            }
                            System.out.println(navn1+" slog to 6, hvis dit næste slag er det samme vinder du");
                            break;
                        }
                        break;
                    }
                    System.out.println(to + " er " + navn1 + "s total");
                    System.out.println("Nu er det " + navn2 + "s tur");
                    t = 1;
                    six = 0;


                } else if (t == 1) {
                    //Spiller 2 = total
                    to2 = s + to2;
                    //Hvis man slår to 1 bliver total 0
                    if (s == 2) {
                        to2 = 0;
                        System.out.println(navn2 + " slog desværre dobbelt 1 og har derfor 0 point, men stadig ekstra tur :)");
                        break;
                    }
                    //Hvis man slår to ens terninger får man en tur mere
                    if (d1 == d2) {
                        //Hvis man slår dobbelt 6
                        if (s == 12) {
                            six = six + 1;
                            if (six == 2) {
                                System.out.println("tilykke spiller " + navn2 + " har vundet!");
                                System.exit(1);
                            }
                            System.out.println(navn2+" slog to 6, hvis dit næste slag er det samme vinder du");
                            break;
                        }
                            System.out.println(to2 + " er " + navn2 + "s total");
                            System.out.println(navn2 + " fik et dobbelt slag og får derfor en ekstra tur");
                            break;
                        }
                        System.out.println(to2 + " er " + navn2 + "s total");
                        System.out.println("Nu er det " + navn1 + "s tur");
                        t = 0;
                        six=0;

                    }
                    if (to >= 40) {
                        System.out.println(navn1 + " vandt med " + to);
                        System.out.println(navn2 + " endte med " + to2);
                        System.exit(1);
                    }
                    if (to2 >= 40) {
                        System.out.println(navn2 + " vandt med " + to2);
                        System.out.println(navn1 + " endte med " + to);
                        System.exit(1);
                    }


                }
            }
        }
    }


