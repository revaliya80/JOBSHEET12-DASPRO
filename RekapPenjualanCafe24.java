import java.util.Scanner;

public class RekapPenjualanCafe24 {
    static String[] menu = { "Kopi", "Teh", "Es kelapa muda", "Roti bakar", "Gorengan" };
    static int[][] penjualan = new int[5][7];

    public static void inputPenjualan() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== INPUT PENJUALAN ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk menu: " + menu[i]);

            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanTabel() {
        System.out.println("\n=== TABEL PENJUALAN ===");
        System.out.println("Menu\tH1\tH2\t\tH3\t\tH4\t\tH5\t\tH6\t\tH7");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < 7; j++) {
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
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            if (total > tertinggi) {
                tertinggi = total;
                menuTinggi = menu[i];
            }
        }

        System.out.println("\nMenu denga penjualan tertinggi: " + menuTinggi + "(" + tertinggi + ") ");
        System.out.println(menuTinggi + " (" + tertinggi + ") ");
    }

    public static void rataRataMenu() {
        System.out.println("\n=== RATA-RATA PENJUALAN PER MENU ===");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < 7; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / 7;
            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void rataRataHarian() {
        System.out.println("\n==== RATA=RATA PENJUALAN PER HARI ====");
        for (int j = 0; j < 7; j++) {
            int total = 0;
            for (int i = 0; i < menu.length; i++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / menu.length;
            System.out.println("Hari ke-" + (j + 1) + " : " + rata);
        }
    }

    public static void main(String[] args) {
        inputPenjualan();
        tampilkanTabel();
        menuTertinggi();
        rataRataMenu();
        rataRataHarian();
    }
}