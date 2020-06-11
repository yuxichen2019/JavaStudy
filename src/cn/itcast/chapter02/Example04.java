package cn.itcast.chapter02;

public class Example04 {
    public static void main(String[] args) {
        int x = 12;
        {
            int y = 96;
            System.out.println("x= "+x);
            System.out.println("y= "+y);
        }
        //y=x;    会报找不到变量y   ，因为y的作用域在上面{}里面。
        System.out.println("x= "+x);
    }
}
