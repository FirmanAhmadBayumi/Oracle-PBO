package latihan;

public class Casting02 {
    public static void main(String[] args) {
                
        //World population today
        long totalPopulasiDunia = 7_000_000_000L;
        System.out.println("Total Populasi Dunia: " +totalPopulasiDunia);
        
        //World population in 1950,  Source: United Nations Population Division
        //2.52 Billion
        int populasiAfrika   = 221_000_000;
        int populasiAsia     = 1_402_000_000;
        int populasiEuropa   = 547_000_000;
        int populasiAmerika  = 339_000_000;
        int populasiAustralia= 13_000_000;
        System.out.println("World Population in 1950: " 
                +populasiAfrika +populasiAsia +populasiEuropa +populasiAmerika +populasiAustralia);
        
        //The current population of Asia is an estimated 60% of the world population
        double percentAsia = 0.6;
        long populasiAsiaSkrg = (long)(totalPopulasiDunia * percentAsia);
        System.out.println("Current Asia Population: " +populasiAsiaSkrg);   
    }
}
