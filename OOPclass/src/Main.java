import java.util.ArrayList;

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
//public static void main(String[] args) {
//    Door dd = new Door();
//    dd.name = "Driver";
//    dd.open();
//    dd.printStatus();
//    dd.close();
//    dd.printStatus();
//
//    Door pd = new Door();
//    pd.name = "Passenger";
//    pd.printStatus();
//    pd.open();
//    pd.printStatus();
//
//
//}
//public static void main(String[] args) {
//    Rectangle r1 = new Rectangle(7,9);
//    Rectangle r2 = new Rectangle(8,4);
//
//
//
//}
//public static void main(String[] args) {
////    String[] sa = new String[5];  THE PROBLEM WITH THESE IS YOU HAVE TO PRE-DETERMINE THE ARRAY LIST
//    // WHICH IS NOT ALWAYS POSSIBLE.  ALWAYS USE ARRAYLISTS
//
//    ArrayList<String> sal = new ArrayList<String>();
//    sal.add("toaster");
//    sal.add("fridge");
//    sal.add("microwave");
//    sal.indexOf("fridge");
//    sal.get(1);
//    System.out.println(sal.get(1)); //prints the specific index of the arraylist
//    System.out.println(sal.size()); //prints the size of the arraylist
//}
//public static void main(String[] args) {
//    //Composition = "Has a" relationship.
//    //Human HAS A brain
//    //House HAS A(n) address
//    Student student = new Student();
//    student.setName("Joe Bloggs");
//    student.setDateOfBirth("01/15/1986");
//    student.setStudentHousing(true);
//    student.setCourse(new Course());
//    student.getCourse().setTitle("Computer Science");
//    student.getCourse().setLevel("Undergraduate");
//    student.getCourse().setStartDate("05/01/2021");
//
//    System.out.println("Name: " + student.getName());
//    System.out.println("DoB: " + student.getDateOfBirth());
//    System.out.println("Housing: " + (student.hasStudentHousing() ? "yes" : "no"));
//
//}
//
//}

    public static void main(String[] args) {
        whichSeason(Month.August);
        whichSeason(Month.November);
        whichSeason(Month.January);
        whichSeason(Month.March);

    }
    public static void whichSeason(Month month){
        switch (month){
            case December:
            case January:
            case February:
                System.out.printf("%s is in the winter. \n", month);
                break;
            case March:
            case April:
            case May:
                System.out.printf("%s is in the spring \n", month);
                break;
            case June:
            case July:
            case August:
                System.out.printf("%s is in the summer \n", month);
                break;
            case September:
            case October:
            case November:
                System.out.printf("%s is in the Autumn\n", month);
                break;
            default:
                System.out.println("Invalid Month");

    }
//    public static void whichSeason(int month){
//        switch (month){
//            case 1:
//                System.out.println("January is in Winter");
//                break;
//            case 2:
//                System.out.println("February is in Winter");
//                break;
//            case 3:
//                System.out.println("March is in Spring");
//                break;
//            case 4:
//                System.out.println("April is in Spring");
//                break;
//            case 5:
//                System.out.println("May is in Spring");
//                break;
//            case 6:
//                System.out.println("June is in the Summer");
//                break;
//            case 7:
//                System.out.println("July is in Summer");
//                break;
//            case 8:
//                System.out.println("August is in Summer");
//                break;
//            case 9:
//                System.out.println("September is in Autumn");
//                break;
//            case 10:
//                System.out.println("October is in Autumn");
//                break;
//            case 11:
//                System.out.println("November is in Autumn");
//                break;
//            case 12:
//                System.out.println("December is in Winter");
//                break;
//            default:
//                System.out.println("Invalid Month");
//        }

    }
}
