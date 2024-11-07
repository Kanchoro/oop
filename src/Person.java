public class Person {
    private String name ;
    private String surName;
    private int age ;

    public Person (){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }
    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}

    public void getInfo(){
        System.out.printf("""
                Name:     %s
                Sur name: %s
                Age:      %d
                """,name,surName,age);
    }
}
