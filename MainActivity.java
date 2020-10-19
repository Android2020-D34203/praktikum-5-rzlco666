package id.ac.id.telkomuniversity.tass.limasyahrizal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText usern, passw;
    Button btnLogin, btnForget;

    private String KEY_NAME = "NAMA";
    private String KEY_PASS = "PASSWORD";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usern = findViewById(R.id.user);
        passw = findViewById(R.id.pass);
        btnLogin = findViewById(R.id.login);
        btnForget = findViewById(R.id.forget);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = usern.getText().toString();
                    String sandi = passw.getText().toString();
                    if (nama.isEmpty()){
                        Toast.makeText(getApplication(), "Username tidak boleh kosong", Toast.LENGTH_SHORT).show();
                    } else {
                        if (sandi.isEmpty()){
                            Toast.makeText(getApplication(), "Password tidak boleh kosong", Toast.LENGTH_SHORT).show();
                        }else {
                            Intent i = new Intent(MainActivity.this, ActivityKedua.class);
                            i.putExtra(KEY_NAME, nama);
                            i.putExtra(KEY_PASS, sandi);
                            startActivity(i);
                        }
                    }
                } catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplication(), "Error!", Toast.LENGTH_SHORT);
                }
            }
        });

        btnForget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, ActivityKetiga.class);
                startActivity(i);
            }
        });
    }
}