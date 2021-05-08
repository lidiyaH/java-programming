package day23_string_manipulation_while_loop;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "sender: [Nadir] From Number<+1(222) 333-4444> Message:{Hello, lets code some java}";
        int a = message.indexOf("[");
        int b = message.indexOf("]");
        System.out.println(message.substring(a+1, b));
        String sender= message.substring(a+1,b);
        System.out.println("sender = " + sender);
        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        System.out.println(text);
        sender = sender.trim();
        if (sender.equals("Nadir")){
            System.out.println("Message from Nadir about homrwork");
        }else {
            System.out.println("someone else message");
        }

    }
}
