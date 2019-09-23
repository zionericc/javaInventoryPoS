# Java - PoS Inventory Management Desktop Application using mySQL Database with Printer Integration

- [x] Local Network functionality
- [ ] Online functionality (Ongoing)

### Overview

PoS Inventory Management Application made in Java using mySQL as database with Printer Integration (ESC/P). XAMPP is used for handling the mySQL database using phpMyAdmin. JDBC is used to connect java to the database.

This application has 6 main parts:

1. Login
2. Input
3. Inventory
4. Transactions
5. PoS Receipt
6. PoS Printer Integration

### Login

Basic login page which can separate from Admin accounts and User accounts depending on the inputted username.

![login](https://user-images.githubusercontent.com/37270236/65409407-3d45a080-de1a-11e9-9809-04b662b3eceb.PNG)

* If admin login, the app goes to the Inventory UI which has options for managing the inventory.
* If user login, the app goes straight to the PoS Receipt UI.

### Input

Input page to add products into the inventory.

![input](https://user-images.githubusercontent.com/37270236/65409459-577f7e80-de1a-11e9-80d8-91481320dbce.PNG)

* Can check for wrong input syntax and prevents from inserting into database.

### Inventory

Inventory page to monitor stocks and their other properties.

![inventory](https://user-images.githubusercontent.com/37270236/65409448-53536100-de1a-11e9-8db3-13d67cae6be6.PNG)

* Serves as the main navigation UI for other admin functions.

### Transactions

Transcations page to monitor incoming and outgoing transactions.

![transout](https://user-images.githubusercontent.com/37270236/65409453-55b5bb00-de1a-11e9-9116-21009889d703.PNG)

* Can toggle to show only incoming or only outgoing transactions.

### PoS Receipt

PoS Receipt page to execute PoS functions.

![print](https://user-images.githubusercontent.com/37270236/65409461-59494200-de1a-11e9-8f45-0aab5eae6956.PNG)

* Allows printing to an external compatible ESC/P printer.

### PoS Printer Integration

Used [ESCPrinter](https://github.com/drayah/escprinter/blob/master/net/drayah/matrixprinter/ESCPrinter.java) which allowed the application to be able to print to an ESC/P compatible printer.

* Added functions to allow doubling the height and width of the font.

```java
public void centerText() {
    pstream.print(ESC);
    pstream.print(a);
    pstream.print(1);
}
    
public void leftJustify() {
    pstream.print(ESC);
    pstream.print(a);
    pstream.print(0);
}

/* decimal ascii values for epson ESC/P commands */
private static final char a = 97; // justification
```

* Added functions to allow manipulating text alignment (Left Justify, Center).

```java
public void doubleWidthOn() {
    pstream.print(ESC);
    pstream.print(W);
    pstream.print(1);
}
    
public void doubleWidthOff() {
    pstream.print(ESC);
    pstream.print(W);
    pstream.print(0);
}
    
public void doubleHeightOn() {
    pstream.print(ESC);
    pstream.print(w);
    pstream.print(1);
}
    
public void doubleHeightOff() {
    pstream.print(ESC);
    pstream.print(w);
    pstream.print(0);
}

/* decimal ascii values for epson ESC/P commands */
private static final char w = 119; //setting double height
private static final char W = 87; //setting double width
```
