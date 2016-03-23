/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quicksort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static int swap;
    public static int comparation;
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("Aranacak dizi boyutunu giriniz: ");
        N=input.nextInt();
        Random r= new Random();
        int myArray[]= new int[N];
        for (int i=0; i<myArray.length; i++){
            int a=r.nextInt(100);
            myArray[i]=a;            
        }
              
        long startTime = System.nanoTime();
        for (int i=0;i<N; i++){
            quickSort(myArray,0, myArray.length-1);
        }
        long stopTime = System.nanoTime();
        System.out.println("quickSort toplam Süre:"+(stopTime - startTime)+" nanosaniye");
        System.out.println("quickSort karsılastirma sayisi:"+comparation+"\nquickSort toplam swap: "+swap);
        
       
    }

    public static void quickSort(int dizi[], int sol, int sag) { 
        int pivot, gecici, i,j;
        i=sol;
        j=sag;           
        pivot=dizi[(sol+sag)/2];            
        do {
            while(dizi[i]<pivot&& i<sag)
                i++;
                comparation++;
            while(pivot<dizi[j]&&j>sol)
                
                j--;
                comparation++;
            if(i<=j){
                swap++;
                gecici=dizi[i];
                dizi[i]=dizi[j];
                dizi[j]=gecici;
                i++;
                j--;  
            }                                      
        } while (i<=j);

        if (sol<j) quickSort(dizi, sol, j);
        if (i<sag) quickSort(dizi, i, sag);
    } 

    
}
