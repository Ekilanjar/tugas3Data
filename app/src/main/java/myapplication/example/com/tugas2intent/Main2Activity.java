package myapplication.example.com.tugas2intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {


    private EditText ed1, ed2;
    private Button btnH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ed1 = findViewById(R.id.input_awal);
        ed2 = findViewById(R.id.input_akhir);
        btnH = findViewById(R.id.btn_hitung);

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String inp1 = ed1.getText().toString().trim();
                final String inp2 = ed2.getText().toString().trim();
                Integer in1 = toInt(inp1);
                Integer in2 = toInt(inp2);

                Integer hasil = Integer.parseInt(inp1)*Integer.parseInt(inp2);
                Intent intent = new Intent();
                intent.setData(Uri.parse(String.valueOf(hasil)));
                setResult(RESULT_OK,intent);
                finish();
            }
        });

    }

    private Integer toInt(String str) {

        try {
            return Integer.parseInt(str);
        }catch (Exception e){
            return null;
        }

    }
}
