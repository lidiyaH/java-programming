package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length()==0);
        if (jobTitle.isEmpty()){
            System.out.println("job title is missing, please resend");
        }else {
            System.out.println("job title looks good");
        }
        if (jobTitle.length() == 0){
            System.out.println("job title is empty ");
        }else {
            System.out.println("job title is not empty");
        }
        System.out.println(jobTitle.equals(""));
        String veggie = "carrots";
        if (!veggie.isEmpty()){
            System.out.println("we have "+veggie);
        }
    }
}
