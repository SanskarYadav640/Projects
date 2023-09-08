
import java.util.*;
import javafx.application.Application; 
import javafx.collections.FXCollections;  
import javafx.collections.ObservableList; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data; 
         
public class piechart extends Application {  
   private static final char[] PieChart = null;
@Override 
   public void start(Stage stage) { 
	   PieChart.Data data[] = new PieChart.Data[5];
	   System.out.print("Enter the total number of entries");  
	   Scanner sc=new Scanner(System.in);  
	   int n=sc.nextInt();  
	  
			   //String status[] = {"Correct Answer", "Wrong Answer",
                       //"Compilation Error", "Runtime Error",
                       //"Others" };
	   String[] status = new String [20];
       System.out.println("Please enter names ");              
       Scanner s1 = new Scanner(System.in);
       for (int i1 = 0; i1 < n;i1++){
           status[i1] = s1.nextLine();
       }
    //int values[] = {2, 30, 10, 4, 20};
			  
			   
			   int[] values = new int[10];  
			   System.out.println("Enter the numbers ");  
			   for(int i1=0; i1<n; i1++)  
			   {  
			   values[i1]=sc.nextInt();  
			   }  
			   
    for (int i = 0; i < n; i++) {
        data[i] = new PieChart.Data(status[i], values[i]);
        
        
        ObservableList<Data> pieChartData = FXCollections.observableArrayList(data[i]);
		   ObservableList<Data> pieChartData1 ;
       // string and integer data
      //  Creating a Pie chart 
	PieChart pieChart = new PieChart(pieChartData); 
              System.out.println(status[i]);
              System.out.println(values[i]);
      //Setting the title of the Pie chart 
      pieChart.setTitle("Mobile Sales"); 
     
      //setting the direction to arrange the data 
      pieChart.setClockwise(true); 
       
      //Setting the length of the label line 
      pieChart.setLabelLineLength(50); 

      //Setting the labels of the pie chart visible  
      pieChart.setLabelsVisible(true); 
       
      //Setting the start angle of the pie chart  
      pieChart.setStartAngle(180);     
    
      //Creating a Group object  
      Group root = new Group(pieChart); 
    
      //Creating a scene object 
      Scene scene = new Scene(root, 600, 400);  
      
      //Setting title to the Stage 
      stage.setTitle("Pie chart"); 
         
      //Adding scene to the stage 
      stage.setScene(scene); 
         
      //Displaying the contents of the stage 
      stage.show();         
}
}
   


   public static void main(String args[]){ 
      launch(args); 
   } 
}