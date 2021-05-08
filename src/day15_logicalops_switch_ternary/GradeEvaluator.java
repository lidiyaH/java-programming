package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'A';
        if(grade =='A' || grade == 'B' || grade == 'C') {
            System.out.println("pass. with grade - " + grade);
        } else if(grade == 'D') {
            System.out.println("qualify for retake. Grade - " + grade);
        }else if (grade == 'E') {
            System.out.println("Fail. grade - " + grade);
        }else {
            System.out.println("invalid grade");
        }
        }
        }

