# Data Structures and Algorithms in Java

This repository contains basic implementations of common data structures and algorithms in Java. It serves as a learning resource for understanding how these structures and algorithms work and can be used as a reference for coding projects.

## Table of Contents

1. [Introduction](#introduction)
2. [Data Structures](#data-structures)
   - [Stack](#stack)
   - [Queue](#queue)
   - [Circular Queue](#circular-queue)
   - [Binary Tree](#binary-tree)
3. [Algorithms](#algorithms)
   - [Sorting Algorithms](#sorting-algorithms)
   - [Search Algorithms](#search-algorithms)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

## Introduction

This repository provides Java implementations of fundamental data structures and algorithms. Each data structure and algorithm is implemented in a separate file for clarity and ease of use.

## Data Structures

### Stack

A stack is a Last-In-First-Out (LIFO) data structure. The primary operations are:

- `push()`: Add an element to the top of the stack.
- `pop()`: Remove and return the top element of the stack.
- `top()`: Return the top element without removing it.
- `isEmpty()`: Check if the stack is empty.

### Queue

A queue is a First-In-First-Out (FIFO) data structure. The primary operations are:

- `enqueue()`: Add an element to the end of the queue.
- `dequeue()`: Remove and return the front element of the queue.
- `isEmpty()`: Check if the queue is empty.
- `isFull()`: Check if the queue is full.

### Circular Queue

A circular queue is a queue where the end of the queue wraps around to the beginning. This allows efficient use of space. The primary operations are similar to a regular queue with the addition of handling the wrap-around using the modulus operator.

### Binary Tree

A binary tree is a tree data structure where each node has at most two children, referred to as the left child and the right child. The primary operations include:

- `insert()`: Add a node to the tree.
- `inorder()`: Traverse the tree in inorder (left, root, right).
- `preorder()`: Traverse the tree in preorder (root, left, right).
- `postorder()`: Traverse the tree in postorder (left, right, root).

## Algorithms

### Sorting Algorithms

Sorting algorithms arrange elements in a particular order (ascending or descending). Common sorting algorithms include:

- Bubble Sort
- Selection Sort
- Insertion Sort
- Merge Sort
- Quick Sort

### Search Algorithms

Search algorithms are used to find specific elements within a data structure. Common search algorithms include:

- Linear Search
- Binary Search

## Usage

To use any of the data structures or algorithms, simply include the corresponding Java file in your project. Here is an example of how to use the `BinaryTree` class:

```java
public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.inorder();
        System.out.println();

        System.out.println("Preorder traversal:");
        tree.preorder();
        System.out.println();

        System.out.println("Postorder traversal:");
        tree.postorder();
        System.out.println();
    }
}
```

## Contributing

Contributions are welcome! If you have an implementation or algorithm that you would like to add, please fork the repository and submit a pull request.

## License

This repository is licensed under the MIT License. See the LICENSE file for more information.

---

This README provides an overview of the data structures and algorithms available in this repository, along with instructions on how to use and contribute to the project.
