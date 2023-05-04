package designpattern;

public class LazySingleTon {
    private static LazySingleTon l = null;
    private LazySingleTon(){};
    public static LazySingleTon getInstance(){
        if(l == null){
            l = new LazySingleTon();
        }
        return l;
    }
}
class Main{
    public static void main(String[] args) {
        LazySingleTon l1 = LazySingleTon.getInstance();
        System.out.println(l1.hashCode());
        LazySingleTon l2 = LazySingleTon.getInstance();
        System.out.println(l2.hashCode());

    }
}
