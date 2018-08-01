package goncharuk.ross.Patterns.Structural.Facade;

import java.sql.Connection;

//A Facade class (interface) to unite and simplify the logic of Helper Classes
public class HelperFacade {

    public enum DBType{
        MYSQL,ORACLE
    }
    public enum ReportType{
        HTML,PDF
    }

    public static void generateReport(DBType dbType, ReportType reportType, String tableName){
        Connection connection = null;
        switch (dbType){
            case MYSQL:
                connection = MySQLHelper.getMySQLDBConnection();
                MySQLHelper mySqlHelper = new MySQLHelper();
                switch(reportType){
                    case HTML:
                        mySqlHelper.generateMySqlHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName, connection);
                        break;
                }
                break;
            case ORACLE:
                connection = OracleHelper.getOracleConnection();
                OracleHelper oracleHelper = new OracleHelper();
                switch(reportType){
                    case HTML:
                        oracleHelper.generateOracleHTMLReport(tableName, connection);
                        break;
                    case PDF:
                        oracleHelper.generateOraclePDFReport(tableName, connection);
                        break;
                }
                break;
        }

    }
}
