## Early and late binding.

Binding refers to the process of converting identifiers into addresses. Binding is done for each variable and functions. For each function, it means matching  call with the right function definition by compiler.  It can take place at compile time or run time.

Early binding: function overloading, operator overloading

Late binding: virtual functions, with the help of virtual key word.

https://www.geeksforgeeks.org/early-binding-late-binding-c/

# STATIC

All the static data is initialized to zero, if no other initializer is present.

# Abastract class

A class is made abstarct by making at least one function as pure virtual function

virtual double getVolume() = 0;

Copy constructor and overloaded = operator

A copy constructor is a member function, which initializes the an object using an existing object of same type.

ClassName(const ClassName & obj);

When is copy constructor callled.

When an object of class type returned by value
When an object of a class type passed as an argument to a function by value
When an object is constrcuted based on another object of the same class
When compiler generates a temporary object.

When user defined copy constructor is required.

By default compiler provides us with a copy constructor, but that does a shallow copying, which creates problems when the class contains member variables related to dynamically allocated resources like memory, file handlers or network connections.


Class vs Staructure

Only difference is default access modifier, struct go with 'public' where as class with 'private'.


Access modifiers



