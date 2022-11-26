package latihan;

public class Latihan2 {
    public static void main(String[] args) {
        double rata2PerHari;
        double rata2PerBulan;
        double keuntunganPerBulan;
        
        rata2PerHari = (100 + 121 + 117) / 3.0;
        rata2PerBulan = rata2PerHari * 30;
        keuntunganPerBulan = rata2PerBulan * 0.18;

        System.out.println("Daily Average:   " + rata2PerHari);
        System.out.println("Monthly Average: " + rata2PerBulan);
        System.out.println("Monthly Profit:  $" + keuntunganPerBulan);
    }
    
}
