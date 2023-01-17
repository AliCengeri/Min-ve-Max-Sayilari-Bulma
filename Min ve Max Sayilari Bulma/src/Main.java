import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, n1, max = 0 , min = 0;
        int k = 1;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();
        while (n > 0) {
            System.out.print(k + ". Sayıyı giriniz: ");
            n1 = input.nextInt();
            if (k == 1){
                max = n1;
                min = n1;
            }
            if (n1 > max){
                max = n1;
            }
            if (n1 < min){
                min = n1;
            }
            k++;
            n--;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}