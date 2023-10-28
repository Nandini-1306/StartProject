package facilities;
public class beverages {
    private double totalCost;

    public beverages() {
        totalCost = 0;
    }

    public double chooseColdCoffee(String choice, String size) {
        double price = 0;
        if ("mocha".equals(choice)) {
            price = getColdCoffeePrice(size, 225, 250, 285);
        } 
        else if ("caramel".equals(choice) || "espresso".equals(choice)) {
            price = getColdCoffeePrice(size, 270, 295, 325);
        }
        totalCost += price;
        return price;
    }

    public double chooseIcedCoffee(String choice, String size)
     {
        double price = 0;
        if ("iced americano".equals(choice)) {
            price = getIcedCoffeePrice(size, 210, 235, 260);
        } else if ("iced latte".equals(choice)) {
            price = getIcedCoffeePrice(size, 225, 250, 275);
        }
        totalCost += price;
        return price;
    }


    public double chooseTea(String choice, String size) {
        double price = 0;
        if ("black tea".equals(choice)) {
            price = getTeaPrice(size, 205, 205, 225);
        } else if ("tea latte".equals(choice)) {
            price = getTeaLattePrice(size);
        }
        totalCost += price;
        return price;
    }

    public double chooseHandcraftedEspresso(String choice, String size) {
        double price = 0;
        if ("flat white".equals(choice)) {
            price = getEspressoPrice(size, 100, 150, 180);
        }
        totalCost += price;
        return price;
    }

    public double getTotalCost() {
        return totalCost;
    }
    private double getColdCoffeePrice(String size, double tallPrice, double grandePrice, double ventiPrice) {
        switch (size) {
            case "tall":
                return tallPrice;
            case "grande":
                return grandePrice;
            case "venti":
                return ventiPrice;
            default:
                return 0;
        }
    }

    private double getIcedCoffeePrice(String size, double tallPrice, double grandePrice, double ventiPrice) {
        return getColdCoffeePrice(size, tallPrice, grandePrice, ventiPrice);
    }

    private double getTeaPrice(String size, double shortPrice, double tallPrice, double grandePrice) {
        switch (size) {
            case "short":
            return shortPrice;
            case "tall":
                return tallPrice;
            case "grande":
                return grandePrice;
            default:
                return 0;
        }
    }

    private double getTeaLattePrice(String size) {
        if ("chai".equals(size) || "green".equals(size)) {
            return getTeaPrice(size, 200, 225, 250);
        } else {
            return 0;
        }
    }

    private double getEspressoPrice(String size, double tallPrice, double grandePrice, double ventiPrice) 
    {
        return getColdCoffeePrice(size, tallPrice, grandePrice, ventiPrice);
} 
 }
