package excel;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ExcelWriter {

    public void excelWriteAndRead() throws IOException {
        //Genom denna klass skickar vi data till excel filen
        FileWriter write = new FileWriter("C:\\files\\excel.xls");
        String[] colName = {"competitor's name", "Discipline", "Score"};

        write.write("Competitor's name");
        write.write("Disciplin");
        write.write("Score");
        write.close();

        //Genom denna klass läser vi in data från excel filen
        FileReader read = new FileReader("C:\\files\\excel.xls");
        int x;
        while ((x = read.read()) != -1) {
            System.out.print((char) x);
        }
    }
}
