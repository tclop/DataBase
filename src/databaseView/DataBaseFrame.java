package databaseView;

import javax.swing.JFrame;

import databaseController.DataBaseAppController;

public class DataBaseFrame
{

	private DataBasePanel basePanel;
	
	public DataBaseFrame(DataBaseAppController baseController)
	{
		basePanel = new DataBasePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.z(basePanel);
		this.setSize(1000, 1000);
		this.setVisible(true);
	}

	private void z(DataBasePanel basePanel2)
	{
		// TODO Auto-generated method stub
		
	}

	private void setVisible(boolean b)
	{
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j)
	{
		// TODO Auto-generated method stub
		
	}
}
