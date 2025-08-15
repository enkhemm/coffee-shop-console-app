------------------------------------------------------------------------
##PROJECT TITLE:

Coffee Shop Console Application

##PURPOSE OF PROJECT:

This project is a simple Java console application that allows users to order customizable 
coffee and tea drinks. Users can select drink options, review their orders, which are saved and displayed 
using file I/O. It is implied that the user has a coffee machine that is capable of creating any chosen drinks.

##TECHNOLOGIES USED:

Java - Core programming language
File I/O - For order persistence
Object-Oriented Programming - Multiple classes with proper encapsulation
Exception Handling - Input validation, error management

##VERSION or DATE:

Version 1.0  
March 2024

##AUTHORS:

Emmy Tumurbat

##HOW TO START THIS PROJECT:

1. Compile all Java files in your IDE or using the command line:
   javac CoffeeShop.java Menu.java Coffee.java Tea.java Files.java
2. Run the main class:
   java CoffeeShop

##USER INSTRUCTIONS:

When you start the application, follow the prompts to choose and customize your drink.
1. Choose from the following options:
    - Order Coffee: Custmize and order a coffee drink.
    - Order Tea: Customize and order a tea drink.
    - See Options: View available options for coffee and tea.
2. After placiing an order, you can:
    - See your ordered drinks so far.
    - Add another drink
    - Checkout and specify where you want to have your order (at a cafe or at home).
3. After checkout, you can:
    - Specify when you want to pickup your drink, if you chose cafe
    - Choose to have your drink at home.
All orders are saved to "order.txt" and cleared after checkout.
------------------------------------------------------------------------
