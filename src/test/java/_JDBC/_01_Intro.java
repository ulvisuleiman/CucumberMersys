package _JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {

    @Test
    public void Test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        // 1- baglanti bilgilerini girdik DB server baglandik
        Connection baglanti = DriverManager.getConnection(url, username, password);

        // 2- sorgu ekranini actik
        Statement sorguEkrani = baglanti.createStatement();

        // 3- sorgu ekranina sorguyu yazdim ve calistirdim
        ResultSet sonucTablosu = sorguEkrani.executeQuery("select * from customer");

        // 4- Altta sonuclar gozuktu
//        sonucTablosu.next();
//        String ad = sonucTablosu.getString("first_name");
//        String soyad = sonucTablosu.getString("last_name");
//        System.out.println("1. Satir ad ve soyad " + ad + " " + soyad);

        while (sonucTablosu.next())
        {
            String ad = sonucTablosu.getString("first_name");
            String soyad = sonucTablosu.getString("last_name");
            System.out.println("Ad ve soyad " + ad + " " + soyad);
        }

        baglanti.close();
    }
}
