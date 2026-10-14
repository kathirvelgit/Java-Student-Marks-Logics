public class Main {
    public static void main(String[] args) {

        int marks = 85;

        marks += 5;

        char grade;

        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        String result = (marks >= 50) ? "Pass" : "Fail";

        String remark;

        switch (grade) {
            case 'A':
                remark = "Excellent!";
                break;
            case 'B':
                remark = "Good";
                break;
            case 'C':
                remark = "Average";
                break;
            default:
                remark = "Needs Improvement";
        }

        System.out.println("Marks : " + marks);
        System.out.println("Grade : " + grade);
        System.out.println("Result : " + result);
        System.out.println("Remarks : " + remark);

    }
}
