package dbConnection;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static void main(String []args) throws SQLException {
        //String url = "jdbc:sqlserver://DATPC00021\\sqlexpress;databaseName=AdventureWorks2019";
       // url = "jdbc:sqlserver://" +serverName + ":1433;DatabaseName=" + dbName + ";encrypt=true;trustServerCertificate=true;
        String url = "jdbc:sqlserver://DATPC00021;databaseName=AdventureWorks2019;encrypt=true;trustServerCertificate=true";


            Connection con= DriverManager.getConnection(url);


    }

}
