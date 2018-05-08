/* Important points to remember before executing this program
1. set the $CLASSPATH to have the path to mysql-connector-java-5.1.46.jar for it to load the Driver correctly
2. Install MySQL Workbench and MySQL server, the username and password set for this example is root and pass_123
3. Start the MySQL Server and connect MySQL Workbench to it using the mentioned username and password
*/
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class JDBCExample {
	public static void main(String args[]) {
		Connection conn = null;
		PreparedStatement obj=null,ob=null;
		ResultSet obj2=null;
		try {
			/* to load the Driver*/
			Class.forName("com.mysql.jdbc.Driver");
			/* Check the DriverManager Class in Java*/
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","pass_123");
			System.out.println(conn);
			/* for Preparing SQL Query,use prepareStatement() method from Connection class which returns object of PreparedStatement */
			obj = conn.prepareStatement("SELECT * FROM new_table");
			/* executeQuery() executes the Query and returns the result in ResultSet Object*/
			obj2 = obj.executeQuery();
			int i=1;
			/* ResultSet object points to a location one above the actual result, so .next() is required to point it to actual values*/
			/* next() returns boolean, true if data exists, false otherwise*/
			while(obj2.next()) {
				/* Since we know that the data stored in Column 1 is Integer type, and we have only one column currently*/
				/* columnIndex for getInt starts from 1*/
				System.out.println(obj2.getInt(1));
			}
			ob = conn.prepareStatement("INSERT INTO new_table VALUES (45)");
			/* executeUpdate() returns the number of rows affected*/
			System.out.println("Rows affected" + ob.executeUpdate());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				ob.close();
				obj2.close();
				obj.close();
				conn.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}	
		}
	}
}
