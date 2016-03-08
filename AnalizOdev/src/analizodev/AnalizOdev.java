/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package analizodev;

import java.util.Timer;

/**
 *
 * @author Mehmet
 */
public class AnalizOdev {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int N=100000000;
        int myArray[]= new int[N];
        int number=454;
        
        for (int i=0; i<N;i++){
            myArray[i] = i*3;
            //System.out.println("dizinin " + i +". elemanı "+myArray[i]);
        }
        
        long startTime = System.nanoTime();
        for (int i=0; i<N;i++){
            searchInArray(myArray,number);
        }

        long stopTime = System.nanoTime();
        System.out.println("Toplam Süre:"+(stopTime - startTime)+" nanosaniye");
             
    }
    
    public static int searchInArray(int myArray[],int number){
       
        int enSonIndex= myArray.length;
        int ilkIndex = 0;
        int sayac=0,  kontrol=0;
        
        while (enSonIndex - ilkIndex >1)
        {
            int bakilacak = (enSonIndex+ilkIndex)/2;
            sayac+=1;
            if (myArray[bakilacak]== number){
                kontrol = 1;
              //  System.out.println("Sayi" + bakilacak + ". indexte ve " + sayac + ". adımda bulundu.");
                break;

            }else if (myArray[bakilacak]<number) {
                ilkIndex = bakilacak;

            }else {
                enSonIndex = bakilacak;
            }
            kontrol=0;
        }
        if (kontrol == 0){
                //System.out.println("sayi bulunamadi");
                return -1;
        } 
                
        return 1;
    }
}
