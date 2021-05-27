package day17_ternary_nested_condition;

public class MoreTernary {
    public static void main(String[] args) {
        double hourlyRate = 50;
   //     String reply;
 //       if(hourlyRate > 45) {
   //         reply = "accept";
     //   } else {
       //     reply = "reject";
        //}
        String reply = (hourlyRate > 45) ? "accept" : "reject";
       System.out.println("reply = " + reply);
       
       String todayClass = "java";
       
       String teacher = (todayClass.equals("java")) ? "Saim|Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);
        
        boolean isEligibaleToDrive = false;
       String driving = (isEligibaleToDrive) ? "Have DL, can drive" : "No cannot drive";
        System.out.println("driving = " + driving);
       
    }
}

