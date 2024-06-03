package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static _JDBC.JDBCParent.*;

public class _08_GetAllRowColumn extends JDBCParent {
    // bir metoda sorguyu("select * from language") gönderiniz,
    // metod size sorgunun datasını bir ArrayList olarak döndürsün

    @Test
    public void Test1() {
        String sorgu = "select * from language";
        List<List<String>> donenTablo = getListData(sorgu); // giden var, donen var
        //System.out.println(donenTablo);
        for (List<String> satir : donenTablo) {
            for (String kolon : satir)
                System.out.print(kolon + "\t");

            System.out.println();
        }

    }

    public List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();
        try {
            DBConnectionOpen();
            ResultSet rs = sorguEkrani.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData(); // kolon sayisi

            // kolon isimleri tablonun ilk satirine eklendi
//            ArrayList<String> kolonSatiri = new ArrayList<>();
//            for (int i =1; i <= rsmd.getColumnCount(); i++) {
//                kolonSatiri.add(rsmd.getColumnName(i));
//            }
//            tablo.add(kolonSatiri);

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


}
