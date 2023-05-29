public class Pizza {
    private Integer price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpack = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedTakeAway = false;


    public Pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void extraCheese(){
        isExtraCheeseAdded = true;
        System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice ;

    }
    public void extraToppings(){
        isExtraToppingsAdded = true;
        System.out.println("Extra Toppings Added");
        this.price += extraToppingsPrice;

    }
    public void takeAway(){
        isOptedTakeAway = true;
        System.out.println("TakeAway Opted");
        this.price += backpack;

    }
    public void getBill(){
        String bill = "";
        System.out.println("Pizza" +basePizzaPrice);
        if(isExtraCheeseAdded){
            bill += "ExtraCheeseAdded" +extraCheesePrice + "\n";

        }
        if(isExtraToppingsAdded){
            bill += "ExtraToppingsAdded" +extraToppingsPrice + "\n";

        }
        if(isOptedTakeAway){
            bill += "Take Away" +backpack + "\n";

        }
        bill += "Bill" +this.price + "\n";
        System.out.println(bill);

    }

}
