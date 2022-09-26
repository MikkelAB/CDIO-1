package Test;

public class test {
    public static void main(String[]argh){
       int max=6;
       int min=1;
       int t=0;
       while (t<1000) {
           int d1 = (int) (Math.random() * (max - min + 1) + min);
           int d2 = (int) (Math.random() * (max - min + 1) + min);
           //Terningerne har d1 og d2

           System.out.println(d2+d1);
           ++t;
       }
    }

}
