class Shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((1*l*h)/2);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}

public class hierarchical {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        t1.area();
        t2.area(3,4);
        c1.area();
        c2.area(3);
    }    
}
