package day38_methods;

public class MethodcallAnother {
    public static void main(String[] args) {
        prints();
        nums(1);

    }
    public static void prints() {
        System.out.println("start");
        continues();
    }
    public static void continues() {
        System.out.println("continue");
        end();
    }
    public static void end() {
        System.out.println("end");
    }
    public static void nums(int Num){
        System.out.print(Num+" ");
        Num++;
        if(Num<=100) {
            nums(Num);
        }

    }
}
