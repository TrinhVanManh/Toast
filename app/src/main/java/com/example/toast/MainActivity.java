package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etInput;
    private Button btCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInput = findViewById(R.id.et_msv);
        btCheck = findViewById(R.id.bt_check);
        btCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etInput.getText().toString().trim().length() == 0){
                    Toast.makeText(MainActivity.this,
                            "Bạn chưa nhập mã sinh viên",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    String valueInput = etInput.getText().toString();
                    //012345
                    Toast.makeText(MainActivity.this,
                            "Khóa là "+valueInput.substring(0,2),
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}