You can't create an array of parameterized type.

ArrayList<Integer>[] edges = new ArrayList<Integer>()[4]; //This is not allowed.

Instead you can declare an ArrayList of ArrayList<Integer>

ArrayList < ArrayList<Integer> > edges = new ArrayList< ArrayList<Integer> >(4);
  
  # java.library.path – What is it and how to use
  
  https://examples.javacodegeeks.com/java-basics/java-library-path-what-is-it-and-how-to-use/
  
  # java.lang.unsatisfiedlinkerror – How to handle Unsatisfied Link Error
  
  https://examples.javacodegeeks.com/java-basics/exceptions/java-lang-unsatisfiedlinkerror-how-to-handle-unsatisfied-link-error/
