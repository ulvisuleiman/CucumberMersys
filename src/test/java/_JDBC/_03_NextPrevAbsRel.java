package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends JDBCParent{

    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select * from language");

        rs.next();
        System.out.println("1.satir = " + rs.getString(2)); // 2 index degil sira : Italina

        rs.next();
        System.out.println("2.satir = " + rs.getString(2)); // English

        rs.previous();
        System.out.println("1.satir = " + rs.getString(2)); // italian


        DBConnectionClose();
    }
    @Test
    public void Test2() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select * from film");

        rs.absolute(10); // direkt 10 satir (basdan)
        System.out.println("10.satir = " + rs.getString("title")); // ALADDIN CALENDAR

        rs.absolute(5); // direkt 5 satir
        System.out.println("5.satir = " + rs.getString("title")); // AFRICAN EGG

        rs.relative(5); // kaldigi yerden 5. satir
        System.out.println("10.satir = " + rs.getString("title")); // ALADDIN CALENDAR

        rs.next(); // 11 satir
        System.out.println("11.satir = " + rs.getString("title")); //

        DBConnectionClose();


    }

}
// rs.next() : sonraki satır
// rs.previous : önceki satır
// rs.absolute(10) : baştan itibaren 10.satıra ileri gider.
// rs.relative(10) : bulunduğu yerden 10.satıra ileri gider.
// rs.absolute(-10) : - (eksi) sondan demektir, sondan 10.satır
// rs.relative(-5) :  - (eksi) bulunduğu yerden 5 satır geri
