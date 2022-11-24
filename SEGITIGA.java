
package segitiga;

public class SEGITIGA {

    public static void main(String[] args) {
        /*
        NAMA = FAJRAWATI
        NIM  = D0221116
        KELAS= INFORMATIKA H

        MENGHITUNG SEGITIGA SAMA SISI
        Rumus :
        Luas     = 0.5 x alas x tinggi
        keliling = sisi + sisi + sisi
       */
        double L, K, a, t ,s ;
        a = 2 ;
        System.out.println("diketahui alas ="+ a);
        t = 4 ;
        System.out.println("diketahui tinggi="+ t);
        s = a ;
        
        L = 0.5 * a * t ;
        K = s + s + s ;
        
        System.out.println("luas segitiga sama sisi adalah  ="+ L);
        System.out.println("keling segitiga sama sisi adalah =" + K);
        
        
        
    }
    
}
