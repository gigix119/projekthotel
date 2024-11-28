package programowanieOb.interfaces.example.kordian;

public class Mother extends FamilyMember implements IFamilyMember {

    public Mother(String name) {
        super(name);
    }

    @Override
    public void whoAreYou() {
        System.out.println("Im Mother " + name);
    }

    @Override
    public boolean isMatuer() {
        return true;
    }
}
