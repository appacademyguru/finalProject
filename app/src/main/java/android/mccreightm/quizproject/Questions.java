package android.mccreightm.quizproject;

import java.util.Random;

public class Questions {
    private static Questions questions;
    private String[] inquiries;

    private Questions() {
        inquiries = new String[]{
                "Ana is Awesome",
                "Moises likes to screw with us",
                "We will all finish this final"
        };
    }

    public static Questions get() {
        if(questions == null){
            questions = new Questions();
        }
        return questions;
    }

    public String getQuestion(int i){

        return inquiries[i];
    }
}
