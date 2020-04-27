package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.event.*;
import java.util.ArrayList;
import javafx.scene.Node;

public class Main extends Application {
	Button b1;
	Button b2;
	Button b3;
	Button b4;
	Button b5;
	Button b6;
	Button b7;
	Button b8;
	Button b9;
	Button b0;
	
	Button pl;
	Button mi;
	Button mu;
	Button di;
	Button eq;
	Button cl;
	Button dot;
	
	
	int i=1;
	
	@FXML
	private Text output;
	
	//private String output;
	
	@FXML
	public void handle(ActionEvent event) {
		System.out.println("HelloWorld");
		String v = ((Button) event.getSource()).getText();
		System.out.println(v);
		output.setText(output.getText() + v);
	}
	
	@FXML
	public void opcalc(ActionEvent event) {
		System.out.println("HelloWorld");
		System.out.println(output.getText());
		Operation calc = convert(output.getText());
		output.setText("" + calc.solve());
	}
	
	@FXML
	public void clear(ActionEvent event) {
		System.out.println("HelloWorld");
		output.setText("");
	}
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			primaryStage.setTitle("Calculator");
			
			//VBox root = new VBox();
			Parent root = FXMLLoader.load(getClass().getResource("calui.fxml"));
			//https://stackoverflow.com/questions/24986776/how-do-i-get-all-nodes-in-a-parent-in-javafx code from
			
			
			Scene scene = new Scene(root);
			
			b1 = new Button("1");
			b2 = new Button("2");
			b3 = new Button("3");
			b4 = new Button("4");
			b5 = new Button("5");
			b6 = new Button("6");
			b7 = new Button("7");
			b8 = new Button("8");
			b9 = new Button("9");
			b0 = new Button("0");
			
			pl = new Button("+");
			mi = new Button("-");
			mu = new Button("*");
			di = new Button("/");
			eq = new Button("=");
			cl = new Button("ce");
			dot = new Button(".");
			
			/*
			b1.setPrefWidth(50);
			
			b1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 1;
					label1.setText(output);
				}
			});
			
			b2.setOnAction(new EventHandler<ActionEvent>() {
				
			});
			
			b3.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 3;
					label1.setText(output);
				}
			});
			
			b4.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 4;
					label1.setText(output);
				}
			});
			
			b5.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 5;
					label1.setText(output);
				}
			});
			
			b6.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 6;
					label1.setText(output);
				}
			});
			
			b7.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 7;
					label1.setText(output);
				}
			});
			
			b8.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 8;
					label1.setText(output);
				}
			});
			
			b9.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 9;
					label1.setText(output);
				}
			});
			
			b0.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + 0;
					label1.setText(output);
				}
			});
			
			pl.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + "+";
					label1.setText(output);
				}
			});
			
			mi.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + "-";
					label1.setText(output);
				}
			});
			
			mu.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + "*";
					label1.setText(output);
				}
			});
			
			di.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + "/";
					label1.setText(output);
				}
			});
			
			dot.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = output + ".";
					label1.setText(output);
				}
			});
			
			cl.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					output = "";
					label1.setText("" + 0);
				}
			});
			
			eq.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					System.out.println("HelloWorld");
					Operation calc = convert(output);
					output = "" + calc.solve();
					label1.setText(output);
				}
			});
			
			
			root.add(label1);
			root.getChildren().add(b1);
			root.getChildren().add(b2);
			root.getChildren().add(b3);
			root.getChildren().add(b4);
			root.getChildren().add(b5);
			root.getChildren().add(b6);
			root.getChildren().add(b7);
			root.getChildren().add(b8);
			root.getChildren().add(b9);
			root.getChildren().add(b0);
			root.getChildren().add(pl);
			root.getChildren().add(mi);
			root.getChildren().add(mu);
			root.getChildren().add(di);
			root.getChildren().add(eq);
			root.getChildren().add(cl);
			*/
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			output.setText("error");
			e.printStackTrace();
		}
	}
	
	public Operation convert(String text) {
		Operation op = new Operation ((Operation) null, (Operation) null, -2, -1);
		

		int add = text.indexOf("+");
		int sub = text.indexOf("-");
		if (add == -1 && sub == -1){
			int mul = text.indexOf("*");
			int div = text.indexOf("/");
			if (mul == -1 && div == -1) {
				int log = text.indexOf("l");
				if (log == -1) {
					System.out.println(text);
					op = new Operation ((Operation) null, (Operation) null, -1, Double.parseDouble(text));
				} else if (log != -1) {
					System.out.println(text + ": " + mul);
					op = new Operation (this.convert(text.substring(log + 2)), null, 4, -1);
				}
			}
			else if ((mul < div || div == -1) && mul != -1){
				System.out.println(text + ": " + mul);
				op = new Operation (this.convert(text.substring(0,mul)), this.convert(text.substring(mul + 1)), 2, -1);
			} else if (div != -1) {
				System.out.println(text + ": " + div);
				op = new Operation (this.convert(text.substring(0,div)), this.convert(text.substring(div + 1)), 3, -1);
			}
		}else if ((add < sub || sub == -1) && add != -1) {
			System.out.println(text + ":a " + add);
			op = new Operation (this.convert(text.substring(0,add)), this.convert(text.substring(add + 1)), 0, -1);
		} else if(sub != -1) {	
			System.out.println(text + ": " + sub);
			op = new Operation (this.convert(text.substring(0,sub)), this.convert(text.substring(sub + 1)), 1, -1);
		}
		return op;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
