package com.furkanturkmen.numberstrivia.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RandomFact {
    @SerializedName("number")
    @Expose
    public Integer randomNumber;

    @SerializedName("text")
    @Expose
    public String descriptiveText;

    public Integer getRandomNumber() {
        return randomNumber;
    }

    public void setRandomNumber(Integer randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String getDescriptiveText() {
        return descriptiveText;
    }

    public void setDescriptiveText(String descriptiveText) {
        this.descriptiveText = descriptiveText;
    }
}

