import java.util.*;
 interface circle {
    public void area();
}
 interface rect {
    public void area1();
}
interface tri{
    public void area2();
}
class clac implements circle,rect,tri{
    public void area(){
        int r=6;
        int sum=2*(22/7)*r;
        System.out.println(sum);
    }
     public void area1(){
        int l=6;
        int b=6;
        int sum=l*b;;
        System.out.println(sum);
    }
     public void area2(){
        int b=6;
        int h=8;
        int sum=b*h;
        System.out.println(sum);
    }
}
public class interface1{
    public static void main(String []args){
        clac ob = new clac();
        ob.area();
        ob.area1();
        ob.area2();
    }
}
