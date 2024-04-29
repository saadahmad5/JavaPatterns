# 23 Design Patterns - The Gang of Four

### Structural Patterns:
1. Adapter Pattern
* The Adapter Pattern is useful when you want to make two incompatible interfaces work together. It acts as a bridge between two incompatible interfaces by wrapping an existing class with a new interface. This pattern is particularly handy when you have existing code or libraries that you want to use, but their interfaces are not compatible with the rest of your system.
2. Bridge Pattern:
* The Bridge Pattern is useful when you want to separate abstraction (an interface) from implementation (concrete classes), allowing them to vary independently. This pattern is particularly handy when you have a complex system with multiple dimensions of variation, and you want to avoid a permanent binding between an abstraction and its implementation.
3. Composite Pattern:
* The Composite Pattern is useful when you have a tree-like structure of objects, and you want to treat individual objects and compositions of objects uniformly. This pattern is particularly handy when you need to represent part-whole hierarchies and clients need to work with both individual objects and compositions of objects in a consistent manner.
4. Decorator Pattern:
* The Decorator Pattern is useful when you want to add new functionality to an object dynamically without altering its structure. This pattern involves a set of decorator classes that are used to wrap concrete components. Decorators enhance the behavior of objects in a flexible and reusable way.
5. Facade Pattern:
* The Facade Pattern is useful when you want to provide a simplified, unified interface to a set of interfaces in a subsystem, making it easier for clients to interact with the system. It involves creating a higher-level interface that encapsulates the complexities of interacting with multiple subsystem components.
6. Flyweight Pattern: 
* The Flyweight Pattern is useful when you need to manage a large number of similar objects efficiently by sharing as much as possible among them. It is particularly beneficial when dealing with objects that have significant intrinsic (invariant) state, and where the extrinsic (variant) state can be managed separately. 
* Per my experience, We create a new combiner class having both intrinsic and extrinsic objects to store them in a collection. 
* Per my experience, turns out flyweight and factory patterns go hand-in-hands as flyweight is used when we have large number of similar objects and factory method helps to generate those objects.
7. Proxy Pattern:
* The Proxy Pattern is useful when you want to control access to an object, add some behavior before or after accessing the object, or provide a substitute for the actual object. This pattern involves creating a surrogate or placeholder for another object to control access to it.


### Creational Patterns:
1. Builder Pattern:
* The Builder Pattern is useful when you need to create a complex object with many optional components, and you want to ensure that the construction process is both clear and independent of the representation of the final object. It provides a way to construct a complex object step by step, allowing you to vary its representation and construction process.
2. Singleton Pattern:
* The Singleton Pattern is useful when you want to ensure that a class has only one instance, and provide a global point of access to that instance. This pattern is commonly used when exactly one object is needed to coordinate actions across the system, such as managing a shared resource or providing a central point for configuration settings.
3. Factory Method Pattern:
* The Factory Pattern is useful when you need to create objects without specifying the exact class of the object that will be created. It provides an interface for creating instances of a class, but the specific class to be instantiated is determined by the factory method. This pattern is particularly helpful when you want to centralize the object creation logic, decouple the client code from the concrete classes, and allow for easy extension with new classes.
4. Prototype Pattern:
* The Prototype Pattern is useful when you want to create new objects by copying an existing object, known as the prototype, rather than creating them from scratch. This pattern is particularly beneficial when the cost of creating a new object is more expensive than copying an existing one, and the object initialization process is complex or involves resources that should be shared.
5. Abstract Factory Method Pattern:
* The Abstract Factory Pattern is useful when you need to create families of related or dependent objects without specifying their concrete classes. It provides an interface for creating families of related or dependent objects without specifying their concrete classes. This pattern is especially beneficial when you want to ensure that the created objects are compatible and follow a common theme.


### Behavioral Patterns:
1. Chain of Responsibility Pattern:
* The Chain of Responsibility Pattern is useful when you want to decouple the sender of a request from its receiver by giving more than one object a chance to handle the request. It allows multiple objects to handle the request without the sender needing to know which object ultimately handles it. This pattern is especially beneficial when you have a series of processing steps and want to determine dynamically which object will handle each request.
2. Command Pattern
* The Command Pattern is useful in scenarios where you want to decouple the sender of a request from the object that executes the request, allowing for greater flexibility, extensibility, and abstraction in command invocation.
3. Interpreter Pattern
* The Interpreter Pattern is useful when you have a language to interpret, such as a scripting language or a domain-specific language (DSL), and you want to build a grammar, parse expressions in that language, and execute them. This pattern is beneficial when you need to interpret and evaluate sentences or expressions represented in a formal language.
4. Iterator Pattern
* The Iterator Pattern is useful when you want to traverse through the elements of a collection without exposing its underlying representation. It provides a way to access the elements of an aggregate object sequentially without exposing its internal structure. 
* Useful when iterator is traversing over objects with certain attributes to filter out.
5. Mediator Pattern
* The Mediator Pattern promotes loose coupling between objects by centralizing communication between them through a mediator object. In this pattern, instead of objects directly communicating with each other, they communicate through the mediator, which facilitates their interactions. This helps reduce the dependencies between objects and makes the system easier to maintain and extend. 
6. Momento Pattern
* This pattern is commonly used when we need to implement undo functionality, rollback mechanisms, or snapshotting in an application. It helps separate concerns by keeping the state management logic separate from the object itself.
7. Observer Pattern
* The Observer Pattern establishes a one-to-many dependency between objects, such that when one object (the subject) changes state, all its dependents (observers) are notified and updated automatically. This pattern promotes loose coupling between objects, allowing them to communicate without needing to know each other's concrete implementations.
8. State Pattern
* The State Pattern allows an object to change its behavior when its internal state changes. This pattern is particularly useful when an object needs to alter its behavior dynamically based on its internal state, without resorting to a large number of conditional statements.
9. Strategy Pattern
* The Strategy Pattern is useful in situations where there are multiple algorithms or behaviors that need to be encapsulated and made interchangeable. It promotes flexibility, maintainability, and extensibility by allowing algorithms to vary independently from the clients that use them.
10. Template Pattern
* The Template Method Pattern is useful in situations where there is a common algorithmic structure that can be reused across multiple implementations, with the flexibility to customize or extend certain parts of the algorithm as needed. It promotes code reuse, modularity, and maintainability by providing a common interface for implementing algorithms with varying behaviors.
11. Visitor Pattern
* The Visitor Pattern is useful in situations where there is a complex object structure that needs to be traversed and processed by different algorithms or operations. It promotes separation of concerns, modularity, and extensibility by allowing new operations to be added to the object structure without modifying its classes.