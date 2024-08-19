//Driver Class
package Siswa;
import javax.print.attribute.standard.MediaSize.NA;

public class siswatester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = newp
        siswa Nafis = new siswa();
        siswa Dimas = new siswa();
        siswa Amin = new siswa();
        siswa Rabbani = new siswa();
        siswa Ibad = new siswa();
        
        

        Nafis.id =25;
        Nafis.nama = "Nafis";
        Nafis.ipk = 79.0;
        Nafis.id =25;
        Dimas.nama = "Dimas";
        Dimas.ipk = 89.9;
        Dimas.id =10;
        Amin.nama = "Amin";
        Amin.ipk =89.8;
        Amin.id =21;
        Rabbani.nama = "Rabbani";
        Rabbani.ipk = 88.9;
        Rabbani.id =23;
        Ibad.nama = "Ibad";
        Ibad.ipk = 100.0;
        Ibad.id = 15;
        Nafis.print();
        System.out.println("----------");
        Dimas.print();
        System.out.println("----------");
        Amin.print();
        System.out.println("----------");
        Rabbani.print();
        System.out.println("----------");
        Ibad.print();
        System.out.println("----------");





        
    }
}