package goncharuk.ross.Patterns.Structural.Bridge;

public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
