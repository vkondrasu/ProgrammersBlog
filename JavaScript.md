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



