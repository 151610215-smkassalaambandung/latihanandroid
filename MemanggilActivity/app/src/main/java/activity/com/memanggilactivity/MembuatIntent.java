package activity.com.memanggilactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MembuatIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membuat_intent);

        Button next=(Button)findViewById(R.id.Button01);
        next.setOnClickListener(new View.OnClickListener(){

            public void onClick(View bebek) {
                Intent myIntent = new
                        Intent(bebek.getContext(), MembuatIntent.class);
                startActivityForResult(myIntent, 0);

            }
        }

        );
    }
}
