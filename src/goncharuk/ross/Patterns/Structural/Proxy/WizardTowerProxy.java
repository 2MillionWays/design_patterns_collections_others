package goncharuk.ross.Patterns.Structural.Proxy;

public class WizardTowerProxy implements WizardTower {

    private static final int MAX_ALLOWED_WIZ = 2;
    private int currentNumber;
    private final WizardTower wizardTower;

    public WizardTowerProxy(WizardTower wizardTower){
        this.wizardTower = wizardTower;
    }

    @Override
    public void enter(Wizard wizard) {
        if (currentNumber < MAX_ALLOWED_WIZ){
            wizardTower.enter(wizard);
            currentNumber++;
        } else {
            System.out.println(wizard + " is not allowed to enter!");
        }
    }
}
