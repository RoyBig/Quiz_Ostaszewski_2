package com.example.quiz_ostaszewski;
public class Question {
    private int questionId;
    private boolean trueAnswer;
    public Question(int questionId, boolean trueAnswer)
    {
        this.questionId = questionId;
        this.trueAnswer = trueAnswer;
    }
    public int getQuestionId(Question question)
    {
        return question.questionId;
    }
    public boolean isTrueAnswer(Question question)
    {
        return question.trueAnswer;
    }
}
