package com.example.user_pc.namelistview;

/**
 * Created by USER-pC on 01/09/17.
 */

public class person {
    private String mName;
    private  String mCell;

    public person() {

    }

    public person(String mName, String mCell) {

        this.mName = mName;
        this.mCell = mCell;
    }
    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmCell(String mCell) {
        this.mCell = mCell;
    }

    public String getmName() {
        return mName;
    }

    public String getmCell() {
        return mCell;
    }

}


