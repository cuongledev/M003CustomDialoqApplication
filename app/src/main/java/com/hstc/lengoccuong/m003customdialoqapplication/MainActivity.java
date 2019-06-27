package com.hstc.lengoccuong.m003customdialoqapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        btnDialog = findViewById(R.id.btnDialog);
        btnDialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDialog:

                showDialoq();


                break;
            default:
                break;
        }
    }

    private void showDialoq() {

        MyDialog dialog = new MyDialog(this);
        dialog.show();

    }
}
