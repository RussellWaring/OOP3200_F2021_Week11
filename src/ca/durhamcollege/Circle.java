/** Circle.java
 * @author  Russell Waring
 * @file    OOP3200 - Week 11p2, Java - Classes & Objects (continued)
 * @date    November 24nd, 2021
 * @description     Created while following along in class of week 11. Extension of shape class
 */
package ca.durhamcollege;

public class Circle extends Shape
{
    // ==========Private Instance Members
    private Vector2D center;
    private float radius;

    // ==========Public Properties
    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public Vector2D getCenter()
    {
        return center;
    }

    public void setCenter(Vector2D center)
    {
        super.setVertex(center);
        this.center = center;
    }

    public void set(Vector2D center, float radius)
    {
        setCenter(center);
        setRadius(radius);
    }

    public float getCircumference()
    {
        return (float) (Math.PI * radius * 2);
    }

    public float getArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    // ==========Constructors
    public Circle(Vector2D center, float radius)
    {
        super();
        set(center, radius);
    }

    // ==========Private Methods

    // ==========Public Methods
    @Override
    public String toString()
    {
        String outputString = "";
        outputString += "------------------------------\n";
        outputString += "Center        : " + getCenter() + "\n";
        outputString += "Radius        : " + getRadius() + "\n";
        outputString += "Area          : " + getArea() + "\n";
        outputString += "Circumference : " + getCircumference() + "\n";
        outputString += "------------------------------\n";
        return outputString;
    }


}
