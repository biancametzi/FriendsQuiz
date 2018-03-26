package com.example.android.friendsquiz;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit(View view) {

        int score = 0;
        int scoreGranularity = 10;

        //Check answer for each question
        //First question

        RadioButton firstQuestionFirstRadioButton = (RadioButton) findViewById(R.id.first_question_first_answer);
        boolean hasFirstQuestionRadioButton = firstQuestionFirstRadioButton.isChecked();

        if (hasFirstQuestionRadioButton) {
            score += scoreGranularity;
        }

        //Second question
        EditText secondQuestion = (EditText) findViewById(R.id.second_question_answer);
        String secondQuestionAnswer = secondQuestion.getText().toString();

        String correctAnswerSecondQuestion = getString(R.string.second_question_answer);

        if (correctAnswerSecondQuestion.equals(secondQuestionAnswer)) {
            score += scoreGranularity;
        }

        //Third question
        CheckBox thirdQuestionFirstCheckbox = (CheckBox) findViewById(R.id.third_question_first_answer);
        boolean hasThirdQuestionFirstCheckbox = thirdQuestionFirstCheckbox.isChecked();

        CheckBox thirdQuestionSecondCheckbox = (CheckBox) findViewById(R.id.third_question_second_answer);
        boolean hasThirdQuestionSecondCheckbox = thirdQuestionSecondCheckbox.isChecked();

        CheckBox thirdQuestionThirdCheckbox = (CheckBox) findViewById(R.id.third_question_third_answer);
        boolean hasThirdQuestionThirdCheckbox = thirdQuestionThirdCheckbox.isChecked();

        if (hasThirdQuestionFirstCheckbox && hasThirdQuestionThirdCheckbox && !hasThirdQuestionSecondCheckbox) {
            score += scoreGranularity;
        } else {
            score += 0;
            }


        //Fourth question
        RadioButton fourthQuestionThirdRadioButton = (RadioButton) findViewById(R.id.fourth_question_third_answer);
        boolean hasFourthQuestionRadioButton = fourthQuestionThirdRadioButton.isChecked();

        if (hasFourthQuestionRadioButton) {
            score += scoreGranularity;
        }

        //Fifth question
        RadioButton fifthQuestionFirstRadioButton = (RadioButton) findViewById(R.id.fifth_question_first_answer);
        boolean hasFifthQuestionRadioButton = fifthQuestionFirstRadioButton.isChecked();

        if (hasFifthQuestionRadioButton) {
            score += scoreGranularity;
        }

        //Sixth question
        CheckBox sixthQuestionFirstCheckBox = (CheckBox) findViewById(R.id.sixth_question_first_answer);
        boolean hasSixthQuestionFirstCheckBox = sixthQuestionFirstCheckBox.isChecked();

        CheckBox sixthQuestionSecondCheckBox = (CheckBox) findViewById(R.id.sixth_question_second_answer);
        boolean hasSixthQuestionSecondCheckBox = sixthQuestionSecondCheckBox.isChecked();

        CheckBox sixthQuestionThirdCheckBox = (CheckBox) findViewById(R.id.sixth_question_third_answer);
        boolean hasSixthQuestionThirdCheckBox = sixthQuestionThirdCheckBox.isChecked();

        if (hasSixthQuestionFirstCheckBox && hasSixthQuestionSecondCheckBox && hasSixthQuestionThirdCheckBox) {
            score += scoreGranularity;
        } else {
            score += 0;
        }

        //Seventh question
        RadioButton seventhQuestionThirdRadioButton = (RadioButton) findViewById(R.id.seventh_question_third_answer);
        boolean hasSeventhQuestionRadioButton = seventhQuestionThirdRadioButton.isChecked();

        if (hasSeventhQuestionRadioButton) {
            score += scoreGranularity;
        }

        //Eight question
        EditText eightQuestion = (EditText) findViewById(R.id.eight_question_answer);
        String eightQuestionAnswer = eightQuestion.getText().toString();

        String correctAnswerEightQuestion = getString(R.string.eight_question_answer);

        if (correctAnswerEightQuestion.equals(eightQuestionAnswer)) {
            score += scoreGranularity;
        }

        //Ninth question
        RadioButton ninthQuestionThirdRadioButton = (RadioButton) findViewById(R.id.ninth_question_third_answer);
        boolean hasNinthQuestionRadioButton = ninthQuestionThirdRadioButton.isChecked();

        if (hasNinthQuestionRadioButton) {
            score += scoreGranularity;
        }

        //Tenth question
        RadioButton tenthQuestionThirdRadioButton = (RadioButton) findViewById(R.id.tenth_question_second_answer);
        boolean hasTenthQuestionRadioButton = tenthQuestionThirdRadioButton.isChecked();

        if (hasTenthQuestionRadioButton) {
            score += scoreGranularity;
        }

        Toast.makeText(this, "You're score is: " + score, Toast.LENGTH_SHORT).show();
    }


}


