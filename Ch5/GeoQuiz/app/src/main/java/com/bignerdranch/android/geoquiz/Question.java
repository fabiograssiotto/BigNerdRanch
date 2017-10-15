package com.bignerdranch.android.geoquiz;

/**
 * Created by fabiogr on 10/12/2017.
 */

public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mCheated;

    public Question(int textResIdId, boolean answerTrue, boolean cheated) {
        mTextResId = textResIdId;
        mAnswerTrue = answerTrue;
        mCheated = cheated;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setCheated(boolean cheated) {
        mCheated = cheated;
    }

    public boolean isCheated() {
        return mCheated;
    }
}
