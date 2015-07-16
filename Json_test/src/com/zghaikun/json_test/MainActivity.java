package com.zghaikun.json_test;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView text;
	private JSONObject objcet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        text = (TextView) findViewById(R.id.text);
        
       String json = "{'name':'胡小威' , 'age':20 , 'male':true}";
      // String json="{'name':'阿波','age':30}";

       parseJsonObject(json);
    }

    public void parseJsonObject(String json) {
		try {
			JSONObject jsonObject = new JSONObject(json);
			String name = jsonObject.getString("name");
			int age = jsonObject.getInt("age");
			boolean male = jsonObject.getBoolean("male");
			System.out.println("name---" + name + "age---" + age + "male---" + male);
			text.setText("name---" + name + "age---" + age + "male---" + male);
			//接下来该干嘛干嘛
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
