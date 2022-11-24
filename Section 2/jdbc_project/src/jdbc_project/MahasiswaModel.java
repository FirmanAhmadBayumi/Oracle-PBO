package jdbc_project;

import db.DBHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MahasiswaModel {
    private final Connection CONN;

    public MahasiswaModel() {
        this.CONN = DBHelper.getConnection();
    }
    
    public void addMahasiswa(Mahasiswa mhs){
        String insert = "INSERT INTO mhs VAlUES('"
                + mhs.getNpm() + "', '" + mhs.getNama()
                + "')";
        
        try {    
            if(CONN.createStatement().executeUpdate(insert) > 0){
                System.out.println("Berhasil memasukkan data");
            }
            else{
                System.out.println("Gagal memasukkan data");
            }
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal memasukkan data");
        }
    }
    
    public ArrayList <Mahasiswa> getMahasiswa(){
        String query = "SELECT * FROM mhs";
            
        ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();
        
        try {
            ResultSet rs = CONN.createStatement().executeQuery(query);
            while(rs.next()){
                Mahasiswa temp = new Mahasiswa(rs.getString("npm"), rs.getString("nama"));
                mhs.add(temp);
            }
            System.out.println("Berhasil mengambil data");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal mengambil data");
        }
        
        return mhs;
    }
    
    public void updateMahasiswa(Mahasiswa mhs){
        String update = "UPDATE mhs SET nama = '" + mhs.getNama() + "' WHERE npm = '" + mhs.getNpm() + "'";
        
        try {
            CONN.createStatement().executeUpdate(update);
            System.out.println("Berhasil update data nama");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal update data nama");
        }
    }
    
    public void deleteMahasiswa(Mahasiswa mhs){
        String delete = "DELETE FROM mhs WHERE npm = '" + mhs.getNpm() + "'";
        
        try {
            CONN.createStatement().executeUpdate(delete);
            System.out.println("Berhasi menghapus data npm");
        } catch (SQLException ex) {
            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Gagal menghapus data npm");
        }
    }
}
