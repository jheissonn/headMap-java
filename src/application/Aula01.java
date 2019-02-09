package application;

import java.awt.Color;
import java.io.File;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.stage.Stage;

public class Aula01 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public void start(Stage arg0) throws Exception {
		arg0.show();
		
		// TODO Auto-generated method stub
		ColorNumberStrong coresTeste = new ColorNumberStrong(new Color(0,255,0),"5", (double) 2);
		ArrayList<ColorNumberStrong> agenda = new ArrayList<ColorNumberStrong>();
		agenda.add(coresTeste);
		agenda.add(new ColorNumberStrong(new Color(0,255,0),"2", (double) 2));
		agenda.add(new ColorNumberStrong(new Color(255,0,0),"3", (double) 4));
		agenda.add(new ColorNumberStrong(new Color(0,0,255),"4", (double) 7));
		agenda.add(new ColorNumberStrong(new Color(255,20,147),"0", (double) 3));

		double[][] data = new double[][]{
				   {2,0,3,0,0,7},
                   {0,0,0,0,0,0},
                   {0,0,4,0,0,2},
                   {0,3,0,0,5,0}};

       HeatChart map = new HeatChart(data,true, agenda);
       map.setTitle("This is my heat chart title");
       map.setXAxisLabel("X Axis");
       map.setYAxisLabel("Y Axis");
       map.setXValuesHorizontal(false);
       map.setCellWidth(120);
       map.setCellHeight(120);
       map.saveToFile(new File("java-heat-chart.png"));
		
		
	}

}
