package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_NewExcelWrite {
    public static void main(String[] args) throws IOException {
        // hafizada workbook olustur
        // bundan hafizada sheet olustur

        // kalan kisim ayni

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sheet1");

        Row yeniSatir = sheet.createRow(0);
        Cell yeniHucre = yeniSatir.createCell(0);
        yeniHucre.setCellValue("Merhaba yeni excel");

        //ctrl+s
        String path = "src/test/java/ApachePOI/resources/NewExcel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }
}
