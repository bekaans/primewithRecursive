import java.util.Scanner;

public class Main {
    static int prime(int a) {
        for (int i = 2; i < a; i++)
        {

            if (i < a && a%i==0)
            {
                System.out.println("Asal Değildir");
                break;
            }
       //--------------------------------------------------------------
            else
            {
                System.out.println("Asaldır");
                break;
            }
        }return 1;}
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Değerinizi giriniz :");
        int deger = input.nextInt();
        prime(deger);

    }
}