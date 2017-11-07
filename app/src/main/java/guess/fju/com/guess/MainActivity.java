package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = (Button) findViewById(R.id.b_send);

        bSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                int random = (int) (Math.random() * 10 + 1);
                int random = 5;
                if (R.id.ed_number < random) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("大一點")
                            .show();
                }
                if (R.id.ed_number > random) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("小一點")
                            .show();
                }
                if (R.id.ed_number == random) {
                    new AlertDialog.Builder(MainActivity.this)
                            .setMessage("猜對了")
                            .show();
                }
            }
            });
        }}