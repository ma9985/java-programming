package day53_inheritanceTesla.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model Q", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
        System.out.println(ec1.getMake());
        System.out.println(ec1.getModel());
        System.out.println(ec1.getPrice());
        System.out.println(ec1.getRange());
        System.out.println(ec1.getYear());

        if (ec1.getPrice() > 10000) {
            System.out.println(ec1.getMake() +" - "+ec1.getModel() +" is out of my budget");
        } else {
            System.out.println("purchasing " + ec1.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 59900, 2022, 300);
        System.out.println("Count = " + ec2.toString());
        System.out.println("count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster", 20000 , 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());

        ModelX modelX = new ModelX("Tesla", "Model X", 89999.0, 2021, 360);
        System.out.println(modelX.toString());
        modelX.drive(50);
        System.out.println("Driving to Cicero");
        modelX.drive(105);
        System.out.println("How far Idris has to drive");
        System.out.println("Range remaining: " + modelX.getRange());
        System.out.println("Total electric cars count: " + modelX.getCount());
    }


}
