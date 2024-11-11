package AbstractClasses;

import Interface.IPriceable;

public abstract class AllToppings implements IPriceable {
    private String name;

    public AllToppings(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
