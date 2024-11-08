import java.util.Scanner;

public class ModifikasiBioskopWithScanner04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, next; 
        int  baris = 0, kolom = 0, menu;
        String[][] penonton = new String[4][2];
        
        do {
            System.out.println("Pilih Menu Dibawah Ini");
            System.out.println("1.Input Penonton \n2.Daftar Penonton \n3.Exit");
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    while (true) {
                         System.out.print("Masukkan nama: ");
                         nama = sc.nextLine();
                         System.out.print("Masukkan baris: ");
                         baris = sc.nextInt();
                         System.out.print("Masukkan kolom: ");
                         kolom = sc.nextInt();
                         sc.nextLine();

                         if(penonton[baris - 1][kolom - 1] == null || penonton[baris - 1][kolom - 1] == "***") {
                            penonton[baris - 1][kolom - 1] = nama;
                         } else {
                            System.out.println("Kursi tidak tersedia");
                         }

                         System.out.print("Input penonton lainnya? (y/n) : ");
                         next = sc.nextLine();

                         if (next.contentEquals("n")) {
                            break;
                         }
            }
            break;
        case 2:
            for (int i = 0; i < penonton.length; i++) {
                if (penonton[i] == null) {
                    penonton[i] = new String[penonton[i].length];
                }
                for (int j = 0; j < penonton[i].length; j++) {
                    if (penonton[i][j] == null) {
                        penonton[i][j] = "***";
                    }
                }
                System.out.println("Penonton pada baris ke- " + (i+1) + ": " + String.join (", " , penonton[i]));
            }
            break;
        case 3:
            break;
        default:
            break;
        }
      } while(menu != 3);
    }  
}