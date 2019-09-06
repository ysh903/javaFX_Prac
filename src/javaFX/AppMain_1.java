package javaFX;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain_1 extends Application{
	
	public static void main(String[] args) {
		System.out.println(
			Thread.currentThread().getName()+": main() 호출");
		launch(args);
	}
	
	public AppMain_1() {
		System.out.println(
		Thread.currentThread().getName()+": AppMain() 호출");
	}
	
	@Override
	public void init() throws Exception {
		System.out.println(
			Thread.currentThread().getName()+": init() 호출");
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(
			Thread.currentThread().getName()+": start() 호출");
		primaryStage.show();
	}
	
	
	@Override
	public void stop()  throws Exception {
		System.out.println(
			Thread.currentThread().getName()+": stop() 호출");
	}

}
