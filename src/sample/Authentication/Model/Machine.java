package sample.Authentication.Model;



public abstract class Machine {

    private String id;
    private String name;
    private Boolean rented;
    private String category;
    private int costPerDay;


    public Machine(){

    }

    public Machine(String id,String name,Boolean rented,int costPerDay,String category){
        this.id = id;
        this.name = name;
        this.rented = rented;
        this.costPerDay = costPerDay;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRented() {
        return rented;
    }

    public void setRented(Boolean rented) {
        this.rented = rented;
    }

    public int getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(int costPerDay) {
        this.costPerDay = costPerDay;
    }

    public abstract double calcRent(int days);

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
