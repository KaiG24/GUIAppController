package guiview;

import javax.swing.JPanel;
import guicontroller.GUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

public class GUIPanel extends JPanel
{
	private GUIController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	
	
	public GUIPanel(GUIController appController)
	{
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.BLUE);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 115, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, -140, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		
	}
}
