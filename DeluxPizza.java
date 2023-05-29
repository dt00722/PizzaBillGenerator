public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.extraCheese();
        super.extraToppings();

    }

    @Override
    public void extraCheese(){
    }

    @Override
    public void extraToppings() {
    }
}
