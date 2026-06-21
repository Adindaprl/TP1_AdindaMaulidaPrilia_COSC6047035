public class kendaraan {
    public static void main(String[] args) {
        String kendaraan = "motor";

        switch (kendaraan) {
            case "motor":
                System.out.println("Kendaraan roda dua");
                break;
            case "mobil":
                System.out.println("Kendaraan roda empat");
                break;
            default:
                System.out.println("Jenis kendaraan lainnya");
        }
    }
}