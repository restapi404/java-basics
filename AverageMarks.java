public class AverageMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int totalSubjects = 3;
        double average = (maths+physics+chemistry) / totalSubjects;

        System.out.println("Sam's average mark in PCM is " + average);
    }
}