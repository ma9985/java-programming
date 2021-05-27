package OfficeHours.OfficeHours_05_22_2021;

public class AnimalSpecies {

    String name;
    int population;
    int growthRate;

    public void setInfo(String setName, int setPopulation, int setGrowthRate) {
        name= setName;
        population = setPopulation;
        growthRate = setGrowthRate;
    }
    public String getName() {
        if(name == null) {
            name = "No name defined";
        }
        return  name;
    }
    public int getPopulation() {
        return population;
    }
    public int getGrowthRate() {
        return growthRate;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "AnimalSpecies{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", growthRate=" + growthRate +
                '%';
    }
}

