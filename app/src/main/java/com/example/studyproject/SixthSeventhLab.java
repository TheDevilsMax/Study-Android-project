package com.example.studyproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SixthSeventhLab extends AppCompatActivity {

    String fileName = "textmemes.txt";
    File fileDir = new File(Environment.getExternalStorageDirectory().getAbsolutePath() +"/files");
    File file = new File(fileDir, fileName);
    final static String textViewTexKey = "TEXT_VIEW";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthseventh_lab);
        }


    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        TextView textV = (TextView) findViewById(R.id.textToSave);
        outState.putString(textViewTexKey, textV.getText().toString());
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        String textVText = savedInstanceState.getString(textViewTexKey);
        TextView textV = (TextView) findViewById(R.id.textToSave);
        textV.setText(textVText);
    }

    public void Save(View view)
    {
        fileDir.mkdirs();
        try
        {
            EditText textBox = (EditText) findViewById(R.id.textToSave);
            String text = textBox.getText().toString();
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write(text);
            bw.close();
            Toast.makeText(this, "Текстовый файл успешно сохранён!",
            Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
            Toast.makeText(this, "Файл не найден!",
            Toast.LENGTH_SHORT).show();
        } catch (IOException e)
        {
            e.printStackTrace();
            Toast.makeText(this, "Ошибка сохранения файла!",
            Toast.LENGTH_SHORT).show();
        }
    }
    public void Open(View view)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String text = "";
            text = br.readLine();
            TextView textV = (TextView) findViewById(R.id.Text);
            textV.setText(text);
            br.close();
        } catch (IOException ex)
        {
            Toast.makeText(this, ex.getMessage(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}