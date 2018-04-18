package com.ptp.phamtanphat.oop1903;

/**
 * Created by KhoaPhamPC on 16/4/2018.
 */

public class Cha {
    private String Ten;
    private int Tuoi;

    public Cha(String ten, int tuoi) {
        Ten = ten;
        setTuoi(tuoi);
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        if (tuoi <= 10){
            Tuoi = 30;
        }else{
            Tuoi = tuoi;
        }
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }
}
