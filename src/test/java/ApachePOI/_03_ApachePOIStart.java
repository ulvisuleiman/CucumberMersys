package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resources/ApacheExcel2.xlsx";

        // java dosya okuma nesnesine bu yolu vererek baglanti kuruyorum
        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(path);

        // dosya okuma islemcisi uzerinden calisma kitabini aliyorum
        //hafizada workbooku alip olsuturdu
        Workbook calismaKitabi = WorkbookFactory.create(dosyaOkumaBaglantisi);

        //istedigim isimdeki calisma sayfasini aliyorum
        Sheet calismaSayfasi = calismaKitabi.getSheet("Sheet1");

        // istenen satiri aliyorum
        Row satir = calismaSayfasi.getRow(0); // 0. satiri aldim

        // istenen hucreyi aliyorum
        Cell hucre = satir.getCell(0); // 0. hucreyi aldim

        System.out.println("hucre = " + hucre);


    }

}
