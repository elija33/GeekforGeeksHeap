# GeekforGeeksHeap

                                Binary Heap Implementation
Used in Heap Sort.
Used to implement Priority Queue.
Two Types
    - Min Heap (Highest Priority item is assigned lowest value).
    - Max Heap (Highest Priority item is assigned highest value).

left(i) = 2i + 1
right(i) = 2i + 2.
parent(i) = [i - 1 /2].

                                                    Min Heap.
Complete Binary Tree
Every node has value smaller than its descendants.


left(i) = 2i + 1
right(i) = 2i + 2.
parent(i) = [i - 1 /2].

                            2              left = 2(i) + 1
                           / \              right = 2(3) + 2 = 8
                          4   8             parent(i) = 0 - 1
                         / \  / \
                       6   5  9   10
                     /  \
                  100   200
                  
The Array of the binary tree.
[2,4,8,6,5,9,10,100,200]
