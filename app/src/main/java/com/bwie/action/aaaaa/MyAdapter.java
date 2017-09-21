package com.bwie.action.aaaaa;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ASUS on 2017/9/21.
 */
public class MyAdapter extends BaseAdapter {
    Context context;
    List<Data.DataEntity> list;

    public MyAdapter(Context context, List<Data.DataEntity> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list==null?0:list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            holder = new ViewHolder();
            convertView = View.inflate(context,R.layout.item,null);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }
        Data.DataEntity bean = list.get(position);
        holder.name.setText(bean.getTitle());
        return convertView;
    }
    class ViewHolder{
        TextView name;
    }
}
