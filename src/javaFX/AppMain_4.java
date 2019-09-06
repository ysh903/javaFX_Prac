package javaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain_4 extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPrefSize(200, 50);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20);
				
		// 직접 EventHandler 생성 후 등록
		Button btn1 = new Button("Button1");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button1 Clicked");
            }
        });
		
        // 람다식 이용
		Button btn2 = new Button("Button2");
        btn2.setOnAction( event -> System.out.println("Button2 Clicked"));
        
        root.getChildren().addAll(btn1, btn2);
        Scene scene = new Scene(root);
        
        primaryStage.setTitle("ButtonActionEventExam");
        primaryStage.setScene(scene);
        primaryStage.show();
		
	}

}
