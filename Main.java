import java.util.Scanner;

public class Main {


    
    public static void main(String[] args) {
        Kendaraandll dll = new Kendaraandll();
        dll.tambahdata();
     while (dll.pilih != 5 || dll.pilih != 0) {
        dll.menu();
        switch (dll.pilih) {
            case 1:
                dll.tampilkanData();
                break;
        
            default:
                break;
        }
     }


    }
    
}