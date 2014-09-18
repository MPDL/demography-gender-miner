package de.mpg.mpdl.minig.demography.gender;


/**
 * Created by vlad on 9/17/14.
 */
// json = "{\"name\":\"peter\",\"gender\":\"male\",\"probability\":\"0.99\",\"count\":796}";

public class Person {

    public enum Gender { male, female };

    private String name;


    private Gender gender;

    private float probability;


    private int count;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getProbability() {
        return probability;
    }

    public void setProbability(float probability) {
        this.probability = probability;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
