package trainedge.antitheftsecurity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Switch;

public class UI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);

        EditText num = (EditText) findViewById(R.id.etnum);
        EditText anum = (EditText) findViewById(R.id.etaltnum);
        Switch cam = (Switch) findViewById(R.id.spic);
        Switch gps = (Switch) findViewById(R.id.sgps);
        Switch ring = (Switch) findViewById(R.id.sringflash);
        Switch simdet = (Switch) findViewById(R.id.ssimdetect);

    }
}
