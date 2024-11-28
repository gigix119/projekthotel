package programowanieOb.interfaces.example.kordian;

public class StepFather extends FamilyMember implements IFamilyMember {


    public StepFather(String name) {
        super(name);
    }

    public void whoAreYou() {
        System.out.println("name stepFather " + name);
    }

    @Override
    public boolean isMatuer() {
        return true;
    }
}
