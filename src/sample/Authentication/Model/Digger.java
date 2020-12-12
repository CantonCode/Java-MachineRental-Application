package sample.Authentication.Model;

public class Digger extends Machine {

    String maxLiftingWeight;


    public Digger(){
    }

    public Digger(String id,String name,Boolean rented,int costPerDay,String category,String maxLiftingWeight){
        super(id,name,rented,costPerDay,category);
        this.maxLiftingWeight = maxLiftingWeight;
    }

    public String getMaxLiftingWeight() {
        return maxLiftingWeight;
    }

    public void setMaxLiftingWeight(String maxLiftingWeight) {
        this.maxLiftingWeight = maxLiftingWeight;
    }


    public double calcRent(int days) {
        double price = this.getCostPerDay()*days;
        if(days>7 && days<=30){
            price *= 0.9;
        }else if(days>30 && days<=150){
            price *= 0.8;
        }else if(days>150){
            price *= 0.7;
        }
        return price;

    }
}
