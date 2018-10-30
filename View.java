import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class View extends JFrame implements ActionListener

{
	private JLabel lData;
	private JButton buttonData;
	private JLabel lTarget;
	private JButton buttonTarget;
	private JButton buttonCopy;
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	private Object source;
	
	public View()
	{
		super("Kopiarka");
		setSize(600,300);
		setLocation(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		lData = new JLabel("Podaj lokalizację danych do skopiowania");
			lData.setLocation(20,5);
			lData.setSize(550,25);
			add(lData);
			
		buttonData = new JButton("Wybierz katalog do skopiowania");
			buttonData.setLocation(20,35);
			buttonData.setSize(250,25);
			buttonData.addActionListener(this);
			add(buttonData);
			
		lTarget = new JLabel("Podaj docelową lokalizację danych skopiowanych");
			lTarget.setLocation(20,75);
			lTarget.setSize(550,25);
			add(lTarget);
			
		buttonTarget = new JButton("Wybierz katalog docelowy");
			buttonTarget.setLocation(20,105);
			buttonTarget.setSize(250,25);
			buttonTarget.addActionListener(this);
			add(buttonTarget);	
			
		buttonCopy = new JButton("KOPIUJ");
			buttonCopy.setLocation(90,175);
			buttonCopy.setSize(250,25);
			buttonCopy.addActionListener(this);
			add(buttonCopy);		
			
		setVisible(true);
	}
	
	public void addObserver(Observer o)
	{
		observers.add(o);
	}
	
	public void notifyObservers()
	{
		for (Observer o : observers)
		{
			o.update(source,buttonData,buttonTarget,buttonCopy);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent event)
	{
		source = event.getSource();		
		notifyObservers();
	}
}
