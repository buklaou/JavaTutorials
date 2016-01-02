package OOP.Classes;

/**
 * Created by Raffi on 12/26/2015.
 */
public class Car {

    private int door;
    private int wheels;
    private String model;
    private String color;


    //setModel updates the String model variable with whatever gets passed in the setModel parameter
    public void setModel(String model) {

        String validModel = model.toLowerCase(); //storing a lowercase version of model string in validModel
        //so that you can validate it in this statement
        //.equals compares the string that is being passed into this method to the one that is in the if statement
        if(validModel.equals("911") || validModel.equals("F12")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //getModel returns the value that is stored in the model field after it is changed by this.model
    public String getModel() {
        return this.model;
    }
}
