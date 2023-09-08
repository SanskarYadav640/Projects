import javafx.application.Application;
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;

public class startpage extends Application {
	public static void main(String[] args) {
		
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception{
		
		MenuBar main_menu = new MenuBar();
		

		Menu LineChart = new Menu("Line Charts");
		LineChart.setOnAction(e -> System.out.println("Hello World"));
		Menu PieChart = new Menu("PieChart");
		Menu ScatterChart = new Menu("ScatterChart");
		Menu BubbleChart = new Menu("BubbleChart");
		
		main_menu.getMenus().add(LineChart);
		main_menu.getMenus().add(PieChart);
		main_menu.getMenus().add(ScatterChart);
		main_menu.getMenus().add(BubbleChart);
		
		
		
		
		
		
		BorderPane root = new BorderPane();
		root.setTop(main_menu);
		
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);;
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		primaryStage.setTitle("Charts");
		primaryStage.show();
		
		
	}
}