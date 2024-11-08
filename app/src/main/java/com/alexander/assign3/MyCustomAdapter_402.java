package com.alexander.assign3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.ArrayList;

public class MyCustomAdapter_402 extends BaseAdapter {

    private Context context;
    private ArrayList<Friend> friendsList;

    public MyCustomAdapter_402(Context context, ArrayList<Friend> friendsList) {
        this.context = context;
        this.friendsList = friendsList;
    }

    @Override
    public int getCount() {
        return friendsList.size();
    }

    @Override
    public Object getItem(int position) {
        return friendsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list_layout_402, parent, false);
        }

        ShapeableImageView imageView = convertView.findViewById(R.id.alexander402_image);
        TextView nameView = convertView.findViewById(R.id.alexander402_name);
        TextView studentNumberView = convertView.findViewById(R.id.alexander402_student_number);
        TextView friendCountView = convertView.findViewById(R.id.alexander402_friend_count);

        Friend friend = friendsList.get(position);

        imageView.setImageResource(friend.getImageId());
        nameView.setText(friend.getName());
        studentNumberView.setText("ID: " + friend.getStudentNumber());
        friendCountView.setText("Friends: " + friend.getFriendCount());

        return convertView;
    }
}
