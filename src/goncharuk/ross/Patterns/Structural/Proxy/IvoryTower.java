package goncharuk.ross.Patterns.Structural.Proxy;

public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.println(wizard + " enters the tower");
    }
}
