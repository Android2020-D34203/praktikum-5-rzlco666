package id.ac.id.telkomuniversity.tass.limasyahrizal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityKedua extends AppCompatActivity {

    TextView userna, passwo;
    private String nama,sandi;
    private String KEY_NAME = "NAMA";
    private String KEY_PASS = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kedua);

        userna = findViewById(R.id.txtUser);
        passwo = findViewById(R.id.txtPass);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        userna.setText("Username : " + nama);

        sandi = extras.getString(KEY_PASS);
        passwo.setText("Password : " + sandi);

    }
}