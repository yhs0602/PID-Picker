package com.kyhsgeekcode.pidpicker;
import android.content.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class PidPickLVAdapter extends BaseAdapter
{
	List<ProcessInfo> infos= new ArrayList<ProcessInfo>();
	@Override
	public int getCount()
	{
		// TODO: Implement this method
		return infos.size();
	}

	@Override
	public Object getItem(int p1)
	{
		// TODO: Implement this method
		return infos.get(p1);
	}

	@Override
	public int getItemId(int p1)
	{
		// TODO: Implement this method
		return p1;
	}

	@Override
	public View getView(int p1, View p2, ViewGroup p3)
	{
		final Context context = p3.getContext();

        // "listview_item" Layout을 inflate하여 convertView 참조 획득.
        if (p2 == null)
		{
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            p2 = inflater.inflate(R.layout.pidpickrow, p3, false);		
        }
		ImageView ivImg=(ImageView) p2.findViewById(R.id.pidpickrowImageView);
		TextView tvPid= (TextView) p2.findViewById(R.id.pidpickrowTextViewID);
		TextView tvName=(TextView) p2.findViewById(R.id.pidpickrowTextViewName);
		ProcessInfo ps=infos.get(p1);
		tvPid.setText(""+ps.pid);
		tvName.setText(""+ps.name);
		ivImg.setImageDrawable(R.drawable.ic_launcher);
		return p2;
	}
	public void AddItem(ProcessInfo pi)
	{
		infos.add(pi);
		notifyDataSetChanged();
	}
	
}
