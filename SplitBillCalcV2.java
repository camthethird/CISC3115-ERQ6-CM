/*
--------------------------------------  \
Clifton McDonald                        /
CUNY - Brooklyn College                 \ 
CISC. 3115-ERQ6                         /
Lab Exercise - 11/21/19                 \
Split Bill Calculator 2.0               /    
--------------------------------------  \
*/

//package org.demo 

import java.text.NumberFormat;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SplitBillCalcV2 extends Application{


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

            /* Check Amount Section */
            Label Bill = new Label("Check Amount:");
            Bill.setMinSize(100, 0);
            grid.add(Bill, 0, 1);
            final TextField billAmount = new TextField();
            billAmount.setMaxWidth(100);
            grid.add(billAmount, 1, 1);
        
            /* Final Amount Section */
            Label Total = new Label("Total:");
            Total.setMinSize(100, 0);
            grid.add(Total, 0, 7);
            final TextField totalAmount = new TextField();
            totalAmount.setMaxWidth(100);
            grid.add(totalAmount, 1, 7);
        
            /* Amount Per Person */
            Label Amountpp = new Label("Amount Per Person:");
            Amountpp.setMinSize(150, 0);
            grid.add(Amountpp, 0, 8);
            final TextField amountPP = new TextField();
            amountPP.setMaxWidth(100);
            grid.add(amountPP, 1, 8);
        
            /* Sales Tax Section */
            Label SalesTax = new Label("Sales Tax:");
            SalesTax.setMinSize(100, 0);
            grid.add(SalesTax, 0, 2);
            final TextField salesTaxAmount = new TextField();
            salesTaxAmount.setPrefWidth(10);
            salesTaxAmount.setMaxWidth(100);
            grid.add(salesTaxAmount, 1, 2);

            /* Tip Section */ 
            Label Tip = new Label("Tip % :");
            Tip.setMinSize(100, 0);
            grid.add(Tip, 0, 3);
            final ComboBox tipComboBox = new ComboBox();
            tipComboBox.getItems().addAll(
                "5%",
                "10%",
                "15%",
                "20%",
                "25%",
                "30%" 
            );
            grid.add(tipComboBox, 1, 3);
            tipComboBox.setValue("5%");

            /* Split Section */ 
            Label Split = new Label("Split:");
            grid.add(Split, 0, 4);
            Spinner<Integer> splitSpinner = new Spinner<>(1, 100, 1);
            splitSpinner.setMaxWidth(100);
            grid.add(splitSpinner, 1, 4);

        /* O U T P U T  */ 
            Label message = new Label("");
            message.setWrapText(true);
            message.setPrefWidth(300);
            message.setWrapText(true);
            grid.add(message, 1, 5);


        /* B U T T O N S */ 

             /* Calculate Bill Button */
             Button calc = new Button("Calculate");
             HBox calcbox = new HBox(15);
             // calcbox.setAlignment(Pos.BOTTOM_LEFT);
             calcbox.setMinSize(50, 0);
             calcbox.getChildren().add(calc);
             grid.add(calcbox, 0, 6);
            EventHandler<ActionEvent> calcEvent = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent calcit) 
            {  
             
                try{ Double.parseDouble(salesTaxAmount.getText().toString().replace("%","")); } 
                catch (NumberFormatException e){ 
                message.setText("Error. Enter Numeral Value in Fields");
                }
                try{ Double.parseDouble(billAmount.getText()); } 
                catch (NumberFormatException b){ 
                message.setText("Error. Enter Numeral Value in Fields");
                }
                try{ Integer.parseInt(splitSpinner.getValue().toString()); } 
                catch (NumberFormatException b){ 
                message.setText("Error. Spinner Error ");
                }
                try{ Double.parseDouble(tipComboBox.getValue().toString().replace("%", "")); }
                catch (NumberFormatException c){
                   message.setText("Error."); 
                }
                
                
                
                double tax =(((Double.parseDouble(billAmount.getText()))*(Double.parseDouble(salesTaxAmount.getText().replace("%", ""))))/100);
                
                double aftertax;
                aftertax = (Double.parseDouble(billAmount.getText()) + tax);
                
                int split;
                split = Integer.parseInt(splitSpinner.getValue().toString());
                
                double tip;
                tip = Double.parseDouble(tipComboBox.getValue().toString().replace("%", ""));
                
                double tipandtax;
                tipandtax = (aftertax * tip/100);
                
                double finalbill;
                finalbill = (aftertax + tipandtax);
                
                double splitamount;
                splitamount =(finalbill / split);
                
                
                if(split > 0){ 
                /* message.setText("The total bill amount after tax is: " + currency.format(aftertax)
                + ". Split " + split + " ways is " + currency.format(splitamount)
                ); */
               
                amountPP.setText(currency.format(splitamount));
                totalAmount.setText(currency.format(finalbill));
                
                }
                else { message.setText("Arithmetic Error. Split cannot be zero"); } 
            } 
         }; 
            
        calc.setOnAction(calcEvent);
            
        
            /* Clear Button */
            Button clear = new Button("Clear");
            HBox clearbox = new HBox(15);
            clearbox.setMinSize(50, 0);
            //clearbox.setAlignment(Pos.BOTTOM_CENTER);
            clearbox.getChildren().add(clear);
            grid.add(clearbox, 1, 6);
            EventHandler<ActionEvent> clearEvent = new EventHandler<ActionEvent>() { 
            public void handle(ActionEvent clearit) 
            { 
             salesTaxAmount.setText("");
             billAmount.setText("");
             amountPP.setText("");
             totalAmount.setText("");
             tipComboBox.setValue("5%"); 
            } 
        }; 
        clear.setOnAction(clearEvent);
            
        
            /* Exit Button */ 
            Button exit = new Button("Exit");
            HBox exitbox = new HBox(15);
            exitbox.setMinSize(50, 0);
            // exitbox.setAlignment(Pos.BOTTOM_RIGHT);
            exitbox.getChildren().add(exit);
            grid.add(exitbox, 2, 6);
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

} /* End Split Bill V2 */ 
