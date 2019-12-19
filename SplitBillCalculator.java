/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Lab Exercise - 11/14/19                 \
Split Bill Calculator                   /    
--------------------------------------  \
*/

import javafx.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import java.text.NumberFormat;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class SplitBillCalculator extends Application{


    @Override
    public void start(Stage primaryStage){

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setHgap(12);
        grid.setVgap(12);


        Scene s1 = new Scene(grid, 500, 500);
        primaryStage.setTitle("Split Bill Calculator"); 
        primarystage.setTitle("Split Bill Calculator");
        primarystage.setScene(scene);
        primarystage.show();


         /* F I E L D S */ 

            /* Bill Section */ 
            Label Bill = new Label("Bill:");
            grid.add(Bill, 0, 1);
            final TextField BillAmount = new TextField();
            grid.add(BillAmount, 1, 1);
        
            /* Sales Tax Section */
            Label SalesTax = new Label("Sales Tax:");
            grid.add(SalesTax, 0, 2);
            final TextField SalesTaxAmount = new TextField();
            grid.add(SalesTaxAmount, 1, 2);

            /* Split Section */ 
            Label Split = new Label("Split:");
            grid.add(Split, 0, 3);
            final TextField SplitAmount = new TextField();
            grid.add(SplitAmount,  1, 3);

        /* O U T P U T  */ 
            Label message = new Label("");
            message.setWrapText(true);
            message.setPrefWidth(300);
            message.setWrapText(true);
            grid.add(message, 1, 4);


        /* B U T T O N S */ 

             /* Calculate Bill Button */
            Button calc = new Button("Calculate Total");
            HBox calcbox = new HBox(15);
            calcbox.setAlignment(Pos.BOTTOM_CENTER);
            calcbox.getChildren().add(calc);
            grid.add(calcbox, 1, 5);
            EventHandler<ActionEvent> calcEvent = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent calcit) 
            {  
             
                try{ Double.parseDouble(salesTaxAmount.getText()); } 
                catch (NumberFormatException e){ 
                message.setText("Error. Enter Only Numeral Value in Fields");
                }
                try{ Double.parseDouble(billAmount.getText()); } 
                catch (NumberFormatException b){ 
                message.setText("Error. Enter Only Numeral Value in Fields");
                }
                try{ Double.parseDouble(splitAmount.getText()); } 
                catch (NumberFormatException b){ 
                message.setText("Error. Enter Only Numeral Value in Fields");
                }

                double tax =(((Double.parseDouble(billAmount.getText()))*(Double.parseDouble(salesTaxAmount.getText())))/100);
                
                double aftertax;
                aftertax = (Double.parseDouble(billAmount.getText()) + tax);
                
                double split;
                split =(Double.parseDouble(splitAmount.getText()));
                
                double splitamount;
                splitamount =(aftertax / split);
                
                if(split > 0){ 
                message.setText("The total bill amount after tax is: " + currency.format(aftertax)
                + ". Split " + split + " ways is " + currency.format(splitamount)
                ); }
                else { message.setText("Arithmetic Error. Split cannot be zero"); } 
            } 
         }; 
            calc.setOnAction(calcEvent);
            
        
            /* Clear Button */
            Button clear = new Button("Clear");
            HBox clearbox = new HBox(15);
            clearbox.setAlignment(Pos.BOTTOM_CENTER);
            clearbox.getChildren().add(clear);
            grid.add(clearbox, 1, 6);
            EventHandler<ActionEvent> clearEvent = new EventHandler<ActionEvent>() { 
                public void handle(ActionEvent clearit) 
                { 
                 splitAmount.setText("");
                 salesTaxAmount.setText("");
                 billAmount.setText("");
                 
                } 
            }; 
            clear.setOnAction(clearEvent);
            
        
            /* Exit Button */ 
            Button exit = new Button("Exit");
            HBox exitbox = new HBox(15);
            exitbox.setAlignment(Pos.BOTTOM_CENTER);
            exitbox.getChildren().add(exit);
            grid.add(exitbox, 1, 7);
            EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() { 
                public void handle(ActionEvent e) 
                { 
                    stage.close(); 
                } 
            }; 
            exit.setOnAction(event);

    } /* End start method */ 



    public static void main(String[]args){

        launch(args); 

    }

} /* End SBCextApp */ 
