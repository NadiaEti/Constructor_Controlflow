package constructor;

public class Constructor {

public Constructor(){
    System.out.println("This is Default constructor");
}

int id = 20;
String name = "Nadia";
String address = "Bangladesh";
double salary = 50000.00;

public Constructor(int id, String name){
this.id = id;
this.name = name;
    System.out.println( id +" " +name);
    //System.out.println(name);
}
public Constructor(int id, String name, double salary){
    this.id= id;
    this.name = name;
    this.salary = salary;
    System.out.println("Student's id is: " + id + " Name " + name + " Student's part time Salary= " + salary );

}
    public static void main(String[] args) {
        Constructor A = new Constructor();
        Constructor AB = new Constructor(10,"Nadia");
        Constructor XY = new Constructor(50,"Eti", 35000);
    }
}

