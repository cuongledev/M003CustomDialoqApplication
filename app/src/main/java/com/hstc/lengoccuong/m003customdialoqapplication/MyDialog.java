package com.hstc.lengoccuong.m003customdialoqapplication;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MyDialog extends Dialog implements View.OnClickListener {
    private EditText edtPhone;
    private Button btnCall;
    private Button btnCancel;
    private Context mContext;

    public MyDialog(Context context) {

        super(context);
        mContext = context;

        initViews();
    }

    private void initViews() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_calling);

        setCanceledOnTouchOutside(false);
        setCancelable(false);

        btnCall = findViewById(R.id.btn_call);
        btnCancel = findViewById(R.id.btn_cancel);
        edtPhone = findViewById(R.id.edt_phone);
        btnCall.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn_call:

                doCalling();

                break;

            case R.id.btn_cancel:

                dismiss();

                break;

            default:
                break;
        }
    }

    private void doCalling() {

        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+edtPhone.getText().toString()));
        mContext.startActivity(intent);

    }
}
