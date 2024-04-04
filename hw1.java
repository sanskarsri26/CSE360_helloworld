package asuHelloWorldJavaFX;
 
import javafx.application.Application;		//importing the package
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;

public class hw1 extends Application 
{
	double bill = 0;  					//Declaring bill as global variable
	String ord = "";
	
	public static void main(String[] args) 		//Main method
	{
        launch(args);
	}
    @Override
    public void start(Stage primaryStage) 	
    {
    	double egg_sandwich = 7.99;			//Declaring variable 
		double bagel = 2.50;
		double potato_salad = 4.49;
		double chicken_sandwich = 9.99;
		double coffee = 1.99;
		double green_tea = 0.99;
		double black_tea = 1.25;
		double orange_juice = 2.25;		
		
		GridPane grid_gap = new GridPane();			// layout 1
		grid_gap.setVgap(15);						//Setting vertical gap
		grid_gap.setHgap(15);						//Setting horizontal gap
		
		Label lbl = new Label();					//Declaring label
		lbl.setText("Joe's Deli");					//Setting the label text
				
		ColumnConstraints col1 = new ColumnConstraints();   		//Diving page into 3 
		col1.setPercentWidth(33.3);
		ColumnConstraints col2 = new ColumnConstraints();
		col2.setPercentWidth(33.3);
		ColumnConstraints col3 = new ColumnConstraints();
		col3.setPercentWidth(33.3);
		grid_gap.getColumnConstraints().addAll(col1,col2,col3);
		
		Label l = new Label();					//Again declaring label	
		l.setText("Eat:");
		
		Label l1 = new Label();					//Again declaring label	
		l1.setText("Drink:");
				
		
		CheckBox chk = new CheckBox("   Egg Sandwich");   //Declaring checkbox 
		CheckBox chk1 = new CheckBox("  Chicken Sandwich");
		CheckBox chk2 = new CheckBox("  Bagel");
		CheckBox chk3 = new CheckBox("  Potato salad");
		VBox box = new VBox();				//Declaring vbox and adding checkbox into vbox
		box.setSpacing(8);
		box.getChildren().addAll(l,chk,chk1,chk2,chk3);
		
		ToggleGroup grp = new ToggleGroup();			//Declaring radiobutton 
		RadioButton opt1 = new RadioButton("Black Tea");
		RadioButton opt2 = new RadioButton("Green Tea");
		RadioButton opt3 = new RadioButton("Coffee");
		RadioButton opt4 = new RadioButton("Orange Juice");
		opt1.setToggleGroup(grp);
		opt2.setToggleGroup(grp);
		opt3.setToggleGroup(grp);
		opt4.setToggleGroup(grp);
		VBox rb = new VBox();			//Declaring vbox and adding radiobutton into it
		rb.setSpacing(8);
		rb.getChildren().addAll(l1,opt1,opt2,opt3,opt4);   
		
		TextArea ta = new TextArea();		//Declaring area where bill can be shown
		ta.setEditable(false);
		ta.appendText("           Bill");
		ta.setMaxHeight(140);
		ta.setMaxWidth(140);
		
		Button order = new Button();			//Creating button for order
		order.setText("Order");
		
		Button cancel = new Button(); 			//Creating button for cancel
		cancel.setText("Cancel");
		
		Button confirm = new Button();			//Creating button for confirm
		//confirm.setBorder();
		confirm.setText("Confirm");
		
		grid_gap.add(box, 0, 3);			//Adding all the details to the layout
		grid_gap.add(rb, 1, 3);
		grid_gap.add(ta, 2, 3);
		grid_gap.add(order, 0, 5);
		grid_gap.add(cancel, 1, 5);
		grid_gap.add(confirm, 2, 5);
		grid_gap.add(lbl, 1, 0);
		grid_gap.setPadding(new Insets(0,0,0,10));
		//grid_gap.setGridLinesVisible(true);
		chk.setOnAction(new EventHandler<ActionEvent>()  	//If egg sandwich button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				if(chk.isSelected() != true)		//Subtracting it only when the checkbox is deselected
				{
					bill-= egg_sandwich;
				}
				if(chk.isSelected() == true)		//Adding it only when the checkbox is selected
				{
					bill+= egg_sandwich;
				}
			}
		});
		
		chk1.setOnAction(new EventHandler<ActionEvent>() //If chicken sandwich button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				if(chk1.isSelected() != true)
				{
					bill-= chicken_sandwich;
				}
				else if(chk1.isSelected() == true)
				{
					bill+= chicken_sandwich;
				}
			}
		});
		
		chk2.setOnAction(new EventHandler<ActionEvent>()		//If bagel button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				if(chk2.isSelected() != true)
				{
					bill-= bagel;			
				}
				else if(chk2.isSelected() == true)
				{
					bill+= bagel;			
				}
			}									
		});
		
		chk3.setOnAction(new EventHandler<ActionEvent>() 	//If potato salad button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				if(chk3.isSelected() != true)
				{
					bill-= potato_salad;			
				}
				else if(chk3.isSelected() == true)
				{
					bill+= potato_salad;			
				}
			}			
		});
		
		opt1.setOnAction(new EventHandler<ActionEvent>()	//If black tea button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				if(opt1.isSelected() != true)
				{
					bill-= black_tea;			
				}
				else if(opt1.isSelected() == true)
				{
					bill+= black_tea;			
				}
			}			
		});
		
		opt2.setOnAction(new EventHandler<ActionEvent>()	//If green tea button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0) 
			{	
				if(opt2.isSelected() != true)
				{
					bill-= green_tea;
			
			    }
				else if(opt2.isSelected() == true)
			    {
					bill+= green_tea;
				  
			    }
			}			
		});
		
		opt3.setOnAction(new EventHandler<ActionEvent>()	//If coffee button is selected then setting the action	
		{	
			@Override
			public void handle(ActionEvent arg0) 
			{
				if(opt3.isSelected() != true)
				{
					bill-= coffee;			
			    }
				else if(opt3.isSelected() == true)
			    {
					bill+= coffee;				  
			    }
			}			
		});
		
		opt4.setOnAction(new EventHandler<ActionEvent>()	//If orange juice button is selected then setting the action	
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				if(opt4.isSelected() != true)
				{
					bill-= orange_juice;
			    }
				else if(opt4.isSelected() == true)
			    {
					bill+= orange_juice;				  
			    }
			}			
		});
		
		order.setOnAction(new EventHandler<ActionEvent>()	//Setting up the order button
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				ta.clear(); 	//Clearing the bill area first
				ta.appendText("		Bill");
				if(chk.isSelected() == true)		//Printing whatever item is been selected 
				{
					ta.appendText("\nEgg Sandwich: $7.99");
				}
				if(chk1.isSelected() == true)
				{
					ta.appendText("\nChicken Sandwich: $9.99");
				}
				if(chk2.isSelected() == true)
				{
					ta.appendText("\nBagel: $2.50");
				}
				if(chk3.isSelected() == true)
				{
					ta.appendText("\nPotato Salad: $4.49");
				}
				if(opt1.isSelected() == true)
				{
					ta.appendText("\nBlack Tea: $1.25");
				}
				if(opt2.isSelected() == true)
				{
					ta.appendText("\nGreen Tea: $0.99");
				}
				if(opt3.isSelected() == true)
				{
					ta.appendText("\nCoffee: $1.99");
				}
				if(opt4.isSelected() == true)
				{
					ta.appendText("\nOrange Juice: $2.25");
				}
				ta.appendText("\nTotal before Tax: "+Double.toString(bill)); //Printing the bill without tax
			}			
		});
		
		cancel.setOnAction(new EventHandler<ActionEvent>() //Setting the cancel button
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				opt1.setSelected(false); 		//If cancel button is pressed then deselecting whatever was selected.
				opt2.setSelected(false);
				opt3.setSelected(false);
				opt4.setSelected(false);
				chk.setSelected(false);
				chk1.setSelected(false);
				chk2.setSelected(false);
				chk3.setSelected(false);
				ta.clear();
				while(bill != 0)
				{
					bill = 0;
					break;
				}				
			}			
		});
		
		confirm.setOnAction(new EventHandler<ActionEvent>()		//Setting the confirm button
		{
			@Override
			public void handle(ActionEvent arg0) 
			{
				ta.clear();				//Clearing the text area
				ta.appendText("		Bill");
				if(chk.isSelected() == true)				//Printing whatever item is been selected 
				{
					ta.appendText("\nEgg Sandwich: $7.99");
				}
				if(chk1.isSelected() == true)
				{
					ta.appendText("\nChicken Sandwich: $9.99");
				}
				if(chk2.isSelected() == true)
				{
					ta.appendText("\nBagel: $2.50");
				}
				if(chk3.isSelected() == true)
				{
					ta.appendText("\nPotato Salad: $4.49");
				}
				if(opt1.isSelected() == true)
				{
					ta.appendText("\nBlack Tea: $1.25");
				}
				if(opt2.isSelected() == true)
				{
					ta.appendText("\nGreen Tea: $0.99");
				}
				if(opt3.isSelected() == true) 
				{
					ta.appendText("\nCoffee: $1.99");
				}
				if(opt4.isSelected() == true)
				{
					ta.appendText("\nOrange Juice: $2.25");
				}
				ta.appendText("\nTotal with Tax: "+Double.toString((bill + (bill * 7)/100)));	//Printing the final bill
			}			
		});
		
		Scene a = new Scene(grid_gap);		//Creating a scene	
		primaryStage.setWidth(500);		//setting up the width
		primaryStage.setHeight(500);	//Setting the height
		primaryStage.setScene(a);
		primaryStage.show();
    }   
}