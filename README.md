# Design Patterns

## What is a Design Pattern?

Design patterns are reusable, well-documented solutions to common software design problems. Rooted in Object-Oriented Programming (OOP) principles, they provide structured approaches to improve scalability, maintainability, and flexibility in software development.

### Key Characteristics
- **Reusable**: Applicable across multiple projects.
- **Lightweight**: Act as guidelines, not rigid implementations.
- **Scalable & Maintainable**: Promote robust and adaptable software.
- **Best Practices**: Represent industry-standard solutions, not plug-and-play code.

## Categories of Design Patterns

Design patterns are grouped into three main categories:

1. **Creational Patterns**: Focus on flexible and reusable object creation mechanisms.
2. **Structural Patterns**: Define how objects and classes are composed for larger, flexible structures.
3. **Behavioral Patterns**: Address communication and interaction between objects.

---

## Creational Patterns

### 1. Singleton Pattern
**Purpose**: Ensures a class has only one instance and provides a global access point to it.

**Key Components**:
- **Private Static Instance**: Stores the single instance as a class-level variable.
- **Private Constructor**: Prevents direct instantiation using `new`.
- **Public Static Method**: Provides controlled access to the single instance.

**Usage Example**:
```java
public class Singleton {
    private static Singleton instance;
    
    private Singleton() {} // Private constructor
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```
**Example Context**: A database connection pool where only one instance is needed to manage connections efficiently.

### 2. Factory Pattern
**Purpose**: Centralizes object creation logic, promoting loose coupling by hiding instantiation details.

**Key Components**:
- **Product Interface**: Defines a common structure for created objects.
- **Concrete Products**: Specific implementations (e.g., `Mustang`, `Audi` for a `Car` interface).
- **Factory Interface**: Declares the method for object creation.
- **Concrete Factories**: Implement the factory interface to instantiate specific products.

**Usage Example**:
```java
interface Car {
    void drive();
}

class Mustang implements Car {
    public void drive() { System.out.println("Driving Mustang"); }
}

class CarFactory {
    public static Car createCar(String type) {
        if ("Mustang".equalsIgnoreCase(type)) {
            return new Mustang();
        }
        return null; // Extend for other types
    }
}
```
**Example Context**: A car manufacturing system where the factory creates different car types based on input.

---

## Structural Patterns

### 3. Facade Pattern
**Purpose**: Simplifies interaction with a complex system by providing a unified interface.

**Key Components**:
- **Subsystems**: Individual components of the system (e.g., TV, DVD Player).
- **Facade**: A single class that simplifies interactions with subsystems.
- **Client**: The application or code using the facade.

**Usage Example**:
```java
class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvd;
    private SoundSystem sound;

    public HomeTheaterFacade(TV tv, DVDPlayer dvd, SoundSystem sound) {
        this.tv = tv;
        this.dvd = dvd;
        this.sound = sound;
    }

    public void watchMovie() {
        tv.turnOn();
        dvd.play();
        sound.setVolume(10);
    }
}
```
**Example Context**: A home theater system where the facade simplifies controlling the TV, DVD player, and sound system for a seamless movie-watching experience.

### 4. Decorator Pattern
**Purpose**: Dynamically adds or modifies object behavior at runtime without altering its structure.

**Key Components**:
- **Component Interface**: Defines core operations.
- **Concrete Component**: Basic implementation of the component.
- **Decorator**: An abstract class implementing the component interface and referencing a component.
- **Concrete Decorators**: Add specific behaviors to the component.

**Usage Example**:
```java
interface MessagingService {
    String sendMessage(String message);
}

class SmsMessagingService implements MessagingService {
    public String sendMessage(String message) { return "SMS: " + message; }
}

abstract class MessagingDecorator implements MessagingService {
    protected MessagingService decoratedService;
    public MessagingDecorator(MessagingService service) {
        this.decoratedService = service;
    }
}

class TimestampDecorator extends MessagingDecorator {
    public TimestampDecorator(MessagingService service) {
        super(service);
    }
    public String sendMessage(String message) {
        return decoratedService.sendMessage(message) + " [Sent at: " + new java.util.Date() + "]";
    }
}
```
**Example Context**: A messaging system where messages are sent via SMS or email, with decorators adding features like timestamps or sender information.

---

## Other Common Patterns

### Creational Patterns
- **Prototype Pattern**: Creates new objects by cloning existing ones.
- **Builder Pattern**: Simplifies complex object creation with multiple configurations.

### Structural Patterns
- **Adapter Pattern**: Allows incompatible interfaces to work together.
- **Bridge Pattern**: Separates abstraction from implementation for independent evolution.
- **Composite Pattern**: Treats individual objects and compositions uniformly.
- **Proxy Pattern**: Controls access to an object, adding functionality like lazy loading or access control.
