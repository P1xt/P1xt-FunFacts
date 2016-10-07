package com.p1xt.funfacts;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;


public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    // Declare our View variables
    private TextView mFactTextView;
    private Button mShowFactButton;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();
    private RelativeLayout mFactLayout;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variables
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mFactLayout = (RelativeLayout) findViewById(R.id.activity_fun_facts);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                int color = mColorWheel.getColor();

                mFactTextView.setText(fact);
                mFactLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);

            }
        };
        mShowFactButton.setOnClickListener(listener);
        //Toast.makeText(FunFactsActivity.this, "Yay! Our Activity was Created!", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "Logging from the onCreate method");
    }


}


