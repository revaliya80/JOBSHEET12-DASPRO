import java.util.Scanner;

public class NilaiMahasiswa24 {
    static void isianArray(int[] arr) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] arr) {
        System.out.println("\n=====================");
        System.out.println("\nDaftar nilai mahasiswa: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nilai mahasiswa ke- " + (i + 1) + ": " + arr[i]);
        }
    }

    static int hiTot(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMhs = new int[N];

        isianArray(nilaiMhs);
        tampilArray(nilaiMhs);

        int totalNilai = hiTot(nilaiMhs);
        System.out.print("\ntotal nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}
