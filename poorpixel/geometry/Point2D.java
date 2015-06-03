package poorpixel.geometry;

public class Point2D
{
	private float x,y;
	
	public Point2D(float x, float y)
	{
		this.x = x; this.y = y;
	}
	
	public boolean isInsideMesh(Mesh2D mesh)
	{
		//TODO: Implement
		//Idea was to test, if the Point was on the right hand side 
		//of any line that can be drawn from Point i to Point i+1 and 
		//Point n to Point 0 for 0<=i<n+1 where n is the total of points
		//in the mesh.
		//Would work for any concave mesh.
		return false;
	}
	
	
	
	public float getX()
	{
		return this.x;
	}
	public float getY()
	{
		return this.y;
	}
	
	public void setX(float x)
	{
		this.x = x;
	}
	public void setY(float y)
	{
		this.y = y;
	}
}
