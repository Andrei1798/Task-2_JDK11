public class Main {
    public static void main(String[] args) {
        Grading grad = Grading.UNACCEPTABLE;
        System.out.println(grad.previousGrading());//VERY_GOOD
        System.out.println(grad.nextGrading());//ACCEPTABLE
        Grading.showAllGrades();
    }
}