package com.bawei.lianxi01.view.adapter;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.lianxi01.R;
import com.bawei.lianxi01.model.bean.Lawyer;
import com.bawei.lianxi01.netutile.Netutile;

import java.util.ArrayList;
import java.util.List;

/**
 * date:2019/12/2
 * author:张博一(zhangboyi)
 * function:
 */
public class MyAdapter extends BaseAdapter {

    List<Lawyer.DataBean> list = new ArrayList<>();

    public MyAdapter(List<Lawyer.DataBean> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
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
        ViewHolder holder;
        if (convertView == null){
            convertView = View.inflate(parent.getContext(), R.layout.grid_item,null);
            holder = new ViewHolder();
            holder.imageView = convertView.findViewById(R.id.grid_image);
            holder.name = convertView.findViewById(R.id.grid_name);
            holder.content = convertView.findViewById(R.id.grid_content);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        Lawyer.DataBean dataBean = list.get(position);

        holder.name.setText(dataBean.getGoods_name());
        holder.content.setText(dataBean.getCurrency_price());

        final ViewHolder holder1 = holder;

        Netutile.getInstance().doGetPhoto(dataBean.getGoods_thumb(), new Netutile.MyCallBack() {
            @Override
            public void ondoGetSuccsess(String json) {

            }

            @Override
            public void ondoGetPhotoSuccsess(Bitmap bitmap) {
                holder1.imageView.setImageBitmap(bitmap);
            }

            @Override
            public void onError(Throwable throwable) {

            }
        });

        return convertView;
    }

    class ViewHolder{
        ImageView imageView;
        TextView name,content;
    }
}
