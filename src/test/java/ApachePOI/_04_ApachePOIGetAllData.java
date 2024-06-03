package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resources/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workBook = WorkbookFactory.create(inputStream);
        Sheet sheet = workBook.getSheet("Sheet1");

        //zoo.length - kac satir oldugu

        //1.yol
        int rowCount = sheet.getPhysicalNumberOfRows(); // kac tane satir var
        // ilkl null satira kadar satir sayisini verir
        System.out.println("rowCount = " + rowCount);
        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells(); // bu satirka=daki hucre sayisi\

            for (int j = 0; j < cellCount; j++) {
                    System.out.print(row.getCell(j) + "\t");
            }
            System.out.println();
        }

        //2.yol
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                System.out.print(sheet.getRow(i).getCell(j) + "\t");
            }
            System.out.println();
        }

    }
}
