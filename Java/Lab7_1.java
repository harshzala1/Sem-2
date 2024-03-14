abstract class Vegetable{
    String color;
    String vegetablename;
    Vegetable(String color,String vegetablename){
    this.color=color;
    this.vegetablename=vegetablename;
    }
    public String toString(){
        return(color + " " + vegetablename);
    }
}
class Potato extends Vegetable{
    Potato(String color){
        super(color,"Potato");
    }

}
class Brinjal extends Vegetable{
    Brinjal(String color){
        super(color,"Brinjal");
    }

}
class Tomato extends Vegetable{
    Tomato(String color){
        super(color,"Tomato");
    }
}
public class Lab7_1 {
    public static void main(String[] args) {
        Potato P = new Potato("Yellowish Brown");
        Brinjal B = new Brinjal("Purple");
        Tomato T = new Tomato("Red");
    
    System.out.println(P.toString());
    System.out.println(B.toString());
    System.out.println(T.toString());
    }
}
