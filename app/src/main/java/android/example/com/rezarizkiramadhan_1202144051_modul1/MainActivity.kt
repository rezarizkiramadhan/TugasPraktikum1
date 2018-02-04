package android.example.com.rezarizkiramadhan_1202144051_modul1

import android.content.Intent;
import android.example.com.rezarizkiramadhan_1202144051_modul1.R.id.nasiud
import android.example.com.rezarizkiramadhan_1202144051_modul1.R.id.porsi1
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat.startActivity
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edtextmenu, edtextjumlah;
    Button bteatbus;
    Button btabnormal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtextmenu = (EditText) findViewById(R.id.edittextmenu);
        edtextjumlah = (EditText) findViewById(R.id.edittextjumlah);
        bteatbus =  (Button) findViewById(R.id.buttoneatbus);
        btabnormal =  (Button) findViewById(R.id.buttonabnormal);

        bteatbus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                final String nasiud = edtextmenu.getText().toString();
                final String porsi1 = edtextjumlah.getText().toString();
                int jumlah_integer = Integer.parseInt(edtextjumlah.getText().toString());
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                intent.putExtra("nama_restoran", "Eatbus");
                intent.putExtra("nama_makanan", nasiud);
                intent.putExtra("porsi", porsi1);
                intent.putExtra("total_harga", jumlah_integer*50000);
                startActivity(intent);

            }

        };

        btabnormal.setOnClickListener(View) {

            final String nasiud1 = edtextmenu.getText().toString();
            final String porsi2 = edtextjumlah.getText().toString();
            int jumlah_integer = Integer.parseInt(edtextjumlah.getText(),toString());
            Intent a = new Intent(getApplicationContext(), Activity2.class);
            a.putExtra("nama_restoran", "Abnormal");
            a.putExtra("nama_makanan", nasiud1);
            a.putExtra("porsi", porsi2);
            a.putExtra("total_harga", jumlah_integer*30000);
            startActivity(a);
        }
    } ;
}

