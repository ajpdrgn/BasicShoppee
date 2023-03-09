package com.example.midterms_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Receipt extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);
        TextView BB_piece = (TextView) findViewById(R.id.BB_piece2);
        TextView BB_pp = (TextView) findViewById(R.id.BB_pp);
        TextView SO_piece = (TextView) findViewById(R.id.SO_piece2);
        TextView SO_pp = (TextView) findViewById(R.id.SO_pp);
        TextView PO_piece = (TextView) findViewById(R.id.PO_piece2);
        TextView PO_pp = (TextView) findViewById(R.id.PO_pp);
        TextView SEG_piece = (TextView) findViewById(R.id.SEG_piece2);
        TextView SEG_pp = (TextView) findViewById(R.id.SEG_pp);
        TextView MG_piece = (TextView) findViewById(R.id.MG_piece2);
        TextView MG_pp = (TextView) findViewById(R.id.MG_pp);
        TextView Total = (TextView) findViewById(R.id.Total_Price);
        Bundle data = getIntent().getExtras();
        int BB_count = data.getInt("BB_count");
        int SO_count = data.getInt("SO_count");
        int PO_count = data.getInt("PO_count");
        int SEG_count = data.getInt("SEG_count");
        int MG_count = data.getInt("MG_count");

        Total calc = new Total();
        calc.setBB_count(BB_count);
        calc.setSO_count(SO_count);
        calc.setPO_count(PO_count);
        calc.setSEG_count(SEG_count);
        calc.setMG_count(MG_count);

        BB_pp.setText("P"+calc.getBB_Total());
        BB_piece.setText(BB_count+"x");
        SO_pp.setText("P"+calc.getSO_Total());
        SO_piece.setText(SO_count+"x");
        PO_pp.setText("P"+calc.getPO_Total());
        PO_piece.setText(PO_count+"x");
        SEG_pp.setText("P"+calc.getSEG_Total());
        SEG_piece.setText(SEG_count+"x");
        MG_pp.setText("P"+calc.getMG_Total());
        MG_piece.setText(MG_count+"x");
        Total.setText("P"+calc.get_Total());
    }
}