package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if(city.equals("Los Angeles")) {           //can say if(city == ("los angeles")
            System.out.println("It is LA");
        }else{ //~means otherwise~
            System.out.println("It is not LA");
        }
        String weather = "Sunny";
        if(weather.equals("Is sunny!")) {
            System.out.println("Lets go out and code java!");
        }else{
            System.out.println("Let's stay indoors and code ur mom");
        }
    }
}
