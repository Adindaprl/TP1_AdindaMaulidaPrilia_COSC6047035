import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> kendaraan = new ArrayList<>();

        // Menambahkan elemen
        kendaraan.add("Motor");
        kendaraan.add("Mobil");
        kendaraan.add("Bus");

        System.out.println(kendaraan);

        // Menghapus elemen
        kendaraan.remove("Bus");

        System.out.println(kendaraan);
    }
}