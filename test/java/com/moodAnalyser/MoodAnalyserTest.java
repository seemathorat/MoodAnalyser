package com.moodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {

    @Test
    public void giveMessageReturnHappy() {
        MoodAnalyser mood=new MoodAnalyser(null);

        try {
            mood.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals("Please enter a right input",e.getMessage());
        }

    }
}





























