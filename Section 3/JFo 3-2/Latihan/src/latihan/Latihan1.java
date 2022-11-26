package latihan;

public class Latihan1 {
    public static void main(String[] args) {
        int jmlhTelurPerAyam;
        int jmlhAyam;
        int totalTelur;
        
        //SKENARIO PERTAMA
        
        // Senin pagi 
        jmlhTelurPerAyam = 5;        
        jmlhAyam = 3;
        // Senin siang
        totalTelur = jmlhTelurPerAyam * jmlhAyam;
        
        // Selasa pagi
        jmlhAyam = jmlhAyam + 1; // bisa jmlhAyam += 1  atau jmlhAyam++ 
        // Selasa siang
        totalTelur = totalTelur + (jmlhTelurPerAyam * jmlhAyam);
        // bisa juga totalTelur += (jmlhTelurPerAyam * jmlhAyam)
        
        // Rabu pagi
        jmlhAyam = jmlhAyam / 2;
        totalTelur = totalTelur + (jmlhTelurPerAyam * jmlhAyam);       
        
        System.out.println(totalTelur);
        
        
        // SKENAARIO KEDUA
        
        // Senin pagi 
        jmlhTelurPerAyam = 4;
        jmlhAyam = 8;
        // Senin siang
        totalTelur = jmlhTelurPerAyam * jmlhAyam;
        
        // Selasa pagi
        jmlhAyam = jmlhAyam += 1; 
        // Selasa siang
        totalTelur += (jmlhTelurPerAyam * jmlhAyam);
        
        // Rabu pagi
        jmlhAyam = jmlhAyam / 2;
        totalTelur += (jmlhTelurPerAyam * jmlhAyam);
        
        System.out.println(totalTelur);
    }   
}
