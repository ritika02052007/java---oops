class Shape{
    public void show(){
        System.out.println("i am shape class");
    }
}

class Circle extends Shape{
    public void show(int r){
        System.out.println(3.14*r*r);
    }
}

class Animal{
    public void eat(){
        System.out.println("i am a base class of name animal");
    }
}

class Triangle extends Shape{
    public void show(int l ,int h){
        System.out.println((1*l*h)/2);
    }
}

public class Hybrid {
   public static void main (String args[]){
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle();
    Circle c1 = new Circle();
    // Circle c2 = new Circle();
    t1.show(3,4);
    t2.show();
    c1.show();
    c1.show(2);
   }   
}
