public class Univorsity {
private String name ;
private String color;

public Univorsity (){}

    public String getName (){return name;}
    public void setName (String name ){this.name = name;}

    public String getColor (){return color ;}
    public void setColor (String color ){this.color = color;}

    public void getInfo4(){
        System.out.printf("""
                name:         %s
                color school: %s
                """,name,color);
    }
}
