class Pen {
    String color;
    String type;
  
     public void write(){
        System.out.println("Write something");
     }
}

public class Basic_oops{
   public static void main(String args[]){
      Pen p1 = new Pen();
      Pen p2 = new Pen();
      p1.color = "blue";
      p1.type = "gel";
      p2.color = "black";
      p2.type  = "ball";

      p1.write();
      p2.write();
   }
}

