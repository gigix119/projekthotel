package zzajecia;

public class Car extends AtrapaSamochodu implements DriveInterface {

    @Override
    public String jedz(){
        return "WRUM WRUM";
    }

    public void infoAuto(){
        System.out.println("Informacja o samochodzie ....");
    }

}
