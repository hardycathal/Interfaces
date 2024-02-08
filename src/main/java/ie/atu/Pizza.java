package ie.atu;

class Pizza implements MenuItem{
    private String name;
    private double price;
    private String ingredients;

    public Pizza(String name, double price, String ingredients) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getIngredients() {
        return ingredients;
    }
}
