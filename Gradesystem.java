public class GradeSystem {
    void checkGrade(int per) {
        if (per >= 90)
            System.out.println("Grade A");
        else if (per >= 80)
            System.out.println("Grade B");
        else if (per >= 70)
            System.out.println("Grade C");
        else if (per >= 60)
            System.out.println("Grade D");
        else if (per >= 50)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }

    public static void main(String[] args) {
        GradeSystem obj = new GradeSystem();
        obj.checkGrade(85);
    }
}
