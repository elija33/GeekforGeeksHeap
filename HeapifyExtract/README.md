# GeekforGeeksHeap

                                Binary Heap (Heapify and Extract) Implementation

Given a Binary heap with one possible violation, fix the heap.

              40                            20                    20
           /     \                       /     \                /     \
        20        30      ===>         40       30    ===>    25        30
      /   \     /    \               /    \    /   \        /    \     /   \
    35    25  80      32          35      25  80    32    35      40  80    32
  /   \   /                     /   \    /              /   \    / 
100   70  60                 100    70  60           100    70   60

Binary heap to Array = [-,25,30,35,40,80,32,100,70,60]

left = 2(i) + 1
left(0) ==> 2(0) + 1 = 1
left(1) ==> 2(1) + 1 = 3
left(2) ==> 2(2) + 1 = 5
left(3) ==> 2(3) + 1 = 7

right ==> 2(i) + 2 
right ==> 2(0) + 2 = 2
right ==> 2(1) + 2 = 4
right ==> 2(2) + 2 = 6
right ==> 2(3) + 2 = 8