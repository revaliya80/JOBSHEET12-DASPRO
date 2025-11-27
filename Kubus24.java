public class Kubus24 {
    static int hitungVolumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int hitungLPKubus(int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        int s = 4;

        int volume = hitungVolumeKubus(s);
        int luasPermukaan = hitungLPKubus(s);

        System.out.println("Sisi kubus = " + s);
        System.out.println("Volume kubus = " + volume);
        System.out.println("Luas permukaan kubus = " + luasPermukaan);
    }
}
