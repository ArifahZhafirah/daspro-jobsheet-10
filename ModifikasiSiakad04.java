import java.util.Scanner;

public class ModifikasiSiakad04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i + 1));
            double totalPersiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai ke-" + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPersiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPersiswa / jumlahMataKuliah);
        }

        System.out.println("\n====================================");
        System.out.println("Rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalMataKuliah = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalMataKuliah += nilai[i][j];
            }
            System.out.println("Mata kuliah ke-" + (j + 1) + ": " + totalMataKuliah / jumlahSiswa);
        }

    }
}
