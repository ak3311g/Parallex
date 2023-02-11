import java.sql.*;
class JDBCConnection
{
     public static final String DBURL = "jdbc:oracle:thin:@localhost:1521:XE";
     public static final String DBUSER = "local";
     public static final String DBPASS = "test";
     public static void main(String args[])
     {
          try
          {
               //Load the driver
               Class.forName("oracle.jdbc.driver.OracleDriver");
               //Cretae the connection object
               Connection con = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
               //Create the Statement Object
               Statement stmt = con.createStatement();
               //Excute the SQL query
               ResultSet rs = stmt.executeQuery("Select sysdate from dual");
               if (con != null)
               {
                    System.out.println("Connection is established.\n");
                    while (rs.next())
                         System.out.println ("Current Date is: "+rs.getDate(1));
               }
               else
                    System.out.println("Connection is not esablished");
   
               //Closing the connection object
               con.close();
               stmt.close();
               rs.close();
          }
          catch(Exception ex)
          {
               ex.printStackTrace();
          }
     }
}