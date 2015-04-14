package databaseController;

import java.sql.*;

public class DataBaseAppController
{
	private String connectionString;
	private Connection dataBassConnection;
	private DataBaseAppController baseController;
	private String query;
	/**
	 * conectes to the server
	 * 
	 * @param baseController
	 */
	public DataBaseController(DataBaseAppController baseController)
	{
		connectionString = "jdbc:mysql://127.0.0.1/gasoline_travel?user=root";
		this.baseController = baseController;
		checkDriver();
		setupConnection();
	}
	
	public String getQuery()
/**
 * checks if there is a driver that will conect to data base
 */
	public String displayTabel()
	{
		String results = "";
		String query ="SHOW TABLSES";
		try 
		{
			
		}
		public 
	}
	private void checkDriver()
	{
		try
		{
			Class.forName("com.mysql,jdbc.jdbc.Driver");
		}
		catch (Exception currentException)
		{
			displayErrors(currentException);
			System.exit(1);
		}
	}
/**
 * 
 * @param curentExcption
 */
	public void displayErrors(Exception curentExcption)
	{

	}
/** setup conection with the server
 * 
 */
	private void setupConnection()
	{

	}
/**
 * this is the display tabel it helps display information
 * @return
 */
	public String displayTables()
	{
		String result = "";
		String query = "SHOW TABLES";
		
		/**
		 * is gana try this
		 */
		try
		{
			Statement firstStatement = dataBassConnection.createStatement();
			ResultSet answers = firstStatement.executeQuery(query);
			ResultSetMetaData answerData = answers.getMetaData();
			
			columns = new String[answerData.getColumnCount()];
			
			for(int columns = 0; column < answerData.getColumnCount(); column++)
			{
				columns[column] = answerData.getColumnName(column+1);
			}
			
			answers.close();
			firstStatement.close();
		}
		catch(SQLException curentSQLError)
		{
			displayErrors(curentSQLError);
		}
		
		return columns;
	}
	
	public int insertSample()
	{
		int rowsAfeected = -1;
		String query = "INSERT INTO '";
		try
		{
			Statement insertStatement = databaseConnection.createStatement();
			rowsAffected = insertStatement.executeUpdate(query);
			insertStatement.close();
		}
		catch(SQLException currentError)
		{
			displayErrors(currentError);
		}
		return rowsAffected;
	}
	
}
