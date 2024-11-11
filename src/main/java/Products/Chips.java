package Products;

import Interface.IPriceable;

public class Chips implements IPriceable {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Chips(String type) {
        this.type = type;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
