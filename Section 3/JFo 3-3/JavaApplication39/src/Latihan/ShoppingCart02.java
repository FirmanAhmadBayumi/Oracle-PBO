package Latihan;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String namaPelanggan = "Alex";
        String deskripsiBarang = "Shirts";
        String pesan = namaPelanggan+" wants to purchase a "+deskripsiBarang;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double harga = 13;
        double pajak = 0.1;
        int jumlahBarang = 2;
        
        
        // Declare and assign a calculated totalPrice
        double totalPrice = harga * (1+pajak) * jumlahBarang; 
        
        // Modify pesan to include quantity 
        pesan = namaPelanggan+" wants to purchase "+jumlahBarang+" "+deskripsiBarang;
        System.out.println(pesan);
        
        // Print another pesan with the total cost
        System.out.println("Total cost with tax is: $" + totalPrice);
        
    }    
}
