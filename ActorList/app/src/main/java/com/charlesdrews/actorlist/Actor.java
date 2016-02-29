package com.charlesdrews.actorlist;

/**
 * Created by charlie on 2/29/16.
 */
public class Actor {
    private String mName;
    private String mDob;
    private int mOscarsWon;

    public Actor(String name, String dob, int oscarsWon) {
        mName = name;
        mDob = dob;
        mOscarsWon = oscarsWon;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDob() {
        return mDob;
    }

    public void setDob(String dob) {
        this.mDob = dob;
    }

    public int getOscarsWon() {
        return mOscarsWon;
    }

    public void setOscarsWon(int oscarsWon) {
        this.mOscarsWon = oscarsWon;
    }
}
