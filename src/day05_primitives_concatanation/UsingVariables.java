package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        num1 = 200;
        System.out.println(num1);
        System.out.println(num2);

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        int inThirasZipCode = 22182;
        int parvinsZipCode = inThirasZipCode;
        System.out.println(inThirasZipCode);
        System.out.println(parvinsZipCode);

        inThirasZipCode = 20007;
        parvinsZipCode =  33313;
        System.out.println(inThirasZipCode);
        System.out.println(parvinsZipCode);


    }
}
