import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        Person person3= new Person();
        Car car = new Car();
        Car car2= new Car();
        Car car3 = new Car();
        School school = new School();
        School school2 = new School();
        School school3 = new School();
        Univorsity univorsity = new Univorsity();
        Univorsity univorsity2 = new Univorsity();
        Univorsity univorsity3 = new Univorsity();
        person.setName("kana");
        person.setSurName("maraimov");
        person.setAge(21);

        person2.setName("kana2");
        person2.setSurName("maraimov2");
        person2.setAge(22);

        person3.setName("kana3");
        person3.setSurName("maraimov3");
        person3.setAge(23);

        Person [] array = new Person[]{person,person2,person3};
        System.out.println("Person!!!");
        for (Person person1 : array) {

            person1.getInfo();
            System.out.println("========");
        }

        car.setCarName("lexus");
        car.setColor("white");

        car2.setCarName("lexus2");
        car2.setColor("white2");

        car3.setCarName("lexus3");
        car3.setColor("white3");

        Car [] array2 = new Car[]{car,car2,car3};
        System.out.println("Car!!!");
        for (Car car1 : array2) {

            car1.getInf02();
            System.out.println("========");
        }

        school.setSchoolName("kelechek");
        school.setNumber("87");

        school2.setSchoolName("kelechek2");
        school2.setNumber("88");

        school3.setSchoolName("kelechek3");
        school3.setNumber("89");

        School [] school1 = new School[]{school,school2,school3};
        System.out.println("School!!!");
        for (School school4 : school1) {

            school4.getInfo3();
            System.out.println("======");
        }

        univorsity.setColor("white");
        univorsity.setName("Adam");

        univorsity2.setColor("white2");
        univorsity2.setName("Adam2");

        univorsity3.setColor("white3");
        univorsity3.setName("Adam3");

        Univorsity[] univorsities = new Univorsity[]{univorsity,univorsity2,univorsity3};
        System.out.println("Univorsity!!!");
        for (Univorsity univorsity1 : univorsities) {

            univorsity1.getInfo4();
            System.out.println("========");
        }














//        Срок сдачи : 08.11.2024 / 18:00
//        University, School, Car жана Person деген класс тузунуз
//
//        Алардын свойстваларын ойлоп табыныз
//
//        Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//        Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//        Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз



//        Student student = new Student();
//        System.out.println("Write the subjects: ");
//        String subjects = new Scanner(System.in).nextLine();
    }
}