package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MembuatCheckBox extends AppCompatActivity implements OnCheckedChangeListener{

    CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membuat_check_box);

        cb=(CheckBox)findViewById(R.id.activity_membuat_check_box);
        cb.setOnCheckedChangeListener(this);
    }

    public void onCheckedChanged(CompoundButton buttonView,
    boolean isChecked){
        if (isChecked){
            cb.setText("checkBox ini:Dicentang!");

        }
        else {
            cb.setText("checkBox ini:Tidak Dicentang!");
        }
    }
}
