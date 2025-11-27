import java.util.Scanner;

public class RekapPenjualanCafe24 {
    static String[] menu;
    static int[][] penjualan;
    static int jumlahHAri;

    public static void inputDataAwal() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        menu = new String[jumlahMenu];
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.println("Nama menu ke-" + (1 + i) + ": ");
            menu[i] = sc.nextLine();
        }

        System.out.println("Masukkan jumlah hari penjualan: ");
        jumlahHAri = sc.nextInt();

        penjualan = new int[jumlahMenu][jumlahHAri];
    }

    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Penjualan menu: " + menu[i]);

            for (int j = 0; j < jumlahHAri; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanTabel() {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.println("Menu\t");
        for (int j = 0; j < jumlahHAri; j++) {
            System.out.print("H" + (j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < jumlahHAri; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuTertinggi() {
        int tertinggi = 0;
        String menuTinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHAri; j++) {
                total += penjualan[i][j];
            }
            if (total > tertinggi) {
                tertinggi = total;
                menuTinggi = menu[i];
            }
        }

        System.out.println("\nMenu denga penjualan tertinggi: " + menuTinggi + "(" + tertinggi + ") ");
    }

    public static void rataRataMenu() {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < jumlahHAri; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / jumlahHAri;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void rataRataHarian() {
        System.out.println("\n==== RATA=RATA PENJUALAN PER HARI ====");
        for (int j = 0; j < jumlahHAri; j++) {
            int total = 0;
            for (int i = 0; i < menu.length; i++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / menu.length;
            System.out.println("Hari ke-" + (j + 1) + " : " + rata);
        }
    }

    public static void main(String[] args) {
        inputDataAwal();
        inputPenjualan();
        tampilkanTabel();
        menuTertinggi();
        rataRataMenu();
        rataRataHarian();
    }
}