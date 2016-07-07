package br.ufla.lavrasinforma;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnRelatarProblema = (Button) findViewById(R.id.btnRelatarProblema);
        Button btnMeusRelatos = (Button) findViewById(R.id.btnMeusRelatos);
        Button btnTodosRelatos = (Button) findViewById(R.id.btnTodosRelatos);
        Button btnMapaRelatos = (Button) findViewById(R.id.btnMapaRelatos);
        Button btnLogout = (Button) findViewById(R.id.btnLogout);
    }

    public void logout(View view) {
        Intent logout = new Intent(this, MainActivity.class);
        startActivity(logout);
        finish();
    }
}
