package com.google.th_baiktra3;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends BaseAdapter {

    Activity activity;
    List<Model> model;

    public Adapter(Activity activity, List<Model> model) {
        this.activity = activity;
        this.model = model;
    }

    @Override
    public int getCount() {
        return model.size();
    }

    @Override
    public Object getItem(int i) {
        return model.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        // Đổ dữ liệu vào biến View, view này chính là những gì nằm trong item_name.xml

        view = inflater.inflate(R.layout.item, null);

        // Đặt chữ cho từng view trong danh sách.
        TextView tvName = (TextView) view.findViewById(R.id.tvPhepTinh);
        TextView tvKhuvuc = (TextView) view.findViewById(R.id.khuvuc);
        ImageView img = (ImageView)view.findViewById(R.id.iconPhepTinh);
        tvName.setText(model.get(i).getTenPhepTinh());
        tvKhuvuc.setText(model.get(i).getKhuvuc());

        img.setImageResource(model.get(i).getIcon());
        // Trả về view kết quả.
        return view;
    }
}
