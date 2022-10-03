package datadriventests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataDrivenExcel {

    public static void main(String args[]) throws IOException {
        FileInputStream file = new FileInputStream("C:\\Users\\lenovo\\Desktop\\exceldatadrivven\\datadrivensel.xlsx");

        XSSFWorkbook workbook= new XSSFWorkbook(file);
        XSSFSheet sheet =workbook.getSheet("sheet1");

        int rowcount =sheet.getLastRowNum();//Returns row count
        int colcount=sheet.getRow(0).getLastCellNum();//Returns cell count

        for(int i=0;i<rowcount;i++){
            XSSFRow currentrow=sheet.getRow(i);//focused on current row
            for(int j=0;j<colcount;j++){
                String value = currentrow.getCell(j).toString();//read value from a cell
                System.out.print(" "+value);

            }
            System.out.println();
        }


    }
}
