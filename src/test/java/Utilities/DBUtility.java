package Utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBUtility {
    public static Connection baglanti;
    public static Statement sorguEkrani;

    public static List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();
        try {
            DBConnectionOpen();
            ResultSet rs = sorguEkrani.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData(); // kolon sayisi

            // kolon isimleri tablonun ilk satirine eklendi
            ArrayList<String> kolonSatiri = new ArrayList<>();
            for (int i =1; i <= rsmd.getColumnCount(); i++) {
                kolonSatiri.add(rsmd.getColumnName(i));
            }
            tablo.add(kolonSatiri);

            while (rs.next()) {
                // bu satirdaki elemanlari satir listine ekle
                ArrayList<String> satir = new ArrayList<>();
//            rs.getString(1); // 1
//            rs.getString(2); // English
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    satir.add(rs.getString(i));
                }

                tablo.add(satir);
                // satira ekleme bitince tabloya ekle
            }
        } catch (Exception ex) {
            System.out.println("Alinan hata= " + ex.getMessage());
        } finally {
            DBConnectionClose();
        }

        return tablo;
    }



    public static void DBConnectionOpen() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            baglanti = DriverManager.getConnection(url, username, password);
            sorguEkrani = baglanti.createStatement();
        } catch (Exception ex) {
            System.out.println(" ex.getMessage= " + ex.getMessage());
        }
    }

    public static void DBConnectionClose() {
        try {
            baglanti.close();
        } catch (Exception ex) {
            System.out.println(" ex.getMessage= " + ex.getMessage());
        }
    }
}
