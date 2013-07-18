
package com.sample;






import com.sample.R;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

@SuppressLint("NewApi")
public class MainActivity extends Activity {
 Button ok;
 Intent intent;


 @Override
 public void onCreate(Bundle savedInstanceState) {
  super.onCreate(savedInstanceState);
  setContentView(R.layout.activity_main);
  Button ok =(Button) findViewById(R.id.btn_login);
	ok.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		
			Intent intent = new Intent(v.getContext(), SubActivity.class);
          startActivityForResult(intent, 0);
      }

		

  });
}
}