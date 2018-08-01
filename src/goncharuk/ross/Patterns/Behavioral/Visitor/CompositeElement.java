package goncharuk.ross.Patterns.Behavioral.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements ItemElement {

    private List<ItemElement> items;

    public CompositeElement() {
        items = new ArrayList<>();
    }

    public void addElements(ItemElement element){
        items.add(element);
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        int sum = 0;
        for (ItemElement item : items){
            sum += item.accept(visitor);
        }
        return sum;
    }
}
