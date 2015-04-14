package databaseController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseController
{

	
		private String connectionString;
		private Connection databaseConnecting;
		private DataBaseAppController baseController;
		
		public DataBaseController(DataBaseAppController baseController)
		
		private void checkDriver()
		
		private void closeConnection()
		
		private void setupConnection()
		
		public String displayTables()
		
		public int insertSample()
		{
			
		}
		
		
		{
			this.baseController = baseController;
			checkDriver();
			this.connectionString = "jdbc:mysql://localhost";
			setupConnection();
		}
		
		
}
