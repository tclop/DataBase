package databaseController;

import java.awt.Container;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import databaseModel.QueryInfo;
import databaseView.DataBaseFrame;

public class DataBaseAppController
{
	private DataBaseFrame appFrame;
	private DataBaseController dataController;
	private ArrayList<QueryInfo> queryList;
	
	
	public DataBaseAppController()
	{
		dataController = new DataBaseController(this);
		queryList = new ArrayList<QueryInfo>();
		appFrame = new DataBaseFrame(this);
	}
	
	public DataBaseFrame getAppFrame()
	{
		return appFrame;
	}
	
	public DataBaseController getDataController()
	{
		return dataController;
		
	}
	
	public ArrayList<QueryInfo> getQueryList()
	{
		return null;
	}
	/**
	 * starts the application
	 */
	public void start()
	{
		
		
	}
	/**
	 * Loads how long it takes for the information to be displayed from mySQL to the Database project
	 */
	private void loadTimingInformation()
	{
		try
		{
			File loadFile = new File("asdasda.save");
			if(loadFile.exists())
			{
				queryList.clear();
				Scanner textScanner = new Scanner(loadFile);
				while(textScanner.hasNext())
				{
					String query = textScanner.nextLine();
					long queryTime = Long.parseLong(textScanner.nextLine());
					queryList.add(new QueryInfo(query, queryTime));
				}
				textScanner.close();
				JOptionPane.showInputDialog(getAppFrame(), queryList.size() + "QueryInfo objects were loaded into the application");
			}
			else
			{
				JOptionPane.showInputDialog(getAppFrame(), "File not present. No QueryInfo objects loaded");
			}
			
		}
		catch(IOException currentError)
		{
			dataController.displayErrors(currentError);
		}
	}
	/**
	 * Save the data components into a file and stores it on a drive on your computer
	 */
	public void saveTimingInformation()
	{
		try
		{
			File saveFile = new File("asfddfsa.save");
			PrintWriter writer = new PrintWriter(saveFile);
			if(saveFile.exists())
			{
				for (QueryInfo current : queryList)
				{
					writer.println(current.getQuery());
					writer.println(current.getQueryTime());
				}
				writer.close();
				JOptionPane.showInputDialog(getAppFrame(), queryList.size() + "QueryInfo objects were saved");
			}
			else
			{
				JOptionPane.showInputDialog(getAppFrame(), "File not present. No QueryInfo objects saved");
			}
		}
		catch(IOException currentError)
		{
			dataController.displayErrors(currentError);
		}
	}

}