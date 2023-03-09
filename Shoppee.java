package com.example.midterms_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Shoppee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoppee);

        Button BB_lessbut = (Button) findViewById(R.id.BB_lessbut);
        TextView BB_piece = (TextView) findViewById(R.id.BB_piece);
        Button BB_morebut = (Button) findViewById(R.id.BB_morebut);
        Buttons BB_but = new Buttons();

        Button SO_lessbut = (Button) findViewById(R.id.SO_lessbut);
        TextView SO_piece = (TextView) findViewById(R.id.SO_piece);
        Button SO_morebut = (Button) findViewById(R.id.SO_morebut);
        Buttons SO_but = new Buttons();

        Button PO_lessbut = (Button) findViewById(R.id.PO_lessbut);
        TextView PO_piece = (TextView) findViewById(R.id.PO_piece);
        Button PO_morebut = (Button) findViewById(R.id.PO_morebut);
        Buttons PO_but = new Buttons();

        Button SEG_lessbut = (Button) findViewById(R.id.SEG_lessbut);
        TextView SEG_piece = (TextView) findViewById(R.id.SEG_piece);
        Button SEG_morebut = (Button) findViewById(R.id.SEG_morebut);
        Buttons SEG_but = new Buttons();

        Button MG_lessbut = (Button) findViewById(R.id.MG_lessbut);
        TextView MG_piece = (TextView) findViewById(R.id.MG_piece);
        Button MG_morebut = (Button) findViewById(R.id.MG_morebut);
        Buttons MG_but = new Buttons();

        Button Checkout = (Button) findViewById(R.id.checkout);

        BB_lessbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BB_but.minuscount();
                BB_piece.setText(BB_but.getText());
            }
        });

        BB_morebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BB_but.addcount();
                BB_piece.setText(BB_but.getText());
            }
        });

        SO_lessbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SO_but.minuscount();
                SO_piece.setText(SO_but.getText());
            }
        });

        SO_morebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SO_but.addcount();
                SO_piece.setText(SO_but.getText());
            }
        });

        PO_lessbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PO_but.minuscount();
                PO_piece.setText(PO_but.getText());
            }
        });

        PO_morebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PO_but.addcount();
                PO_piece.setText(PO_but.getText());
            }
        });

        SEG_lessbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SEG_but.minuscount();
                SEG_piece.setText(SEG_but.getText());
            }
        });

        SEG_morebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SEG_but.addcount();
                SEG_piece.setText(SEG_but.getText());
            }
        });

        MG_lessbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MG_but.minuscount();
                MG_piece.setText(MG_but.getText());
            }
        });

        MG_morebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MG_but.addcount();
                MG_piece.setText(MG_but.getText());
            }
        });

        Checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nextReceipt = new Intent(Shoppee.this, Receipt.class);
                Bundle count = new Bundle();
                count.putInt("BB_count", BB_but.getCount());
                count.putInt("SO_count", SO_but.getCount());
                count.putInt("PO_count", PO_but.getCount());
                count.putInt("SEG_count", SEG_but.getCount());
                count.putInt("MG_count", MG_but.getCount());
                nextReceipt.putExtras(count);
                startActivity(nextReceipt);
            }
        });
    }
}
