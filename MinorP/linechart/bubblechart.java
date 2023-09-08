	
import java.util.Scanner;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.chart.BubbleChart; 
import javafx.stage.Stage;  
import javafx.scene.chart.NumberAxis; 
import javafx.scene.chart.XYChart; 
         
public class bubblechart extends Application { 
   @Override 
   public void start(Stage stage) {     
      //Defining the axes               
      NumberAxis xAxis = new NumberAxis(0, 100, 10);        
      xAxis.setLabel("Age"); 
        
      NumberAxis yAxis = new NumberAxis(20, 100, 10); 
      yAxis.setLabel("Weight"); 
      
      //Creating the Bubble chart 
      BubbleChart bubbleChart = new BubbleChart(xAxis, yAxis);    
         
      //Prepare XYChart.Series objects by setting data        
      XYChart.Series series = new XYChart.Series();  
      series.setName("work"); 
      System.out.print("Enter the total number of entries");  
	   Scanner sc=new Scanner(System.in);  
	   int n=sc.nextInt();  
	   int[] val1 = new int[10];  
	   int[] val2 = new int[10];  
	   int[] val3 = new int[10];  
	   System.out.println("Enter the numbers ");  
	   for(int i1=0; i1<n; i1++)  
	   {  
	   val1[i1]=sc.nextInt();  
	   val2[i1]=sc.nextInt();  
	   val3[i1]=sc.nextInt();  
	   }  
	   for(int i2=0; i2<n; i2++) {  
      series.getData().add(new XYChart.Data(val1[i2],val2[i2],val3[i2]));  
	   }
      //Setting the data to bar chart         
      bubbleChart.getData().add(series); 
         
      //Creating a Group object  
      Group root = new Group(bubbleChart); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 400);  
      
      //Setting title to the Stage 
      stage.setTitle("Bubble Chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
   }  
   public static void main(String args[]){ 
      launch(args); 
   } 
}