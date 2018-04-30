# ProgrammersBlog
Notes

#lower_bound

Returns an iterator pointing to the first element in the range [first,last) which does not compare less than val.

The elements are compared using operator< for the first version, and comp for the second. The elements in the range shall already be sorted according to this same criterion (operator< or comp), or at least partitioned with respect to val.

The function optimizes the number of comparisons performed by comparing non-consecutive elements of the sorted range, which is specially efficient for random-access iterators.

Unlike upper_bound, the value pointed by the iterator returned by this function may also be equivalent to val, and not only greater.

#example

// lower_bound/upper_bound example
#include <iostream>     // std::cout
#include <algorithm>    // std::lower_bound, std::upper_bound, std::sort
#include <vector>       // std::vector

int main () {

  int myints[] = {10,20,30,30,20,10,10,20};
  std::vector<int> v(myints,myints+8);           // 10 20 30 30 20 10 10 20

  std::sort (v.begin(), v.end());                // 10 10 10 20 20 20 30 30

  std::vector<int>::iterator low,up;
  low=std::lower_bound (v.begin(), v.end(), 20); //          ^
  up= std::upper_bound (v.begin(), v.end(), 20); //                   ^

  std::cout << "lower_bound at position " << (low- v.begin()) << '\n';
  std::cout << "upper_bound at position " << (up - v.begin()) << '\n';

  return 0;

}

Difference between regular cast, static_cast and dynamic_cast

static_cast - is used for cases where we want to reverse an implicit conversion, with a few restrictions and additions. static_cast performs no runtime checks. You should use this, if you know that you are referring to an object of specific type and cast is not necessary.

example:

void func(void * data){

MyClass *mc = static_cast<MyClass*>data;
.................
}


int main(){

MyClass c;

start_thread(&func, &c).join();

return 0;

}

