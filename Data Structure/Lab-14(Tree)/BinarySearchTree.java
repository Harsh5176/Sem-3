
import java.util.Scanner;

class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BinarySearchTree().new BST();

        while (true) {
            System.out.println("\nBinary Search Tree Menu");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Search a node");
            System.out.println("4. Inorder Traversal");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the value to be inserted: ");
                    int insertValue = sc.nextInt();
                    bst.insert(insertValue);
                    break;

                case 2:
                    System.out.print("\nEnter the value to be deleted: ");
                    int deleteValue = sc.nextInt();
                    bst.root = bst.deleteRec(bst.root, deleteValue);
                    break;

                case 3:
                    System.out.print("\nEnter the value to be searched: ");
                    int searchValue = sc.nextInt();
                    boolean found = bst.SearchRec(bst.root, searchValue);
                    if (found) {
                        System.out.println(searchValue + " is present in the BST.");
                    } else {
                        System.out.println(searchValue + " is not present in the BST.");
                    }
                    break;

                case 4:
                    bst.inorderTraversal();
                    break;

                case 5:
                    System.out.println("Exited");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    class BST {

        TreeNode root;

        void insert(int value) {
            root = insertRecord(root, value);
        }

        public TreeNode insertRecord(TreeNode root, int value) {
            if (root == null) {
                root = new TreeNode(value);
                return root;
            }
            if (value < root.value) {
                root.left = insertRecord(root.left, value);
            } else if (value > root.value) {
                root.right = insertRecord(root.right, value);
            }
            return root;

        }

        boolean SearchRec(TreeNode root, int value) {
            if (root == null) {
                return false;
            }
            if (value == root.value) {
                return true;
            }
            if (value < root.value) {
                return SearchRec(root.left, value);
            } else {
                return SearchRec(root.right, value);
            }
        }

        TreeNode deleteRec(TreeNode root, int value) {
            if (root == null) {
                return root;
            }
            if (value < root.value) {
                root.left = deleteRec(root.left, value);
            } else if (value > root.value) {
                root.right = deleteRec(root.right, value);
            } else {
                if (root.left == null) {
                    return root.right;
                } else if (root.right == null) {
                    return root.left;
                }
                root.value = minValue(root.right);
                root.right = deleteRec(root.right, root.value);
            }
            return root;
        }

        int minValue(TreeNode root) {
            int minValue = root.value;
            while (root.left != null) {
                minValue = root.left.value;
                root = root.left;
            }
            return minValue;
        }

        void inorderTraversal() {
            inorderRec(root);
        }

        void inorderRec(TreeNode root) {
            if (root != null) {
                inorderRec(root.left);
                System.out.println(root.value + " ");
                inorderRec(root.right);
            }
        }
    }
}
