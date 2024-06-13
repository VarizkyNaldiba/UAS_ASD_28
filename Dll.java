import java.util.Scanner;

public class Dll {

    Kendaraan head;
    int size = 0;
    int pilih = -1;

    public boolean kosong() {
        return head == null;
    }

    public int menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Daftar Kendaraan");
        System.out.println("2. Cari Kendaraan");
        System.out.println("3. Bayar Pajak");
        System.out.println("4. Tampilkan seluruh transaski");
        System.out.println("5. Urutkan Transaksi berdasar nama pemilik");
        System.out.println("6. Keluar");
        System.out.print("pilih (1-6) :");
        return pilih = input.nextInt();
    }

    public void tambahkendaraan(String noTNKB, String nama, String jenis, int cc, int tahun, int bulanHarusBayar) {
        if (kosong()) {
            head = new Kendaraan(null, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
        } else {
            Kendaraan current = head;
            while (current.next != null) {
                current = current.next;
            }
            Kendaraan dataBaru = new Kendaraan(current, noTNKB, nama, jenis, cc, tahun, bulanHarusBayar, null);
            current.next = dataBaru;
        }
        size++;

    }

    public void tambahdata() {
        tambahkendaraan("S 6543 YZ", "Budi", "Mobil", 2500, 2017, 3);
        tambahkendaraan("N 2589 VS", "Sulan", "Mobil", 2000, 2019, 5);
        tambahkendaraan("AB 7654 AC", "Widi", "Motor", 200, 2018, 1);
        tambahkendaraan("B 9876 AG", "Sukirman", "Motor", 100, 2021, 2);
    }

    public Kendaraan search(String noTNKB) {
        Kendaraan current = head;
        while (current != null && !current.noTNKB.equals(noTNKB)) {
            current = current.next;
        }
        return current;
    }

    public void tampilkanData() {
        if (kosong()) {
            System.out.println("Wmpty");
        } else {
            System.out.printf("%-15s %-20s %-15s %-10s %-10s %-15s%n",
                    "Nomor TNKB", "Nama Pemilik", "Jenis", "CC Kendaraan", "Tahun", "Bulan Harus Bayar");
            System.out.println("---------------------------------------------------------------------------");
            Kendaraan current = head;
            while (current != null) {
                System.out.printf("%-15s %-20s %-15s %-10d %-10d %-15d%n",
                        current.noTNKB, current.nama, current.jenis, current.cc, current.tahun,
                        current.bulanHarusBayar);
                current = current.next;
            }
        }
    }
}
