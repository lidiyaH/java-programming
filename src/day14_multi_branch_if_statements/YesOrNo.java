package day14_multi_branch_if_statements;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        char answer = 'y';
        boolean y = true;
        if (y == true) {
            System.out.println("your file will be deleted");
        } else {
            System.out.println("File deletion cancelled!");
            y = false;
            System.out.println( "not deleted");
        }
    }
}
