package ca.durhamcollege;

public class Line
{
    // Private instance members
    private Vector2D start;
    private Vector2D end;
    private float length; // magnitude is like distance?

    // Public Properties
    public Vector2D getStart()
    {
        return start;
    }

    public void setStart(Vector2D start)
    {
        this.start = start;
    }

    public Vector2D getEnd()
    {
        return end;
    }

    public void setEnd(Vector2D end)
    {
        this.end = end;
    }

    public void set(Vector2D start, Vector2D end)
    {
        setStart(start);
        setEnd(end);
    }

    public float getLength() // getting rid of setter makes it a READ ONLY property
    {
        return Vector2D.distance(getStart(), getEnd()); // now a convenience function
    }


    // Constructors
    Line()
    {
        set(new Vector2D.zero(), )
    }

    Line(Vector2D start, Vector2D end)
    {
        set(start, end);
    }




}