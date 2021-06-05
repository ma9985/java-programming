package OfficeHours.OfficeHours_06_01_2021;

import java.util.ArrayList;
import java.util.Arrays;

/*
   Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            sprintNumber

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */
public class ScrumTeam {
    //Attributes: PO, BA, SM,
    //ArrayList<Tester> testersList = new ArrayList<>(),
    //ArrayList<Developer> devopsList = new ArrayList<>(),
    //sprintNumber

    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    int sprintNumber;
    ArrayList<Tester1> allTesters;
    ArrayList<Developer> allDevelopers;

    //Constructor sets the names of: PO, BA, SM
    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner= productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allDevelopers = new ArrayList<>();
        this.allTesters = new ArrayList<>();

    }
    public void addTester(Tester1 tester) {
        this.allTesters.add(tester);

    }
    public void addTester(Tester1 [] tester) {
        this.allTesters.addAll(Arrays.asList(tester));

    }
}
