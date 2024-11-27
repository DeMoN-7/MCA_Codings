// i) Static Nested Class
// Situation: A utility helper class that processes configuration settings in a static context.
// Reason: Static nested classes do not need an instance of the enclosing class, making them efficient
// for such tasks. Other nested types would fail because they need an enclosing class instance.
// Code Example:
// java
// Copy code
// class Config {
//  static class Helper {
//  static void printConfig() {
//  System.out.println("Static Nested Class: Helper is processing configuration.");
//  }
//  }

//  void execute() {
//  // Helper works independently
//  Helper.printConfig();
//  }
// }
// // Demonstrating errors
// // Non-static nested and anonymous inner classes require an instance of Config.
// Why Others Fail:
// Non-static nested class requires an instance of the enclosing class, leading to inefficiency.
// Local inner and anonymous classes cannot be used in a global context where a static class fits better.
// (ii) Local Inner Class
// Situation: Processing localized transactions inside a method.
// Reason: Local inner classes are confined to the method scope, making them ideal for temporary
// behavior.
// Code Example:
// java
// Copy code
// class TransactionProcessor {
//  void processTransaction() {
//  class TransactionLogger {
//  void log(String message) {
//  System.out.println("Transaction Log: " + message);
//  }
//  }
//  TransactionLogger logger = new TransactionLogger();
//  logger.log("Transaction started.");
//  logger.log("Transaction completed.");
//  }
// }
// // Demonstrating errors
// // Static nested and non-static nested classes are too broad in scope for temporary, method-specific
// behavior.
// Why Others Fail:
// Static nested and non-static nested classes cannot access method-local variables.
// Anonymous classes are less readable for method-specific repeated logic.
// (iii) Anonymous Inner Class
// Situation: Implementing a one-time button click listener.
// Reason: Anonymous inner classes enable quick and concise implementation of an interface or
// abstract class.
// Code Example:
// java
// Copy code
// interface ClickListener {
//  void onClick();
// }
// class Button {
//  void setClickListener(ClickListener listener) {
//  listener.onClick();
//  }
// }
// public class Main {
//  public static void main(String[] args) {
//  Button button = new Button();
//  button.setClickListener(new ClickListener() {
//  @Override
//  public void onClick() {
//  System.out.println("Button clicked!");
//  }
//  });
//  }
// }
// // Demonstrating errors
// // Static and non-static nested classes require boilerplate code for single-use listeners.
// Why Others Fail:
// Static nested and non-static nested classes require additional code and are overkill for single-use
// implementations.
// Local inner classes are less concise for such ad-hoc functionality. 

public class q1 {

    public static void main(String[] args) {
        
    }
}