package programowanieOb.dziedziczenie.zadanieDziedziczenie;

public class CitizenDemo {
    public static void main(String[] args) {

        King king = new King("Jack");
        Peasant peasant = new Peasant("Michael");
        Soldier soldier = new Soldier("Peter");
        Townsman townsman = new Townsman("Elon");
        Citizen[] citizens={king,peasant,soldier,townsman};
        Town town = new Town(citizens);
        System.out.println(town);
        town.howManyCanVote();
        System.out.println(town.howManyCanVote());
        town.whoCanVote();

    }
}
