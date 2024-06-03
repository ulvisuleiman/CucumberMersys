package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Kullanıcı aşağıdaki excelde, 1.sutundaki bilgilerden istediğini girecek
 * karşılığında bu bilginin satırındaki karşılık gelen bilgilerin tamamı yazdırılacak.
 * yani metoda "Password" kelimesi gönderilecek, dönen değer Password un değeri olacak.
 * bulup ve sonucun döndürülmesi için metod kullanınız.
 * src/test/java/ApachePOI/resources/LoginData.xlsx
 */


public class _05_GetASpecificData {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resources/LoginData.xlsx";
        FileInputStream input = new FileInputStream(path);
        Workbook workBook = WorkbookFactory.create(input);
        Sheet sheet = workBook.getSheetAt(0);

        String aranan = "username";
        String bulunan = "";

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)) {
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    bulunan += sheet.getRow(i).getCell(j)+" ";
                }
            }
        }

        System.out.println("bulunan = " + bulunan);
    }
}
