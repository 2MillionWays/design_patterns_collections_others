package goncharuk.ross.Patterns.Structural.Facade;

import java.sql.Connection;

public class OracleHelper {

    public static Connection getOracleConnection(){
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        //get data from table and generate pdf report
    }
}
