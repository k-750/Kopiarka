import java.awt.EventQueue;

public class Kopiarka
{

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable(){
			public void run(){
				Model model = new Model();
				View view = new View();
				Controller controller = new Controller(model,view);
				
				view.addObserver(controller);
			}
		});
	}

}
