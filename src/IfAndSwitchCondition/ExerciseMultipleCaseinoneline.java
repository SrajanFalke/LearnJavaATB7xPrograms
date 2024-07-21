package IfAndSwitchCondition;

public class ExerciseMultipleCaseinoneline {
    public static void main(String[] args) {
        int days=8;
        switch (days){
            case 1,2,3:
                System.out.println("case for 1,2,3");
                break;
            case 4,5,6:
                System.out.println("case for 4,5,6");
                break;
            default:
                System.out.println("Not here");
                break;

        }

    }
}
