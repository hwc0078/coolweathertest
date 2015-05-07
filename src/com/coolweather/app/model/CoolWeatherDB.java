package com.coolweather.app.model;

import com.coolweather.app.db.CoolWeatherOpenHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CoolWeatherDB {

	
	public static final String DB_NAME = "cool_weather";
	public static final int VERSION = 1;
	private static CoolWeatherDB coolWeatherDB;
	private SQLiteDatabase db;
	
	
	private CoolWeatherDB(Context context) {
		CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context,DB_NAME,null,VERSION);
		db = dbHelper.getWritableDatabase();
	}
	
		
	
	
	
}
