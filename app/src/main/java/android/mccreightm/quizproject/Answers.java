package android.mccreightm.quizproject;

public class Answers {
    private static Answers answers;
    private String[] solutions;

    private Answers() {
        solutions = new String[]{
                "False",
                "True",
                "False"
        };
    }

    public static Answers get() {
        if(answers == null){
            answers = new Answers();
        }
        return answers;
    }

    public String getAnswer(int i){
        return solutions[i];
    }
}
