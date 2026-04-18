class Student{
    String name;
    int age;

Student(){
    System.out.println("constructor called");
}

public void display(String name,int age){
    System.out.println(this.name);
    System.out.println(this.age);
}
}

public class non_parameter {
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "rishi";
        s1.age = 23;
        s2.name = "kartik";
        s2.age = 34;
        s1.display(s1.name,s1.age);
        s2.display(s2.name,s2.age);
    }
    
}
