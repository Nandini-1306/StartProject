package facilities;
public class Food
 {
    public String name;
    public double price;
    public String category;
    public boolean isVegetarian;

    public Food(String name, double price, String category, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isVegetarian = isVegetarian;
    }

    public String toString() {
    return "Name: " + name + "\nCategory: " + category + "\nPrice: " + price + "\nIs Vegetarian: " + isVegetarian;
   }
}