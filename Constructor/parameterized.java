class Student{
    String name;
    int age;

    Student(String name ,int age){
        this.name = name;
        this.age= age;
    }

    public void display(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class parameterized {
     public static void main(String args[]){
        Student s1= new Student("aman",34);
        Student s2 = new Student("ram",32);
        s1.display();
        s2.display();
     }
     
}
