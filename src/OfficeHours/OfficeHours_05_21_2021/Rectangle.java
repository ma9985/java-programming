package OfficeHours.OfficeHours_05_21_2021;
/*
Create a class Rectangle
- Create these variables in the class: width, height, area (all double)
- Create these methods (non-static):
- setDimensions()
- parameters: width, height (Do not name the parameters the same as
your class variable names)
- return: void
- action: assigns the width and height of the object given from the
parameters. Also calculate the area of the rectangle in the method and store to the
area variable. (area = width * height)
- getArea()
- parameters: none
- return: int
- action: returns the area variable
- toString() generate the toString method as shown in class. See
Murodil_only for screenshots of steps
- Create a class RectangleObjects
- Create Rectangle objects, call the setDimensions and getArea methods of the
objects
 */
public class Rectangle {

    double height;
    double width;
    double area;

    public void setDimensions(double recHeight1, double recWidth) {
        height = recHeight1;
        width = recWidth;
        area = height * width;
    }

    public double getArea() {
        return  area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
