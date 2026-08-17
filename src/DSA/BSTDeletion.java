package DSA;

import java.util.Scanner;

public class BSTDeletion {
         static class Node {
            int data;
            Node left, right;

            Node(int data) {
                this.data = data;
                left = right = null;
            }
        }

        // INSERTION
        static Node insert(Node root, int value) {

            // If position is empty, create new node
            if (root == null)
                return new Node(value);

            // Smaller value → left
            if (value < root.data) {
                root.left = insert(root.left, value);
            }

            // Larger value → right
            else if (value > root.data) {
                root.right = insert(root.right, value);
            }

            return root;
        }

        // SEARCH
        static boolean search(Node root, int value) {

            if (root == null)
                return false;

            if (root.data == value)
                return true;

            if (value < root.data)
                return search(root.left, value);

            return search(root.right, value);
        }

        // FIND MINIMUM NODE
        static Node findMin(Node root) {

            while (root.left != null) {
                root = root.left;
            }

            return root;
        }

        // DELETION
        static Node delete(Node root, int key) {

            // Value not found
            if (root == null)
                return null;

            // Search in left subtree
            if (key < root.data) {
                root.left = delete(root.left, key);
            }

            // Search in right subtree
            else if (key > root.data) {
                root.right = delete(root.right, key);
            }

            // Found the node
            else {

                // CASE 1: No child
                if (root.left == null && root.right == null) {
                    return null;
                }

                // CASE 2: Only right child
                if (root.left == null) {
                    return root.right;
                }

                // CASE 2: Only left child
                if (root.right == null) {
                    return root.left;
                }

                // CASE 3: Two children
                Node successor = findMin(root.right);

                root.data = successor.data;

                root.right = delete(root.right, successor.data);
            }

            return root;
        }

        // INORDER TRAVERSAL
        static void inorder(Node root) {

            if (root == null)
                return;

            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }

        public static void main(String[] args) {

            Node root = null;

            // INSERT VALUES
            root = insert(root, 10);
            root = insert(root, 5);
            root = insert(root, 20);
            root = insert(root, 2);
            root = insert(root, 7);
            root = insert(root, 15);
            root = insert(root, 30);
            root = insert(root, 25);

            System.out.println("BST after insertion:");
            inorder(root);

            // DELETE 20 (node with two children)
            root = delete(root, 20);

            System.out.println("\nBST after deleting 20:");
            inorder(root);
        }
    }