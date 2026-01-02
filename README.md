# Vehicle Management System

##  Project Overview
This project demonstrates a Vehicle Management System using object-oriented programming principles in Java. The system showcases inheritance, abstraction, composition, and aggregation by modeling different vehicle types and their drivers.

##  Class Hierarchy
The abstract class Vehicle serves as the superclass and defines common properties such as brand and year. Car, Motorcycle, and Truck extend Vehicle and override the startEngine() and stopEngine() methods to provide specific behavior. Protected access was used to allow subclass access while maintaining encapsulation.

##  Compile and Run Instructions
javac *.java  
java Main

##  Reflection
Inheritance simplified the design by allowing shared vehicle properties and methods to be defined once in the Vehicle class. This reduced code duplication and made the system easier to extend.

Method overriding allowed each vehicle type to customize its engine behavior while keeping a consistent interface. One challenge was deciding between protected and private access modifiers, as protected allows flexibility but must be used carefully to avoid exposing internal state.
