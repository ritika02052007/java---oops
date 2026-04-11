class Student{
    String name;
    int age;

    Student(){
        System.out.println("constructor called !!!");
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void write(){
        System.out.println("name : " + this.name);
        System.out.println("age :" + this.age );
    }
}


public class Basic {

    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("aman" ,23);

        s1.name = "aakash";
        s1.age = 23;

        s1.write();
        s2.write();
    }
    
}
