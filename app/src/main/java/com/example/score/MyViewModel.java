package com.example.score;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    public void undo(){
        scoreA.setValue(aback);
        scoreB.setValue(bback);
    }

    public void clear(){
        scoreA.setValue(0);
        scoreB.setValue(0);
    }

    public void addtoA(int n){
        aback = scoreA.getValue();
        bback = scoreB.getValue();
        scoreA.setValue(scoreA.getValue()+n);
    }

    public void addtoB(int n){
        aback = scoreA.getValue();
        bback = scoreB.getValue();
        scoreB.setValue(scoreB.getValue()+n);
    }

    public MutableLiveData<Integer> getScoreA() {
        if (scoreA == null){
            scoreA = new MutableLiveData<>();
            scoreA.setValue(0);
        }
        return scoreA;
    }

    public MutableLiveData<Integer> getScoreB() {
        if (scoreB == null){
            scoreB = new MutableLiveData<>();
            scoreB.setValue(0);
        }
        return scoreB;
    }

    private MutableLiveData<Integer> scoreA;
    private MutableLiveData<Integer> scoreB;
    private int aback;
    private int bback;


}
