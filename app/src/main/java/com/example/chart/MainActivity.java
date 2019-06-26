package com.example.chart;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LineChart mpLineChart;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mpLineChart=(LineChart)findViewById(R.id.line_chart);
        LineDataSet lineDataSet1=new LineDataSet(dataValues1(),"Data set 1");
        lineDataSet1.setDrawCircles(false);
        lineDataSet1.setColors(new int[]{R.color.orange1,R.color.orange2},this );
        lineDataSet1.setLineWidth(7);
        ArrayList<ILineDataSet>dataSets=new ArrayList<>();
        dataSets.add(lineDataSet1);
      // mpLineChart.getAxisLeft().setDrawGridLines(false);
        //mpLineChart.getXAxis().setDrawGridLines(false);
        //mpLineChart.setDrawGridBackground(false);
        mpLineChart.getXAxis().setDrawGridLines(false);
        mpLineChart.getXAxis().setDrawAxisLine(false);
        mpLineChart.getAxisLeft().setDrawAxisLine(false);
        mpLineChart.getAxisRight().setDrawAxisLine(false);
        mpLineChart.getAxisLeft().setDrawGridLines(false);
        mpLineChart.getAxisRight().setDrawGridLines(false);
        mpLineChart.getXAxis().setEnabled(false);
        mpLineChart.getAxisRight().setEnabled(false);
        mpLineChart.getAxisLeft().setEnabled(false);
        mpLineChart.setDrawBorders(false);

        Description description=new Description();
        description.setText("sleep");
        description.setTextColor(Color.RED);
        description.setTextSize(20);
        mpLineChart.setDescription(description);



        LineData data=new LineData(dataSets);
        mpLineChart.setData(data);
        mpLineChart.invalidate();


    }

    private ArrayList<Entry>dataValues1(){
        ArrayList<Entry> datavals=new ArrayList<Entry>();

        datavals.add(new Entry(60,0 ));
        datavals.add(new Entry(48,1 ));
        datavals.add(new Entry(70.5f,2 ));
        datavals.add(new Entry(100,3 ));
        datavals.add(new Entry(180.9f,4 ));

        return datavals;
    }

}


