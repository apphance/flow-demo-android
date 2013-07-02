package com.apphance.flow.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView invitationTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        findViewById(R.id.btnInvitation).setOnClickListener(this);
        invitationTextView = (TextView) findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnInvitation:
                invitationTextView.setText("Hello!");
                break;
        }
    }
}
