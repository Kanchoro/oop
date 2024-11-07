public class Car {
    private String carName;
    private  String color;


    public Car(){}

    public String getCarName(){return carName;}
    public void setCarName(String carName){this.carName=carName;}

    public String getColor(){return color;}
    public void setColor(String color){this.color=color;}

    public void getInf02(){
        System.out.printf("""
                name:   %s
                color:  %s
                """,carName,color);
    }
}
