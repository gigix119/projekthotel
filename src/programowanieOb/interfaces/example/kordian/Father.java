package programowanieOb.interfaces.example.kordian;

public class Father extends FamilyMember implements IFamilyMember {
    public Father(String name) {
        super(name);
    }

    @Override
    public void whoAreYou() {
        System.out.println("Im Father " + name);
    }

    @Override
    public boolean isMatuer() {
        return true;
    }
}
