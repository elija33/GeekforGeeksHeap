# GeekforGeeksHeap

                                How to Binary Heap Implementation.
Cretea a class
  Need the size of the Heap.
  Array of the heap, because heap is represent as array
  the capacity.

  Constructor(int c){
    set the capacity to c;
    set the size to 0;
    set new array to c. "Heap = new int[c];
  }

  LeftMethod

  int left(int i){
    return (2 * i + 2);
  }

  Right Method

  int right(int i){
    return (2 * i + 1);
  }

  Parent Method

  int parent(int i){
    return (i - 1) / 2;
  }

