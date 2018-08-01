package goncharuk.ross.Patterns.Structural.Facade;

import java.sql.Connection;

public class MySQLHelper {

    public static Connection getMySQLDBConnection(){
        //get connection to MySQL
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}
