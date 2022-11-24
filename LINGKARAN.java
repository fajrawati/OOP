
package lingkaran;

public class LINGKARAN {

    public static void main(String[] args) {
        /*
        NAMA = FAJRAWATI
        NIM  = D0221116
        KELAS= INFORMATIKA H
        
        Menghitung Luas dan Keliling linkaran
        Rumus :
        Luas = phi * r * r
        Keliling = phi * diameter
        diamater = 2 * r
        */
        final double phi = 3.14;
        System.out.println("diketahui phi= "+ phi);
        double L, K, r, d ;
        
        r = 3;
        System.out.println("diketahui jari-jari= "+ r);
        d = 2 * r ;
        System.out.println("diketahui diameter= "+ d);
        
        L = phi * r * r ;
        K = phi * d ;
        
        System.out.println("luas lingkaran = "+ L);
        System.out.println("Keliling lingkran = "+ K);
        }
    
    }
    

