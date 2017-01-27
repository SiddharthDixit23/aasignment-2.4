package com.example.siddharth.hideandseek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

        private ImageView mImageView;
        private Button mButton;
        private  boolean counter = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageView = (ImageView)findViewById(R.id.imageView);
        mButton = (Button)findViewById(R.id.button);
        mButton.setText("HIDE");
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter) {
                    mImageView.setVisibility(View.INVISIBLE);
                    counter = false;
                    mButton.setText("SHOW");
                } else {
                    mImageView.setVisibility(View.VISIBLE);
                    counter = true;
                    mButton.setText("HIDE");
                }
            }
        });
    }
}
