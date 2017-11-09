package guess.fju.com.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran = new Random();
    int r = ran.nextInt(9)+1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bSend = (Button) findViewById(R.id.b_send);

        bSend.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) { EditText edNumber = (EditText)findViewById(R.id.ed_number);
                int n = Integer.parseInt(edNumber.getText().toString());
                if(n<r){
                    Toast.makeText(MainActivity.this, "大一點", Toast.LENGTH_SHORT).show();
                }
                if(n>r){
                    Toast.makeText(MainActivity.this, "小一點", Toast.LENGTH_SHORT).show();
                }
                if(n==r){
                    Toast.makeText(MainActivity.this, "對了", Toast.LENGTH_SHORT).show();
                }

//                if (n < r) {
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setMessage("大一點")
//                            .show();
//                }
//                if (n > r) {
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setMessage("小一點")
//                            .show();
//                }
//                if (n == r) {
//                    new AlertDialog.Builder(MainActivity.this)
//                            .setMessage("猜對了")
//                            .show();
//                }
            }
            });
        }}