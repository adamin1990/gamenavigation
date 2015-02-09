package com.navigation;

import com.lt.navigation.speeddriftracing.R;
import com.navigation.menufragment.CategoryFragment;
import com.navigation.menufragment.SearchFragment;
import com.navigation.menufragment.SecondFragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.TextView;

public class CategoryActivity extends BaseActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content_frame);
		initTitle(); 
		mContent = new SecondFragment();
		getSupportFragmentManager().beginTransaction().replace(R.id.content_frame, mContent).commit();
		initSlidingMenu();
		initAnimation();
	}
	
}