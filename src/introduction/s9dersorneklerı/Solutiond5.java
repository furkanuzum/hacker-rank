package introduction.s9dersorneklerı;

import java.util.Scanner;

/**
 * klawyeden sayı al 2 nın katı yada 5 ın katı olması
 */
public class Solutiond5 {
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi giriniz");
        sayi=scn.nextInt();

        if (sayi % 5 == 0)
            System.out.println("HiFive");
        if (sayi % 2 == 0)
            System.out.println("HiEven");
    }
}
