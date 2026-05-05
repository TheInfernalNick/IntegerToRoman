////////////////////////////////////////////////////////////////////
// [NICOLo'] [LIMA] [2137970] 
// [JACOPO] [ANTONELLO] [2147953] 
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int input = 1;
        System.out.println("Benvenuto nel convertitore di numeri da arabi a romani");
        while(input > 0){
            System.out.println("Inserisci un numero e verrà convertito, inserisci un numero minore di 1 e interromperai l'esecuzione ");    
            Scanner scan = new Scanner(System.in);
            input = scan.nextInt();
            if(input > 0)
                new RomanPrinter(input);
        }
        
    }
}
