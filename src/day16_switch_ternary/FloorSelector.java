package day16_switch_ternary;
/*
declare variable floorNum = 1
Multi branch if:                 want to see if its equal to 1
when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"

when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"

when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

anything else: print "Invalid floor - 6"
 */
public class FloorSelector {
    public static void main(String[] args) {
        int floorNum = 3;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if(floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if(floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
        }

            System.out.println("**************switch statement part**************");

            floorNum = 1;

            switch (floorNum) {
                case 1:   //else if();
                    System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;  //exit switch
                case 2:
                    System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
                    break;
                case 3:
                    System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                    break;
                default:
                    System.out.println("Invalid floor - " + floorNum);
                    break;
            }

        }

}
