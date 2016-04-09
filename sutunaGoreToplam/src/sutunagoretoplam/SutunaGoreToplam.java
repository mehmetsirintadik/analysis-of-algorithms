/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sutunagoretoplam;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mehmet
 */
public class SutunaGoreToplam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r= new Random();
        Scanner input= new Scanner(System.in);
       
        System.out.println("Satır sayısını giriniz:");
        int N=input.nextInt();
        int [][] tablo= new int[N][100];
        for(int i=0;i<N;i++){
            for (int j=0;j<100;j++){
                
                tablo[i][j]=r.nextInt(2);
                //System.out.println("Tablo["+i+"]["+j+"]="+tablo[i][j]);
            }
            
        }

        int maxValue=0;
        int sutun=0;
        int toplamlarDizisi []=new int[100];
        for(int i=0; i< 100; i++){
            int birSayisi=0;
            for(int j=0; j< N; j++){
                if (tablo[j][i]==1){
                    birSayisi++;
                }
            }
            toplamlarDizisi[i]=birSayisi;
            if (birSayisi>maxValue){
                maxValue=birSayisi;
                sutun=i;
            }                      
        }
        
        System.out.println("En fazla bir olan sütün="+sutun+" degeri="+toplamlarDizisi[sutun]);

    }
}
