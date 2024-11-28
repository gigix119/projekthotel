package programowanieOb.interfaces.example.kordian;

public class Son extends FamilyMember implements IFamilyMember {

    public Son(String name) {
        super(name);
    }

    @Override
    public void whoAreYou() {
        System.out.println("who’s asking? " + name);
    }

    @Override
    public boolean isMatuer() {
        return false;
    }
}
