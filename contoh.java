public class contoh {
    static void metodeStatis() {
        System.out.println("Metode Statis");
    }

    void metodeNonStatis() {
        System.out.println("Metode Non-Statis");
    }

    public static void main(String[] args) {
        metodeStatis(); 

        contoh obj = new contoh();
        obj.metodeNonStatis(); 
}
}