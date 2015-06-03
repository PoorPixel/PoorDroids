package poorpixel.geometry;

public abstract class Line2D
{
	protected Point2D a, b;
	
	public Line2D(Point2D a, Point2D b)
	{
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Returns true, when this Line intersects the other Line
	 * @param other Line2D
	 * @return true when intersecting
	 */
	public abstract boolean intersects(Line2D other);
	
	/**
	 * Returns the Point, where this Line2D and the other intersect.
	 * If they dont intersect, return null;
	 * @param other other Line
	 * @return the Intersection or null
	 */
	public abstract Point2D getIntersection(Line2D other);
	
	private static class InfiniteLine2D extends Line2D
	{
		public InfiniteLine2D(Point2D a, Point2D b)
		{
			super(a,b);
		}

		@Override
		public boolean intersects(Line2D other)
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Point2D getIntersection(Line2D other)
		{
			// TODO Auto-generated method stub
			return null;
		}
	}
	
	private static class SingleSideInfiniteLine2D extends Line2D
	{

		public SingleSideInfiniteLine2D(Point2D a, Point2D b)
		{
			super(a, b);
		}

		@Override
		public boolean intersects(Line2D other)
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Point2D getIntersection(Line2D other)
		{
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	private static class FiniteLine2D extends Line2D
	{

		public FiniteLine2D(Point2D a, Point2D b)
		{
			super(a, b);
		}

		@Override
		public boolean intersects(Line2D other)
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Point2D getIntersection(Line2D other)
		{
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
