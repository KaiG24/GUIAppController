package guiview;

import guicontroller.GUIController;
import javax.swing.JFrame;

public class GUIFrame extends JFrame
{
	
	private GUIController appController;
	
	public GUIFrame(GUIController appController)
	{
		super();
		this.appController = appController;
		setupFrame();
	}
	private void setupFrame()
	{
		this.setTitle("Window title will go here");
		this.setSize(500,500);
		
		this.setVisible(true);
	}

}
