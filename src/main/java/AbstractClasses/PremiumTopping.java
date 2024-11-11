package AbstractClasses;

public abstract class PremiumTopping extends AllToppings {
    private String name;

    public PremiumTopping(String name) {
        super(name);
    }

    public double getPrice() {
        return 0;
    }


}
