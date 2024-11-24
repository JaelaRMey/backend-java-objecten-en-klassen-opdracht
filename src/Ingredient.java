public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    public Ingredient(){};
    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }
    public double getAmount(){
        return this.amount;
    }
    public String getUnit(){
        return this.unit;
    }
    public String getName(){
        return this.name;
    }
    public void setAmount(int amount){};
    public void setUnit(String unit){};
    public void setName(String name){};
}
