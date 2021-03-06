/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import static java.lang.System.in;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author BM
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    static int bubbleComparation=0;
    static int selectionComparation=0;
    static int insertionComparation=0;
    
    static int bubbleSwap=0;
    static int selectionSwap=0;
    static int insertionSwap=0;
    
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
            BubbleSort(myArray);
        }
        long stopTime = System.nanoTime();
        System.out.println("BubleSort toplam Süre:"+(stopTime - startTime)+" nanosaniye");
        System.out.println("BUBBLE toplam karşılaştırma:"+bubbleComparation+"\nBubble toplam swap: "+bubbleSwap);


        long startTime2 = System.nanoTime();
        for (int i=0;i<N; i++){
            selectionSort(myArray);
        }
        long stopTime2 = System.nanoTime();
        System.out.println("\nSelectionSort toplam Süre:"+(stopTime2 - startTime2)+" nanosaniye");
        System.out.println("SELECTİON toplam karşılaştırma:"+selectionComparation+"\nSelection toplam swap: "+selectionSwap);


        long startTime3 = System.nanoTime();
        for (int i=0;i<N; i++){
           insertionSort(myArray);
        }
        long stopTime3 = System.nanoTime();
        System.out.println("\nINSERTİON toplam Süre:"+(stopTime3 - startTime3)+" nanosaniye");
        System.out.println("INSERTİON toplam karşılaştırma:"+insertionComparation+"\nInsertion toplam swap: "+insertionSwap);
}
    
    public static void BubbleSort(int [] dizi)
    {
        int temp;      
        for (int i=1; i<dizi.length; i++)
        {
            for(int j=0; j<dizi.length-i; j++)
            {
                bubbleComparation++;
                if (dizi[j] > dizi [j+1])
                {
                    bubbleSwap++;
                    
                    temp = dizi [j];
                    dizi [j] = dizi [j+1];
                    dizi [j+1] = temp;
                }
            }
        }
        //System.out.println("BubleSort karşılaştırma sayısı:"+comparation+"\nswap sayisi:"+ swap);
    }
     
    public static void selectionSort(int [] dizi)
    {
        int temp;
        int enKucuk;
        for(int i=0; i<dizi.length-1; i++)
        {
            enKucuk=i;
            for(int j=i; j<dizi.length; j++)
            {
                selectionComparation++;
                if (dizi[j] < dizi[enKucuk]) enKucuk=j;
            }
            selectionSwap++;
            temp=dizi[i];
            dizi[i]=dizi[enKucuk];
            dizi[enKucuk]=temp;
        }
        //System.out.println("SelectionSort karşılaştırma sayısı:"+comparation+"\nswap sayisi:"+ swap);
    }
    
    public static void insertionSort(int[] dizi) {
      int newValue;
      int j;
      for (int i = 1; i < dizi.length; i++) {
            newValue = dizi[i];
            j = i;
            boolean girdim= false;
            insertionComparation++;
            while (j > 0 && dizi[j - 1] > newValue) {
                  insertionSwap++;
                  dizi[j] = dizi[j - 1];
                  j--;
                  girdim=true;
            }
            
            dizi[j] = newValue;
            if (girdim==false){
                insertionComparation++;
                girdim=true;
            }
      }
      
      //System.out.println("InsertionSort karşılaştırma sayısı:"+comparation+"\nswap sayisi:"+ swap);
      
    }
} 
