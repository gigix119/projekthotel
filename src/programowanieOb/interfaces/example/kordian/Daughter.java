package programowanieOb.interfaces.example.kordian;

public class Daughter extends FamilyMember implements IFamilyMember {
    public Daughter(String name) {
        super(name);
    }

    @Override
    public void whoAreYou() {
        System.out.println("Im Daughter " + name);
    }

    @Override
    public boolean isMatuer() {
        return false;
    }
}
