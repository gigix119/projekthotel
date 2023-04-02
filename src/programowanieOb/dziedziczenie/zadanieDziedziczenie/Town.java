package programowanieOb.dziedziczenie.zadanieDziedziczenie;

import java.util.Arrays;

public class Town {
    private Citizen[] citizens;


    public Town(Citizen[] citizens) {
        this.citizens = citizens;
    }

    public int howManyCanVote() {
        int sum = 0;
        for (Citizen citizen : citizens) {
            System.out.println(citizen.canVote());
            if (citizen.canVote()) {
                sum++;
            }
        }
        return sum;
    }

    public void whoCanVote(){
        for (Citizen citizen : citizens) {
            if (citizen.canVote()){
                System.out.println("Może glosowac :" + citizen.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + Arrays.toString(citizens) +
                '}';
    }
}

/*
 * Stwórz klasę Town która posiada tablicę Citizenów. Dodaj do niej kilku citizenów (różnych w mainie
 * ) i stwórz metody howManyCanVote które zwracają ilość osób które mogą głosować. Stwórz w klasie Town metodę "whoCanVote" która wypisuje imiona osób które mogą głosować.*/
