package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowgetType extends JDBCParent {

    @Test
    public void Test1() throws SQLException {
        DBConnectionOpen();

        ResultSet rs = sorguEkrani.executeQuery("select city from city");

        rs.last(); // son satira gider
        System.out.println("Son satir = " + rs.getString(1));

        rs.first(); // ilk satira gider
        System.out.println("Ilk satir = " + rs.getString(1));

        rs.last(); // son satira gittim
        int kacinciSatirdayim = rs.getRow(); // su anda kacindi satireda oldugunun bilgisini verir
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);

        DBConnectionClose();
    }

}
