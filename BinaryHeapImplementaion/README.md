# GeekforGeeksHeap

                                How to Insert in Binary Heap.
Insert Number 12 in Binary Heap. Given the following Binary Tree.

                                10
                              /   \
                            20      15        insert 12.
                          /  \     /  \
                        40   50  100    25
                        /
                      45

                      solution

                                10                            10                                10                      10
                              /   \                          /    \                           /    \                  /    \
    insert 12.             20      15        =====>         20      15          ====>        20     15   ===>        12     15   
                          /  \     /  \                   /  \      /  \                   /   \    /  \            /  \    /  \
                        40   50  100    25              40    50  100   25               12    50  100  25        20   50  100  25
                        /                             /   \                             /  \                     /  \
                      45                            45     12                          45   40                  45  40

 Binary Heap  to Array    [10,12,15,20,50,100,25,45,40]

 right => 2(i) + 1                           left => 2(i) + 2                     parent => (i -1)/2
 right => 2(0) + 1 = 1                       left => 2(0) + 2 = 2                 parent => (1 - 1) /2 = 0
 right => 2(1) + 1 = 3                       left => 2(1) + 2 = 4
 right => 2(2) + 1 = 5                       left => 2(2) + 2 = 6
 right => 2(3) + 1 = 7                       left => 2(3) + 2 = 8

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

