
public class Model
{
	private String pathData;
	private String pathTarget;
	
	public Model()
	{
		pathData = "/home/testowy/1/";
		pathTarget = "/home/testowy/Pulpit/2/";
	}

	public String getPathData()
	{
		return pathData;
	}

	public void setPathData(String pathData)
	{
		this.pathData = pathData;
	}

	public String getPathTarget()
	{
		return pathTarget;
	}

	public void setPathTarget(String pathTarget)
	{
		this.pathTarget = pathTarget;
	}
	
}
