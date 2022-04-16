package encapsulation;

public class Car {
    //instance variable
    public String make;
    private double price;
    private int year;
    private boolean isConvertible=true;//if you don't want anybody change this
    //do not provide set method

    public boolean isConvertible() {
        return isConvertible;
    }

    //providing indirect access to year to set and get info
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }

    public double getPrice() {
        return price;
    }
   //writing - setting info
    public void setPrice(double price,String adminPassword) {
        if (adminPassword.equals("abcd1234")) this.price = price;
        else throw new RuntimeException("The password entered is not valid");
        }
    }


