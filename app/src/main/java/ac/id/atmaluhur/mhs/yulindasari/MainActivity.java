package ac.id.atmaluhur.mhs.yulindasari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText nilai1;
    EditText nilai2;
    EditText nilai3;
    EditText nilai4;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nilai1 = (EditText) findViewById(R.id.nilai1);
        nilai2 = (EditText) findViewById(R.id.nilai2);
        nilai3 = (EditText) findViewById(R.id.nilai3);
        nilai4 = (EditText) findViewById(R.id.nilai4);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void hitung (View View){
        Integer a = Integer.parseInt(nilai1.getText().toString());
        Integer b = Integer.parseInt(nilai2.getText().toString());
        Integer c = Integer.parseInt(nilai3.getText().toString());
        Integer d = Integer.parseInt(nilai4.getText().toString());
        Integer e = a * 10/100 + b * 20/100 + c * 30/100 + d * 40/100;
        hasil.setText("HASIL NILAI AKHIR = "+e);
    }
}