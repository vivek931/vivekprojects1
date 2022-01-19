// Vivek Bojja, Sec:30, Student ID : 999901375.

import java.util.Scanner;

public class PrimeFactor {
    private static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args []){
        int n,i = 2,input;
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number between 111 and 900: ");
        n = sc.nextInt();

        while(n<111 || n>900){
            System.out.println("Invalid input");
            System.out.print("Enter a number between 111 and 900: ");
            n = sc.nextInt();
        }

        System.out.print(n+" = ");

        String result = "";

        while (n > 1){
            if(isPrime(i)){
                while (n%i == 0){
                    result += i+"*";
                    n = n / i;
                }
            }
            i++;
        }

        System.out.println(result.substring(0,result.length()-1));
    }
}