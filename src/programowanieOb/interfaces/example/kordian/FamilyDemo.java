package programowanieOb.interfaces.example.kordian;

import java.util.ArrayList;

public class FamilyDemo {
    public static void main(String[] args) {
        Daughter daughter = new Daughter("Zofia");
        Father father = new Father("Dawid");
        Son son = new Son("Szymon");
        Mother mother = new Mother("Michalina");
        StepFather stepFather = new StepFather("Stefan");
        ArrayList<IFamilyMember> family = new ArrayList<>();
        family.add(daughter);
        family.add(father);
        family.add(mother);
        family.add(son);
        family.add(stepFather);
        for (IFamilyMember familyMember : family) {
            familyMember.whoAreYou();
            System.out.println(familyMember.isMatuer());
        }
    }
}
