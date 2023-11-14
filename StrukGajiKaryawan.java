package ProgramDay30;

import java.text.NumberFormat;
import java.util.Scanner;

public class StrukGajiKaryawan {
    static final int GAJI_PER_HARI = 1200000;
    static final int UANG_MAKAN_PER_HARI = 15000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Hari Kerja\t: ");
        int jumlahHariKerja = scanner.nextInt();

        System.out.print("Masukkan Gaji Per Hari\t\t: ");
        int gajiPerHari = scanner.nextInt();

        System.out.print("Masukkan Uang Makan Per Hari\t: ");
        int uangMakanPerHari = scanner.nextInt();

        int gajiKotor = hitungGajiKotor(jumlahHariKerja, gajiPerHari);
        int totalUangMakan = hitungTotalUangMakan(jumlahHariKerja, uangMakanPerHari);
        int gajiBersih = gajiKotor - totalUangMakan;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        System.out.println("<=========STRUK GAJI KARYAWAN=========>");

        System.out.println("Jumlah Hari Kerja\t: " + jumlahHariKerja);
        System.out.println("Gaji Perhari\t\t: " + currencyFormat.format(gajiPerHari));
        System.out.println("Uang Makan Perhari\t: " + currencyFormat.format(uangMakanPerHari));
        System.out.println("Gaji Kotor\t\t: " + currencyFormat.format(gajiKotor));
        System.out.println("Total Uang Makan\t\t: " + currencyFormat.format(totalUangMakan));
        System.out.println("Gaji Bersih\t\t: " + currencyFormat.format(gajiBersih));
    }

    static int hitungGajiKotor(int jumlahHariKerja, int gajiPerHari) {
        return jumlahHariKerja * gajiPerHari;
    }

    static int hitungTotalUangMakan(int jumlahHariKerja, int uangMakanPerHari) {
        return jumlahHariKerja * uangMakanPerHari;
    }
}