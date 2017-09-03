package com.lanhuawei.customlistview.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.lanhuawei.customlistview.R;
import com.lanhuawei.customlistview.adapter.BankImageAdapter;
import com.lanhuawei.customlistview.view.SwipeListView;

public class MainActivity extends Activity {
    private SwipeListView swipeListView = null;
    private BankImageAdapter bankImageAdapter = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        swipeListView = (SwipeListView) findViewById(R.id.lv);
        bankImageAdapter = new BankImageAdapter(this);
        swipeListView.setAdapter(bankImageAdapter);
    }
}
