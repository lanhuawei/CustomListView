package com.lanhuawei.customlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.lanhuawei.customlistview.R;
import com.lanhuawei.customlistview.view.SwipeItemLayout;

/**
 * Created by Ivan on 2017/9/3.
 */

public class BankImageAdapter extends BaseAdapter implements View.OnClickListener{
    private Context context = null;

    public BankImageAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder = null;
        if (view == null) {
            viewHolder = new ViewHolder();
            View view1 = LayoutInflater.from(context).inflate(R.layout.bank_card_view, null);
            View view2 = LayoutInflater.from(context).inflate(R.layout.delete_button, null);
            view = new SwipeItemLayout(view1, view2, null, null);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        return view;
    }



    class ViewHolder{
        Button btn = null;
    }

    @Override
    public void onClick(View view) {

    }
}
