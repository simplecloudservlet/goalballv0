package br.edu.utfpr.goalballv0;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao1 = (Button) findViewById(R.id.botao1);
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(this.getClass(), "@string/botao_jogador1", Toast.LENGTH_SHORT).show();
                Context context = getApplicationContext();

                Toast.makeText(context, "@string/botao_jogador1", Toast.LENGTH_SHORT).show();
            }
        });

    }
}