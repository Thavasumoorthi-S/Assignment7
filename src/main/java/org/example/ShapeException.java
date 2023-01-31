package org.example;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
class ShapeException
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    int length;
    int breadth;
    int height;
    int radius;
    ShapeException(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    ShapeException(int breadth,int height,int side1,int side2,int side3)
    {
        this.breadth=breadth;
        this.height=height;
    }
    ShapeException(int radius)
    {
        this.radius=radius;
    }
    public int rectarea(int length,int breadth)
    {
        int result1;
        result1=length*breadth;
        return result1;

    }public float triarea(int breadth,int height)
{
    float result;
    result=(float)(breadth*height)/2;
    return result;
}
    public double cirarea(int radius)
    {
        double result;
        result=Math.PI*radius*radius;
        return result;
    }
    public int rectperimeter(int length,int breadth)
    {
        int result;
        result=2*(length+breadth);
        return result;
    }
    public int triperimeter(int side1,int side2,int side3)
    {
        int result;
        result=side1+side2+side3;
        return result;
    }
    public  double circumference(int radius)
    {
        double result;
        result=2*(Math.PI)*radius;
        return result;
    }
    public static void main(String[] args)
    {
        int choice;
        int length;
        int breadth;
        int height;
        int radius;
        int side1;
        int side2;
        int base;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            try {
                LOGGER.log(Level.INFO, "\n1)Rectangle\n2)Triangle\n3)circle\n4)exit");
                LOGGER.log(Level.INFO, "Enter your choice: ");
                choice = sc.nextInt();
                if (choice == 1) {
                    LOGGER.log(Level.INFO, "Enter the length: ");
                    length = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the breadth: ");
                    breadth = sc.nextInt();
                    ShapeException shape = new ShapeException(length, breadth);
                    LOGGER.log(Level.INFO, Integer.toString(shape.rectarea(shape.length, shape.breadth)), "Area of the Rectangle: " + shape.rectarea(shape.length, shape.breadth));
                    LOGGER.log(Level.INFO, Integer.toString(shape.rectperimeter(shape.length, shape.breadth)), "perimeter of the Rectangle: " + shape.rectperimeter(shape.length, shape.breadth));
                } else if (choice == 2) {
                    LOGGER.log(Level.INFO, "Enter the breadth: ");
                    breadth = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the height: ");
                    height = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the side1: ");
                    side1 = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the side2: ");
                    side2 = sc.nextInt();
                    LOGGER.log(Level.INFO, "Enter the base: ");
                    base = sc.nextInt();
                    ShapeException shape = new ShapeException(breadth, height, side1, side2, base);
                    LOGGER.log(Level.INFO, Float.toString(shape.triarea(shape.breadth, shape.height)), "Area of the Triangle: " + shape.triarea(shape.breadth, shape.height));
                    LOGGER.log(Level.INFO, Integer.toString(shape.triperimeter(side1, side2, base)), "perimeter of the Triangle: " + shape.triperimeter(side1, side2, base));
                } else if (choice == 3) {
                    LOGGER.log(Level.INFO, "Enter the radius: ");
                    radius = sc.nextInt();
                    ShapeException shape = new ShapeException(radius);
                    LOGGER.log(Level.INFO, Double.toString(shape.cirarea(shape.radius)), "Area of the Circle: " + shape.cirarea(shape.radius));
                    LOGGER.log(Level.INFO, Double.toString(shape.circumference(shape.radius)), "Circumference of the Circle: " + shape.circumference(shape.radius));
                } else if (choice == 4) {
                    break;
                }
            }
            catch(InputMismatchException ex)
            {
                throw new InputMismatchException("please Enter the valid input");
            }
        }
    }
}
