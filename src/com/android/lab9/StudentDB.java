package com.android.lab9;

import android.R.id;
import android.R.integer;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.inputmethodservice.Keyboard.Row;

public class StudentDB extends SQLiteOpenHelper{
	
	private static final String DB_NAME = "student.db";
	private static final int DB_VERSION = 1;
	private static final String TABLE_NAME = "student";
	private static final String SQL_CREATE_TABLE = "CREATE TABLE " + TABLE_NAME 
			+ "( studentId int NOT NULL, name text, describe text);";
			
	
	public StudentDB(Context context, String name, CursorFactory factory,
			int version) {
		super(context, DB_NAME, null, DB_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(SQL_CREATE_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自动生成的方法存根
		
	}
	
	public int deleteById(int studentId){
		SQLiteDatabase db = getWritableDatabase();
		String whereClause = "id = ?";
		String[] whereArgs = { Integer.toString(studentId) };
		int row = db.delete(TABLE_NAME, whereClause, whereArgs);
		db.close();
		return row;
	}
	
	public Student update(int studentId) {
		Student stu = null;
		SQLiteDatabase db = getWritableDatabase();
		String whereClause = "_id = ?";
		
		return stu;
	}
}