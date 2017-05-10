package com.neelam.venkatesh.s4a2_customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mName;
    private ArrayList<String> mPhoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mCustomView = (ListView) findViewById(R.id.list_view);
        mName = new ArrayList<>();
        mName.add("Gandhi");
        mName.add("Nehru");
        mName.add("Subash Chandra Bose");
        mName.add("Sardar V Patel");
        mName.add("Bhagat Singh");
        mName.add("Chndra Sekhar Azad");
        mName.add("Sarojini Naidu");

        mPhoneNumber = new ArrayList<>();
        mPhoneNumber.add("9848012345");
        mPhoneNumber.add("9988800111");
        mPhoneNumber.add("9801234567");
        mPhoneNumber.add("9490123987");
        mPhoneNumber.add("9876543210");
        mPhoneNumber.add("9666123456");
        mPhoneNumber.add("9949054321");

        mCustomView.setAdapter (new MyAdapter());

    }

    class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return mName.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.row_view, parent, false);
            TextView textView1 = (TextView) view.findViewById(R.id.textview_name);
            textView1.setText(mName.get(position));
            TextView textView2 = (TextView)view.findViewById(R.id.textView_phone);
            textView2.setText(mPhoneNumber.get(position));
            return view;

        }
    }
}
