package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        // Create an array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[]{
                // Add menu items
                new Burger("Beef Burger", 8.50, "Lettuce, Tomato, Onion"),
                new Pizza("Isabella", 12.50, "Ham & Mushroom"),
                new Salad("Caesar Salad", 5.50,"Romaine Lettuce, croutons, Caesar dressing, Chicken"),
                new Cocktails("Long Island Iced Tea", 11.50, "Vodka, Rum, Gin, Tequila, Triple Sec, Cola, Lemon Slice")

        };

        // Display details of each menu item
        for (MenuItem menuItem : menuItems){
            // Print out the Name, price and description of each item
            System.out.println("Name: " + menuItem.getName() + "\nDescription: " + menuItem.getIngredients() + "\nPrice: " + menuItem.getPrice());
            System.out.println();
        }

        // Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems){
            // totalCost of all menuItem prices in an order
            totalCost = totalCost + menuItem.getPrice();
        }
        System.out.println("Total Cost: €" + totalCost);
    }

}
