package android.example.com.rezarizkiramadhan_1202144051_modul1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Reza Rizki Ramadhan on 04/02/2018.
 */

public class MainActivity extends AppCompatActivity{
}

    EditText dittextmenu, dittextjumlah;
    Button bteatbus;
    Button btabnormal;

    @Override
    protected void onCreat (Bundle saveInstanceState) {
        super. onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);

        dittextmenu = (EditText) findViewById(R.id.edittext_menu);
        dittextjumlah = (EditText) findViewById(R.id.edit_text);
        bteatbus = (Button) findViewById(R.id.button_eatbus);
        btabnormal = (Button) findViewById(R.id.button_abnormal);

        bteatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final  String nasiud =
                       dittextmenu.getText().toString();
                final String porsi1 =
                        dittextjumlah.getText().toString();
                int jumlah_integer =
                        Integer.parseInt(dittextjumlah.getText().toString());
                Intent (getApplicationContext(), activity2.class);
                Intent.putExtra ("nama_cafe","Eatbus");
                Intent.putExtra("nama_makanan", nasiud);
                Intent.putExtra("porsi", porsi1);

                jumlah_integer*50000;
                                startActivity(Intent.parseIntent());

            }
        });