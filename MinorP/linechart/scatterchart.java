import javafx.application.Application; 
import static javafx.application.Application.launch;

import java.util.Scanner;

import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.chart.NumberAxis; 
import javafx.scene.chart.ScatterChart; 
import javafx.scene.chart.XYChart; 
         
public class scatterchart extends Application { 
   @Override 
   public void start(Stage stage) {     
     
	   //Defining the axes               
      NumberAxis xAxis = new NumberAxis(0, 12, 3); 
      xAxis.setLabel("Area");          
        
      NumberAxis yAxis = new NumberAxis(0, 16, 4); 
      yAxis.setLabel("Weight"); 
      
      //Creating the Scatter chart 
      ScatterChart<String, Number> scatterChart = 
      new ScatterChart(xAxis, yAxis);         
         
      //Prepare XYChart.Series objects by setting data 
      XYChart.Series series = new XYChart.Series();  
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
                
      //Setting the data to scatter chart        
      scatterChart.getData().addAll(series); 
         
      //Creating a Group object  
      Group root = new Group(scatterChart); 
         
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 400);  
      
      //Setting title to the Stage 
      stage.setTitle("Scatter Chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show(); 
   } 
   public static void main(String args[]){ 
      launch(args); 
   } 
}