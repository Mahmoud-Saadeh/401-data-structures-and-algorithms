# Stacks and Queues
**Stack** is a container of objects that are inserted and removed according to the last-in first-out (LIFO) principle. **Queue** is a container of objects (a linear collection) that are inserted and removed according to the first-in first-out (FIFO) principle.

## Challenge
Create a Stack, and a Queue that have the top properties.

## Approach & Efficiency
All the methods in the [Stack](src/main/java/stackAndQueue/Stack.java) and [Queue](src/main/java/stackAndQueue/Queue.java) classes are of a big O(1) time complexity

## API

1. in the [Stack](src/main/java/stackAndQueue/Stack.java) file I have 5 methods:
    - push: to add a new node to the top of the stack
    - pop: to delete the top node of the stack and return it
    - peek: to see the top node value
    - isEmpty: return if the stack is empty (true) or not empty (false)
    - toString: to return a nice formatted string of all the nodes in the stack

1. in the [Queue](src/main/java/stackAndQueue/Queue.java) file I have 5 methods:
    - enqueue: to add a new node to the end of the queue
    - dequeue: to delete the first node of the queue and return it
    - peek: to see the first node value
    - isEmpty: return if the queue is empty (true) or not empty (false)
    - toString: to return a nice formatted string of all the nodes in the queue
