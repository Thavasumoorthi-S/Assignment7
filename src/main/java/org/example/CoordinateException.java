package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class CoordinateException implements Cloneable {
    private static final Logger LOGGER = Logger.getLogger("global");
    int x;
    int y;

    CoordinateException(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String equals(CoordinateException c3) {
        String result;
        result = this.x == c3.x && this.y == c3.y ? "true" : "false";
        return result;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            Scanner sc = new Scanner(System.in);
            LOGGER.log(Level.INFO, "Enter the value x:");
            int x = sc.nextInt();
            LOGGER.log(Level.INFO, "Enter the value y:");
            int y = sc.nextInt();
            CoordinateException c = new CoordinateException(x, y);
            CoordinateException c2 = (CoordinateException) c.clone();
            String s = c.equals(c2);
            LOGGER.info("Orginal object and clonable object is Same ?: ");
            LOGGER.info(s);
        }
        catch(InputMismatchException e)
        {
            throw new InputMismatchException("Please Enter the valid input");
        }
    }
}