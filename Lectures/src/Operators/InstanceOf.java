package Operators;

public class InstanceOf {
    public static void main(String[] args) {
        School ZPHS = new School("Government", 53117,"vizag");
        System.out.println("ZPHS is instanceof School : "+(ZPHS instanceof School));
    }
}
class School {
    String name;
    int pincode;
    String village;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    School(String name, int pincode, String village){
        this.name = name;
        this.pincode = pincode;
        this.village = village;
    }
}
