package jdbc_project;

import db.DBHelper;
import java.util.ArrayList;

public class Jdbc_project {

    public static void main(String[] args) {
//        DBHelper.getConnection();

        MahasiswaModel mhs = new MahasiswaModel();
        
        Mahasiswa mhs1 = new Mahasiswa("2117051063", "Lokie");
//        mhs.addMahasiswa(mhs1);
//        mhs.getMahasiswa();

//        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
//        
//        for(int i = 0; i < listMahasiswa.size(); i++){
//            System.out.println("Nama: " + listMahasiswa.get(i).getNama());
//            System.out.println("Nama: " + listMahasiswa.get(i).getNpm());
//            System.out.println("");
//        }

//        mhs.updateMahasiswa(mhs1);
        mhs.deleteMahasiswa(mhs1);
    }
    
}
