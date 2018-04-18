package com.ptp.phamtanphat.oop1903;

/**
 * Created by KhoaPhamPC on 16/4/2018.
 */

public class LopCon{
    private int Quequan;
    private String TrinhDo;

    public LopCon(int quequan, String trinhDo) {
        Quequan = quequan;
        setTrinhDo(trinhDo);
    }

    public String getQuequan() {
        return  "Quan" + Quequan;
    }

    public void setQuequan(int quequan) {
        Quequan = quequan;
    }

    public String getTrinhDo() {
        return TrinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        int tuoi = Integer.parseInt(trinhDo);
        if (tuoi < 6 && tuoi>0){
            TrinhDo = "Mam non";
        }else if (tuoi >5 && tuoi <12){
            TrinhDo = "Hoc Cap 1";
        }
        else if(tuoi < 17 && tuoi>11){
            TrinhDo = "Hoc cap 2";
        }else if (tuoi >=17){
            TrinhDo = "Di lam";
        }

    }
}
