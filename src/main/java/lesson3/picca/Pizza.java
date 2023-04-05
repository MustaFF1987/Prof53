package lesson3.picca;

public class Pizza {
   // private String size;
    private PizzaSize size;
    private int ham;
    private int cheese;
    private int peperoni;
    private int salami;
    private int pineapple;

//    public Pizza(String size, int ham, int cheese, int peperoni, int salami, int pineapple) {
//        this.size = size;
//        this.ham = ham;
//        this.cheese = cheese;
//        this.peperoni = peperoni;
//        this.salami = salami;
//        this.pineapple = pineapple;
//    }


    public Pizza(PizzaSize size, int ham, int cheese, int peperoni, int pineapple) {
        this.size = size;
        this.ham = ham;
        this.cheese = cheese;
        this.peperoni = peperoni;
        this.pineapple = pineapple;
    }


//    public int calculatePrice()
//    {
//        int price = 0;
//        // SMALL 10
//        // MIDDLE 12
//        // LARGE 14
//        switch (size)
//        {
//            case "SMALL":
//                price += 10;
//                break;
//            case "MIDDLE":
//                price += 12;
//                break;
//            case "LARGE":
//                price += 14;
//                break;
//        }
//        // за каждый дополнительный топпинг по 2
//        price += (ham + cheese + peperoni + pineapple) * 2;
//
//        return price;
//    }


    public int calculatePrice()
    {
        int price = 0;
        // SMALL 10
        // MIDDLE 12
        // LARGE 14
        switch (size)
        {
            case SMALL:
                price += 10;
                break;
            case MIDDLE:
                price += 12;
                break;
            case LARGE:
                price += 14;
                break;
        }
        // за каждый дополнительный топпинг по 2
        price += (ham + cheese + peperoni + pineapple) * 2;
        return price;
    }



    public static void main(String[] args) {
        Pizza p1 = new Pizza(PizzaSize.MIDDLE,1, 0, 1,2);
        System.out.println(p1.calculatePrice());
    }

}


