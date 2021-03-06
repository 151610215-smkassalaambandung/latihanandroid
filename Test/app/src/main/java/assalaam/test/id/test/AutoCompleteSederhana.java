package assalaam.test.id.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AutoCompleteSederhana extends AppCompatActivity implements TextWatcher{

    TextView hasil;
    AutoCompleteTextView edit;
    String[]item ={"Merbabu","Mepati","Lawu","Rinjani","Sumbing","Sindoro","Krakatau","Cilisung"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_sederhana);

        hasil=(TextView)findViewById(R.id.hasil);
        edit =(AutoCompleteTextView) findViewById(R.id.edit);
        edit.addTextChangedListener(this);
        edit.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,item));
    }

    public void onTextChanged(CharSequence s,int start,int before,int count)
    {
        hasil.setText(edit.getText());
    }
    public void beforeTextChanged(CharSequence s,int start,int count,int after)
    {
        //not used
    }
    public void afterTextChanged(Editable s)
    {
        //not used
    }
}
