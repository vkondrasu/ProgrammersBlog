# JavaScript

## Closures

The ability to treat functions as values combined with the fact that local binding are re-created every time a function is called, brings up an interesting question.
Closure - being able to reference a specific instance of a local binding in an enclosing scope. MM: Think functions as values with code in their body and the environment in which they are created.

## Pure functions
Specific kind of value producing function that not only produces no side-affects but doesn't rely on side effects from other code, for exapmple it doesn't read global bindings whose values might change.

## Factory functions
Any function which is not a class or constructor that returns (presumably new) a object. In javascript any function can return a object when it does without a 'new' keyword it is a factory function. The offer the ability to produce a new object without diving into the complexities of class and new keyword.

## Arrow functions
Arrow functions have implicit return feature.

## Type inference 
Is the process of inferring types based on the context in which they are used.

## ES6 var, let and const

var - can be redefined and re-assigned

var nameVar = 'hello';
var nameVar = 'hi';
nameVar = 'bye';

All the above statements are perfectly valid.

let - can be re-assigned but can't be redefined.

let nameLet = 'hello';
let nameLet = 'hi'; // This is invalid
nameLet = 'bye'; // valid

const - can't be redefined, can't re-assigned.

const nameConst = 'VK';
nameConst = 'venkat'; // invalid
const nameConst = 'kondrasu'; //invalid

what about scope???

## ES6 arrow functions

If we have a function that simply returns a a single expression then that can be written with ... expression syntax.

fuction square(x){
  return x*x;
  }
  
  with arrow function syntax this cane be
  
  cost square = (x) => x*x;
  
###  'arguments' object no longer bound with aroow functions

const add = function(a,b){
    console.log(arguments);
    return a+b;
};
console.log(add(12,34));

the above code outputs
Arguments(2) [12, 34, callee: ƒ, Symbol(Symbol.iterator): ƒ]
46

but with arrow function it results in - 'arguments' not defined.

Uncaught ReferenceError: arguments is not defined
    at add (<anonymous>:2:17)
    at <anonymous>:5:13
  
  
#### 'this' key word no longer bound with arrow functions

let user = {
    name: 'Venkat',
    places: ['Hyderabad','Prakasam','Vijayawada','Gobburu'],
    placesLived: function(){
        console.log(this.name);

        this.places.forEach(function(city){
            console.log(`${this.name} has lived in ${city}`);
        })
    }
};

user.placesLived();

this code produces

Venkat
has lived in Hyderabad
has lived in Prakasam
has lived in Vijayawada
has lived in Gobburu

but when we change line this.places.forEach(function(city){ to this.places.forEach((city) => {

the same produces

Venkat
Venkat has lived in Hyderabad
Venkat has lived in Prakasam
Venkat has lived in Vijayawada
Venkat has lived in Gobburu

# ReactJS

Passing props is how information flows in React apps, from parents to children.

By calling the this.setState(), we tell React to re-render the component. When you call setState in a component, React automatically updates the child components inside of it too.

In React, function components are a simpler way to write components that only contain a render method and don’t have their own state. Instead of defining a class which extends React.Component, we can write a function that takes props as input and returns what should be rendered. Function components are less tedious to write than classes, and many components can be expressed this way.




