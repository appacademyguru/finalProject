package android.mccreightm.quizproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizActivity extends Activity {
    private TextView questionText;
    private int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        questionText = (TextView) findViewById(R.id.questionText);

        i = 0;
            questionText.setText(Questions.get().getQuestion(i));
            final Button trueButton = (Button) findViewById(R.id.trueButton);
            trueButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        questionText.setText(Questions.get().getQuestion(i++));
                    if (Answers.get().getAnswer(i) == "False") {
                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
                    } else {
                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
                    }
                }
            });

            final Button falseButton = (Button) findViewById(R.id.falseButton);
            falseButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                        questionText.setText(Questions.get().getQuestion(i++));
                    if (Answers.get().getAnswer(i) == "False") {
                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT);
                    } else {
                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT);
                    }
                }
            });
        }


    @Override
    protected void onResume() {
        super.onResume();

    }
}
