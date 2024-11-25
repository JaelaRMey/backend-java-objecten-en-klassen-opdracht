public class Ingredient {
    private String amount;
    private String unit;
    private String name;

    public Ingredient(){};
    public Ingredient(String amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public String getAmount(){
        return this.amount;
    }
    public String getUnit(){
        return this.unit;
    }
    public String getName(){
        return this.name;
    }
    public void setAmount(String amount){};
    public void setUnit(String unit){};
    public void setName(String name){};
}
