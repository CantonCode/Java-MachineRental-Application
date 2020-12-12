package sample.Authentication.Model;

public class Crane extends Machine {

    String height;
    String liftingLoad;

    public Crane() {
    }

    public Crane(String id, String name, Boolean rented, int costPerDay, String category, String height, String liftingLoad) {
        super(id, name, rented, costPerDay, category);
        this.height = height;
        this.liftingLoad = liftingLoad;
    }

    public double calcRent(int days) {
        double price = this.getCostPerDay()*days;
        if(days>=3 && days<7){
            price *= 0.9;
        }else if(days>=7 && days<30){
            price *= 0.8;
        }else if(days>=30 && days<150){
            price *= 0.7;
        }else if(days>150){
            price *= 0.6;
        }
        return price;

    }



    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;

    }
}
