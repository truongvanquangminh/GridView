package com.example.gridview;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SanPhamAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<SanPham> sanPhamList;

    public SanPhamAdapter(Context context, int layout, List<SanPham> sanPhamList) {
        this.context = context;
        this.layout = layout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        return sanPhamList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    public class ViewHolder{
        ImageView imgHinh;
        TextView  textTen;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.imgHinh = (ImageView) convertView.findViewById(R.id.imageviewHinhanh);
            holder.textTen = (TextView) convertView.findViewById(R.id.textviewSanPham);

            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        SanPham sanPham = sanPhamList.get(position);

        holder.imgHinh.setImageResource(sanPham.getHinh());
        holder.textTen.setText(sanPham.getTen());

        return convertView;
    }
}
