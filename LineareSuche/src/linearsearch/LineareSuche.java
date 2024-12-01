/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linearsearch;

import cousteau.*;

/**
 *
 * @author lalaevva
 */
public class LineareSuche {
    
    public static void main(String[] args) {
        
        int ANZAHL; // Variable, in welcher die vom Benutzer angegebene Array-
                    // Laenge gespeichert werden soll
        int[] A;    // Deklaration einer Referenzvariablen fuer das int-Array
        int pos;    // Variable, in welcher der Rueckgabewert der Suchmethode
                    // gespeichert werden soll
        int x; // Variable fuer die gesuchte ganze Zahl
        int i = 0;
        // Einsammeln der Benutzer-Eingaben
        
        System.out.print("Bitte geben Sie die Array-Laenge ein: ");
        ANZAHL = InOut.readInt();
        A = new int[ANZAHL];
        
        // Der Rest muesste gemäß der Anforderungen in der Aufgabenstellung
        // implementiert werden.
        
        while(i < A.length){
            System.out.print("Bitte geben Sie einen Wert ein: ");
            int wert = InOut.readInt();
            A[i] = wert;
            i += 1;
        }
        System.out.print("Werte wurden gespeichert. Bitte geben Sie ihren gesuchten Wert an: ");
        x = InOut.readInt();
        pos = linearesSuchen(x, A);
        if(pos == -1){
            System.out.println("Der gesuchte Wert " + x + " wurde nicht gefunden.");
        }
        else{
            System.out.println("Der gesuchte Wert " + x + " befindet sich auf der position " + pos + ".");
        }
        System.out.println("Es wurden " + (pos + 1) + " Schleifendurchlaeufe gebraucht.");
        
    }
    public static int linearesSuchen(int x, int[] A){
        int i = 0;
        int pos = -1;
        while(i < A.length){
            if(A[i] != x){
                i = i + 1;
            }
            else{
                pos = i;
                i = A.length;
            }
        }   
        return pos;
    }
}
