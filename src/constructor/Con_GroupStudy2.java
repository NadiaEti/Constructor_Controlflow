package constructor;

public class Con_GroupStudy2 {
String name = "Motiur";
int age = 300;
String address = "Queens";


public Con_GroupStudy2(String name){
    this.name = name;
    System.out.println(this.name);
}

public Con_GroupStudy2(String name,int age, String address){    //multiple parameter
    this.name = name;
    this.age = age;
    this.address = address;
    System.out.println("My name is "+ this.name+" "+ "age is " +this.age );
    System.out.println("I leave in " + this.address);
    }
    public Con_GroupStudy2(String name, String address,int age) {    // Signature pattern
    this.name = name;
    this.address = address;
    this.age = age;
    System.out.println(this.name);
    System.out.println(this.address);
    System.out.println(this.age);
    }
    public static void main(String[] args) {
        Con_GroupStudy2 abc = new Con_GroupStudy2("Husna");
        Con_GroupStudy2 xyz = new Con_GroupStudy2("Jemy",21, "queens");
        xyz.address = "USA";
        System.out.println(xyz.address);
        Con_GroupStudy2 Nibeen = new Con_GroupStudy2("Raya","Bangladesh", 20);
    }
}
