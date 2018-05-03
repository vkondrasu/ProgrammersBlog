You can't create an array of parameterized type.

ArrayList<Integer>[] edges = new ArrayList<Integer>()[4]; //This is not allowed.

Instead you can declare an ArrayList of ArrayList<Integer>

ArrayList < ArrayList<Integer> > edges = new ArrayList< ArrayList<Integer> >(4);
