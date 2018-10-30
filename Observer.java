import javax.swing.JButton;

public interface Observer
{
	public void update(Object source , JButton buttonData, JButton buttonTarget, JButton buttonCopy);
}
