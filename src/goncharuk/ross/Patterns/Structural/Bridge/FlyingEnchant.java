package goncharuk.ross.Patterns.Structural.Bridge;

public class FlyingEnchant implements Enchantment {
    @Override
    public void onActivate() {
        System.out.println("Flying Activated");
    }

    @Override
    public void apply() {
        System.out.println("using flying");
    }

    @Override
    public void onDeactivate() {
        System.out.println("Flying Deactivated");
    }
}
