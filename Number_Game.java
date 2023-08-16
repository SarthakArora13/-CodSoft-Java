import java.util.Scanner;
import java.util.Random;

public class Number_Game {
    static int generator(int s, int e) {
        int number;
        Random r = new Random();
        number = r.nextInt((e - s) + 1) + s;
        return number;
    }

    public static void main(String arg[]) {
        System.out.println("Number guessing Game created by Sarthak Arora");
        Scanner s = new Scanner(System.in);
        int a = 1,g,d;
        while (a != 0) {
            int n;
            n = generator(1, 100);
            for (int i = 0; i < 3; i++) {
                System.out.println("Enter the Guess Number");
                g=s.nextInt();
                if(g>n){
                    d=g-n;
                    if(d>=20) {
                        System.out.println("You are too high");
                    }
                    if(d>=10 && d<20) {
                        System.out.println("You are very high");
                    }
                    if(d>=5 && d<10) {
                        System.out.println("You are high");
                    }
                    if(d>=1 && d<5){
                        System.out.println("You are little high");
                    }

                }
                if(g<n){
                    d=n-g;
                    if(d>=20) {
                        System.out.println("You are too low");
                    }
                    if(d>=10 && d<20) {
                        System.out.println("You are very low");
                    }
                    if(d>=5 && d<10) {
                        System.out.println("You are low");
                    }
                    if(d>=1 && d<5){
                        System.out.println("You are little low");
                    }
                }
                if(g==n){
                    System.out.println("Congo You guessed right");
                }

            }
            System.out.println("The number was... "+n);
            System.out.println("Want to play more ?");
            System.out.println("Y=1 or N=0");
            a=s.nextInt();
            if(a==0){
                break;
            }
        }
    }
}