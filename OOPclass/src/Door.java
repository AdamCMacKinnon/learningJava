public class Door {
    String name;
    boolean isOpen;

    void open(){
        isOpen = true;
    }
    void close(){
        isOpen = false;
    }
    void printStatus(){
        if (isOpen){
            System.out.println(name + " door is open.");
        }
        else {
            System.out.println(name + " door is closed.");
        }
    }
}
