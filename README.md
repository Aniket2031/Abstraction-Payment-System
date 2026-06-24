# Payment Gateway System using Java

This is a simple Java OOP example demonstrating the concept of Abstraction.

## Concepts Used
- Abstraction
- Inheritance
- Method Overriding
- Runtime Polymorphism

## Project Structure

- Payment (Abstract Class)
- UPI
- CreditCard
- NetBanking
- Main

## How It Works

The `Payment` abstract class defines an abstract method `pay(double amount)`.

Different payment methods such as:
- UPI
- Credit Card
- Net Banking

provide their own implementation of the `pay()` method.

## Sample Output

```text
Pay amount of 50000 Rs using UPI
Pay amount of 24000 Rs using Credit Card
Pay amount of 30000 Rs using Net Banking
