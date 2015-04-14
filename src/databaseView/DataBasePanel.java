package databaseView;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import databaseController.DataBaseAppController;

import java.awt.Color;


public class DataBasePanel
{
	private DataBaseAppController baseController;
	private JTable videoGameTabke;
	private SpringLayout baseLayout;
	private JLabel tittleLabel;
	private JScrollPane tablePane;
	private JTextArea displayArea;
	private JTable resultsTable;
	
	public DataBasePanel(DataBaseAppController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		queryButton = newJButton("Click here to test the query");
		displayArea = new JTextArea(10,30);
		displayPane = new JScrollPane(displayArea);
		
		setupDisplayPane();
		setupPanel();
		setupLayout();
		setupListerners();
	}
	
	private void setupDisplayPane()
	{
		displayArea.setWrapStyleWprd(true);
	}
	
	
	private void setupTable()
	{
		
	}
}
