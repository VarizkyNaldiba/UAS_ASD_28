import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dll dll = new Dll();
        dll.tambahdata();
        Scanner input = new Scanner(System.in);

        while (dll.pilih != 5 || dll.pilih != 0) {
            dll.menu();

            switch (dll.pilih) {
                case 1:
                    dll.tampilkanData();
                    break;
                case 2:
                    System.out.print("Masukkan Nomor TNKB yang ingin dicari: ");
                    String noTNKB = input.nextLine();
                    Kendaraan found = dll.search(noTNKB);
                    if (found != null) {
                        System.out.printf("%-15s %-20s %-15s %-10s %-10s %-15s%n",
                                found.noTNKB, found.nama, found.jenis, found.cc, found.tahun,
                                found.bulanHarusBayar);
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
