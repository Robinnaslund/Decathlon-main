package excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class ExcelWriter {

    public void excelWriter() throws IOException {

        //Skapar en arbetsbok
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Skapar kalkylblad i arbetsboken
        XSSFSheet sheet1 = workbook.createSheet("Sheet1");

        //Skapar en rad i kalkylbladet
        Row r0 = sheet1.createRow(0);

        //Skapar celler i raden
        Cell c0 = r0.createCell(0);
        c0.setCellValue("Name");
        Cell c1 = r0.createCell(1);
        c1.setCellValue("Discipline");
        Cell c2 = r0.createCell(2);
        c2.setCellValue("Score");

        //Skapar excel filen
        File file = new File("C:\\Users\\Dunia\\Desktop\\Mjukvarutestare21\\8.Agilt projektarbete\\Nytt github projekt\\src\\main\\java\\excel\\Result.xls");
        FileOutputStream stream = new FileOutputStream(file);

        //Skriver i arbetsboken
        workbook.write(stream);

        //Stänger streamen
        stream.close();

        //Stänger arbetsboken
        workbook.close();


    }






   /* public void excelWriteAndRead() throws IOException {
        //Genom denna klass skickar vi data till excel filen
        FileWriter excelFile = new FileWriter("C:\\files\\excel.xls");
        String[] colName = {"competitor's name", "Discipline", "Score"};

        excelFile.write("Competitor's name");
        excelFile.write("Disciplin");
        excelFile.write("Score");
        excelFile.close();

        //Genom denna klass läser vi in data från excel filen
        FileReader read = new FileReader("C:\\files\\excel.xls");
        int x;
        while ((x = read.read()) != -1) {
            System.out.print((char) x);
        }
    }*/
}
