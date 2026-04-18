// Single level inheritance
class shape{
   String color;
}

class Triangle extends shape{
     public void display(){
      System.out.println(this.color);
     }
}

public class Single_inheri {
   public static void main(String args[]){
      Triangle t1 = new Triangle();
      t1.color = "red";
      t1.display();
   }
}