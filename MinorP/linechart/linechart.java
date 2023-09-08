import java.util.Scanner;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.chart.LineChart; 
import javafx.scene.chart.NumberAxis; 
import javafx.scene.chart.XYChart; 
         
public class linechart extends Application { 
   @Override 
   public void start(Stage stage) {
      //Defining the x axis             
      NumberAxis xAxis = new NumberAxis(1960, 2020, 10); 
      xAxis.setLabel("label1"); 
        
      //Defining the y axis   
      NumberAxis yAxis = new NumberAxis   (0, 350, 50); 
      yAxis.setLabel("label2"); 
        
      //Creating the line chart 
      LineChart linechart = new LineChart(xAxis, yAxis);  
        
      //Prepare XYChart.Series objects by setting data 
      XYChart.Series series = new XYChart.Series(); 
      series.setName("Result"); 
      System.out.print("Enter the total number of entries");  
	   Scanner sc=new Scanner(System.in);  
	   int n=sc.nextInt();  
	   int[] val1 = new int[10];  
	   int[] val2 = new int[10];  
	  
	   System.out.println("Enter the numbers ");  
	   for(int i1=0; i1<n; i1++)  
	   {  
	   val1[i1]=sc.nextInt();  
	   val2[i1]=sc.nextInt();  
	   
	   }  
	   for(int i2=0; i2<n; i2++)  {
      series.getData().add(new XYChart.Data(val1[i2], val2[i2])); 
	   }
	   for(int i3=0; i3<n; i3++) {
            System.out.println(val1[i3]);
            System.out.println(val2[i3]);   
	   }
      //Setting the data to Line chart    
      linechart.getData().add(series);        
        
      //Creating a Group object  
      Group root = new Group(linechart); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 400);  
      
      //Setting title to the Stage 
      stage.setTitle("Line Chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene);
	   
      //Displaying the contents of the stage 
      stage.show();         
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}