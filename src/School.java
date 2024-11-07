public class School {
    private String number ;
    private String schoolName;


    public School (){}

    public String getNumber(){return number;}
    public void setNumber(String number ){this.number= number;}

    public String getSchoolName(){return schoolName;}
    public void  setSchoolName(String schoolName){this.schoolName=schoolName;}

    public void getInfo3(){
        System.out.printf("""
                number: %s
                name:   %s
                """,number,schoolName);
    }
}
