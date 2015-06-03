package poorpixel.geometry;

public class Mesh2D
{
	/**
	 * Array of Points that define the Mesh. The Points must in order clockwise.
	 */
	private Point2D[] vertices;
	
	private Mesh2D(Point2D[] vertices)
	{
		this.vertices = vertices;
	}
	
	public static Mesh2D getMesh2D(Point2D[] vertices) throws ImpossibleGeometryException
	{
		if(vertices.length>2)
		{
			return new Mesh2D(vertices);
		}
		else
		{
			throw new ImpossibleGeometryException("Mesh has less than 3 Vertices. Thats impossible!");
		}
	}
	
	public Point2D[] getVertices()
	{
		return this.vertices;
	}
	public void setVertices(Point2D[] vertices)
	{
		this.vertices = vertices;
	}
	
	public static class ImpossibleGeometryException extends Exception
	{
		/*
		 * Default serialVersionUID because Eclipse sucks.
		 */
		private static final long serialVersionUID=1L;

		public ImpossibleGeometryException(String m)
		{
			System.err.println(m);
		}
	}
}
