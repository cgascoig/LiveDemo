package com.cisco.livedemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LiveDemoActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button b = (Button)findViewById(R.id.button1);
        b.setOnClickListener(this);
    }

	@Override
	public void onClick(View arg0) {
		Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234"));
		startActivity(intent);
		
	}
}