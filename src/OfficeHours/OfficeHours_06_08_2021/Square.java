package OfficeHours.OfficeHours_06_08_2021;

public class Square extends Shape{

    double length;
    double width;

    double side;

    @Override
    public void calculateArea() {
    area = side * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = side * 4;

    }
    @Override
    public String toString() {
        return "Square{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
