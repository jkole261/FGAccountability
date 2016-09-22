package edu.ramapo.jkole.FGA.menu;

import java.awt.Container;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

import edu.ramapo.jkole.FGA.draw.DrawArea;
import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenu extends Application{

	public static void main(String[] args){
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		Scene scene = new Scene(root, 1200, 600);
		root.setCenter(getCanvas());

		scene.getStylesheets().add((new File("lib/mainmenu.css")
    			.toURI().toURL()).toExternalForm());
		root.setLeft(getToolBar());
		primaryStage.setTitle("FireGround Accountability");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private VBox getToolBar() {
		VBox toolbar = new VBox();
		Button canvas = new Button("Canvas");
		Button apparat = new Button("Resp App");
		
		canvas.setPadding(new Insets(5, 5, 5, 5));
		canvas.setOnAction(e -> {
			getCanvas();
		});
		
		toolbar.getChildren().addAll(canvas, apparat);
		return toolbar;
	}

	private Node getCanvas() {
		SwingNode node = new SwingNode();
		DrawArea drawArea = new DrawArea();
		node.setContent(drawArea);
		return node;
	}
}
