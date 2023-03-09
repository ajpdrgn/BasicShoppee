package com.example.midterms_final;

import android.widget.Toast;

public class Buttons {
    int count = 1;
    String text;

    public void addcount(){
        if(count>9){
            count = count;
        }
        else {
            count++;
            text = Integer.toString(count) + "x";
        }
    }

    public void minuscount(){
        if(count==0){
            count = 0;
            text = Integer.toString(count) + "x";
        }
        else {
            count--;
            text = Integer.toString(count) + "x";
        }
    }

    public String getText(){return text;}

    public int getCount(){return count;}
}

