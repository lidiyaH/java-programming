package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0]= "AD1234";
        student1[1]= "Adam";
        student1[2]= "Smith";
        student1[3]= "B22";
        student1[4]= "202-543-1234";
        String[] student2 ={"MK4421","Mike","Bloomberg","B22", "703-432-1234"};
        System.out.println("student1 id =" + student1[0]);
        System.out.println("student firstname "+ student1[1]);
        System.out.println("student lastname= "+ student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student mobile num= "+ student1[4]);
        System.out.println("student2 id = " + student2[0]);
        System.out.println("student2 firstname "+ student2[1]);
        System.out.println("student2 lastname= "+ student2[2]);
        System.out.println("student12 batch num = " + student2[3]);
        System.out.println("student2 mobile num= "+ student2[4]);
        System.out.println("student data length: "+ student1.length);
        if (student1.length== 5) {
            System.out.println("true:pass data array has correct length");
        }else{
            System.out.println("false:fail");
        }
        if (student1.length==student2.length) {
            System.out.println("true:pass they are equal");
        } else {
            System.out.println("false:fail they are not equal.");
        }
        System.out.println((student1[1] + " " + student1[2]).toUpperCase());
        String mobilenum = student1[4];
        System.out.println(mobilenum.length());
        System.out.println(mobilenum.startsWith("202"));

    }
}
