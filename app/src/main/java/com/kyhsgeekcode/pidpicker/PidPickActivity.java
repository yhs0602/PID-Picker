package com.kyhsgeekcode.pidpicker;
import android.app.*;
import android.os.*;
import android.util.*;
import android.widget.*;
import java.io.*;

public class PidPickActivity extends Activity
{
	ListView lvPids;
	PidPickLVAdapter adapter=new PidPickLVAdapter();

	private String TAG="PidPick";
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pidpick);
		lvPids=(ListView) findViewById(R.id.pidpickListView);
		try
		{
			InputStream is= getAssets().open("myps");
			FileOutputStream os=new FileOutputStream( getFilesDir()+"myps");
			
			int read;
			byte[] bytes=new byte[4096];
			while((read=is.read(bytes,0,4096)>0)
			{
				os.write(bytes,0,4096);
			}
			
		}
		catch (IOException e)
		{
			Log.e(TAG,"",e);
		}
		lvPids.setAdapter(adapter);
	}
	
}
