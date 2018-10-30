import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller implements Observer
{
	private Model model;
	private View view;
	
	public Controller(Model m, View v)
	{
		model = m;
		view = v;
	}
	
	private void copy()
	{
		Path pathData = Paths.get(model.getPathData());
		Path pathTarget = Paths.get(model.getPathTarget());
		try
		{
			Files.copy(pathData, pathTarget, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
		} catch (IOException e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}

	@Override
	public void update(Object source, JButton buttonData, JButton buttonTarget, JButton buttonCopy)
	{
		if (source==buttonData)
		{
			JOptionPane.showConfirmDialog(null, "ŁAAAAAAAAAAAAAAA");
		}
		if (source==buttonTarget)
		{
			JOptionPane.showConfirmDialog(null, "TARGET");
		}
		if (source==buttonCopy) copy();
	}
}
