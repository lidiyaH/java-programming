package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting: world's smallest cat -BBC");
        int secods=0;
        while (secods<=117) {
            System.out.println("Watching at second" + secods);
            secods++;
            Thread.sleep(1000);//pause the code excution for a 1000 milliseconds
        }
        System.out.println("finished watching ");
        System.out.println("start another one");


    }
}
