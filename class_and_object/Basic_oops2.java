class Pen {
    String color;
    String type;

    public void write(){
        System.out.print("write something");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
}

public class Basic_oops2 {
        
    public static void main(String args []){
         Pen pen1 = new Pen();
         pen1.color = "red";
         pen1.type = "gel";

         Pen pen2 = new Pen();
         pen2.color = "blue";
         pen2.type = "gel";

         pen1.printcolor();
         pen2.printcolor();

    }
}
