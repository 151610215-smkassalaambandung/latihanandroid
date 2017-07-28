package assalaam.test.id.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button satu = (Button) findViewById(R.id.button1);
        satu.setOnClickListener(new View.OnClickListener() {

            public void onClick(View linear) {
                Intent myIntent = new Intent(linear.getContext(), Class1.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button dua = (Button) findViewById(R.id.button2);
        dua.setOnClickListener(new View.OnClickListener() {

            public void onClick(View rltv) {
                Intent myIntent = new Intent(rltv.getContext(), RelativeLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button tiga = (Button) findViewById(R.id.button3);
        tiga.setOnClickListener(new View.OnClickListener() {

            public void onClick(View af) {
                Intent myIntent = new Intent(af.getContext(), LinearLayoutSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button empat = (Button) findViewById(R.id.button4);
        empat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View dd) {
                Intent myIntent = new Intent(dd.getContext(), GambarAndroid.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button lima = (Button) findViewById(R.id.button5);
        lima.setOnClickListener(new View.OnClickListener() {

            public void onClick(View ll) {
                Intent myIntent = new Intent(ll.getContext(), LayoutTabel.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button enam = (Button) findViewById(R.id.button6);
        enam.setOnClickListener(new View.OnClickListener() {

            public void onClick(View er) {
                Intent myIntent = new Intent(er.getContext(), AutoCompleteSederhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}

