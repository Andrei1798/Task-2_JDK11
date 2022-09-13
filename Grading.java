
public enum Grading {
    UNACCEPTABLE, ACCEPTABLE, BASIC, GOOD, VERY_GOOD;

    public Grading nextGrading(){
        Grading[] grades = Grading.values();int i;

        for (i = 0; i < grades.length-1; i++){
            if(grades[i] == this) {
                i++;
                break;
            }else if(i == grades.length-2) {
                i = 0;
                break;
            }
        }
        return grades[i];
    }
    public Grading previousGrading(){
        Grading[] grades = Grading.values();int i;
        for (i = grades.length-1; i > 0; i--){
            if(grades[i] == this){
                i--;
                break;
            }else if(i == 1) {
                i = grades.length-1;
                break;
            }
        }
        return grades[i];
    }


    public static void showAllGrades(){
        for (Grading grad : Grading.values()) {
            System.out.println(grad);
        }
    }
}
