interface i1{
    void add(int x,int y);
}
interface i2{
    void mul(int x,int y);
}
interface i3{
    void sub(int x,int y);
}
class a implements i1,i2,i3{
    public void add(int x,int y){
        int z=x+y;
        System.out.println(z);
    }
    public void mul(int x,int y){
        int z=x*y;
        System.out.println(z);
    }
     public void sub(int x,int y){
        int z=x-y;
        System.out.println(z);
    }
    public static void main(String args[]){
       
        new a().add(5,5);
        new a().mul(15,7);
        new a().sub(8,5);
    }
}
