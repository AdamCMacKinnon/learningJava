import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        new Thing();
//        Thing thing = new Thing();
//        thing.num = 5;
//        thing.word = "hello";
//
//        Thing thing2 = new Thing();
//        thing2.num = 21;
//        thing2.word = "whatever";
//
//        System.out.println(thing.num + thing2.num);
//
//        thing.foo();
//        thing2.foo();
//    }
//public static void main(String[] args) {
//    Employee emp = new Employee();
//    Employee emp2 = new Employee();
//    Employee emp3 = new Employee();
//
//    emp.name = "Jeff";
//    emp.age = 32;
//    emp.jobTitle = "Construction Worker";
//
//    emp2.name = "Sarah";
//    emp2.age = 28;
//    emp2.jobTitle = "Electrician";
//
//    emp3.name = "Bill";
//    emp3.age = 37;
//    emp3.jobTitle = "Project Manager";
//
//    bar(emp3);
//    bar(emp2);
//    bar(emp);

//
//}
//
//static void bar(Employee emp) {
//    System.out.println(emp.name + " is " + emp.age + " years old, and is a " + emp.jobTitle);
//}
public static void main(String[] args) {
    Door dd = new Door();
    dd.name = "Driver";
    dd.open();
    dd.printStatus();
    dd.close();
    dd.printStatus();

    Door pd = new Door();
    pd.name = "Passenger";
    pd.printStatus();
    pd.open();
    pd.printStatus();


}

}
