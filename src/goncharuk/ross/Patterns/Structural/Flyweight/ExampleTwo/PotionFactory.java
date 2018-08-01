package goncharuk.ross.Patterns.Structural.Flyweight.ExampleTwo;

import java.util.EnumMap;
import java.util.Map;

public class PotionFactory {

    private final Map<PotionType, Potion> potions;

    public PotionFactory() {
        potions = new EnumMap<>(PotionType.class);
    }

    //Fabric method
    public Potion createPotion(PotionType potionType) {
        Potion potion = potions.get(potionType);
        if (potion == null) {
            switch (potionType) {
                case HEALING:
                    potion = new HealingPotion();
                    potions.put(potionType, potion);
                    break;
                case INVISIBILITY:
                    potion = new InvisibilityPotion();
                    potions.put(potionType, potion);
                    break;
                default:
                    break;
            }
        }
        return potion;
    }

    public enum PotionType {
        HEALING,
        INVISIBILITY
    }
}
