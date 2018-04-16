package com.ptp.phamtanphat.oop1903;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by KhoaPhamPC on 16/4/2018.
 */

public abstract class Dichoi {
     void lucdi(Context context){
         Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
     };
     public abstract void lucve();
}
