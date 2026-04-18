class shape{
    public void area(){
        System.out.println("display area");
    }
}

class Triangle extends shape{
    public void area(int l, int h){
        System.out.println((1*l*h)/2);
    }
}
public class multi_level {
  public static void main(String args[]){
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle();
    t1.area();
    t2.area(3,4);
  }   
}
