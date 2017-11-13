package guiview;

import javax.swing.JPanel;
import guicontroller.GUIController;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SpringLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		setupListeners();
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
		firstButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				changeScreenColor();
			}
				});
	}
	
	private void changeScreenColor() 
	{
		int red = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		int green = (int) (Math.random()* 256);
		
		this.setBackground(new Color(red, blue, blue));
	}
}
