package Chap1_Ex1;

public class Test {

    public static void main(String args[]) {

        LinkedListTest l = new LinkedListTest();
        l.insertAtBack(1);
        l.insertAtBack(2);
        l.insertAtBack(3);
        l.insertAtBack(4);
        l.insertAtBack(5);
        LinkedListTest l1 = new LinkedListTest();

        l1.insertAtBack(2);
        //l1.insertAtBack(1);
        l1.insertAtBack(3);
        //l1.insertAtBack(3);
        l1.insertAtBack(4);
        //l1.insertAtBack(6);
        //l1.insertAtBack(6);
        //l1.insertAtBack(7);

        DoublyLinkedList dl = new DoublyLinkedList();

        dl.insertAtBack(10);
        dl.insertAtBack(11);
        dl.insertAtBack(12);
        dl.insertAtBack(13);
        dl.insertAtBack(14);
        dl.insertAtFront(9);
        dl.insertAtFront(8);

        l.print();
        l1.print();

        LinkedListTest l5 = new LinkedListTest();
        l5 = inverser(l);
        l5.print();

        
        
        StackTest stack = new StackTest();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        stack.print();

        System.out.println("");
        
        int arr[] = {5, 7, 2, 4, 8 ,6, 3, 1, 8};
        
        StackTest s3 = stackSort(arr);
        
        s3.print();
        
        StackArray sa = new StackArray(4);
        
        System.out.println();
        
        sa.push(0);
        sa.push(1);
        sa.push(2);
        sa.push(3);
        
        sa.print();
        
        QueueArray qa = new QueueArray(4);
        
        qa.enqueue(4);
        qa.enqueue(5);
        qa.enqueue(6);
        qa.enqueue(7);
        
        TreeNode root;
        
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public static int fibonacciRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRec(n - 2) + fibonacciRec(n - 1);
    }

    public static void fibonacci(int n) {

        if (n == 0) {
            System.out.print(0);
        } else if (n == 1) {
            System.out.print(0);
            System.out.print(1);
        } else {
            int res[] = new int[n];
            res[0] = 0;
            res[1] = 1;
            for (int i = 2; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2];
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }
        }

    }

    public static int someEntiersNaturel(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static int someEntiersNaturelRec(int n) {
        if (n <= 0) {
            return n;
        }
        return n + someEntiersNaturelRec(n - 1);
    }

    public static int puiss(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) {
            res *= a;
        }
        return res;
    }

    public static int puissRec(int a, int b) {
        if (b <= 1) {
            return a;
        }
        return a * puissRec(a, b - 1);
    }

    public static int fibo(int a) {
        if (a <= 0) {
            return 1;
        } else {
            return fibo(a - 1) + fibo(a - 2);
        }
    }

    public static boolean egalite(LinkedListTest l, LinkedListTest l1) {
        if (l.isEmpty() && l1.isEmpty()) {
            return true;
        } else {
            Node temp1 = l.getHead();
            Node temp2 = l1.getHead();

            while (temp1 != null && temp2 != null) {
                if (temp1.getData() != temp2.getData()) {
                    return false;
                }
                temp1 = temp1.getNext();
                temp2 = temp2.getNext();
            }

            return temp1 == null && temp2 == null;
        }
    }

    public static int sommePair(LinkedListTest l) {
        int somme = 0;
        int count = 1;
        Node temp = l.getHead();

        while (temp != null) {
            if (count % 2 == 0) {
                somme += (int) temp.getData();
            }
            temp = temp.getNext();
            count++;
        }
        return somme;
    }

    public static void removeElement(LinkedListTest l, int e) {
        if (l.getHead() == null) {
            return;
        }

        Node temp = l.getHead();

        if ((int) temp.getData() == e) {
            while ((int) temp.getData() == e) {
                l.setHead(temp.getNext());
                temp = l.getHead();
            }

        }

        while (temp.getNext() != null) {
            if ((int) temp.getNext().getData() == e) {
                if (temp.getNext().getNext() != null) {
                    temp.setNext(temp.getNext().getNext());
                } else {
                    temp.setNext(null);
                    return;
                }

            } else {
                temp = temp.getNext();
            }

        }
    }

    public static LinkedListTest randPair(LinkedListTest l) {
        if (l.getHead() == null) {
            return null;
        }

        int count = 1;
        Node temp = l.getHead();
        LinkedListTest l1 = new LinkedListTest();

        while (temp.getNext() != null) {
            if (count % 2 == 0) {
                l1.insertAtBack((int) temp.getData());
            }
            temp = temp.getNext();
            count++;
        }

        return l1;
    }

    public static LinkedListTest union(LinkedListTest l1, LinkedListTest l2) {
        if (l1.getHead() == null || l2.getHead() == null) {
            return null;
        }

        Node temp1 = l1.getHead();

        LinkedListTest l3 = new LinkedListTest();

        while (temp1 != null) {
            Node temp2 = l2.getHead();
            while (temp2 != null) {
                if (temp1.getData() == temp2.getData()) {
                    l3.insertAtBack((int) temp1.getData());
                    break;
                } else {
                    temp2 = temp2.getNext();
                }
            }
            temp1 = temp1.getNext();
        }

        return l3;
    }

    public static void insertAfterPos(DoublyLinkedList dl, int data, int pos) {
        if (dl.getHead() == null) {
            dl.insertAtFront(data);
        } else if (dl.getHead() == dl.getTail() && pos >= 1) {
            dl.insertAtBack(data);
        } else {
            int count = 1;
            DLLNode temp = dl.getHead();
            DLLNode newNode = new DLLNode(data);
            while (temp != null && count < pos) {
                temp = temp.getNext();
                count++;
            }
            if (count == 1) {
                newNode.setNext(dl.getHead());
                dl.getHead().setPrevious(newNode);
                dl.setHead(newNode);
            } else if (count == pos) {
                if (temp == null) {
                    dl.getTail().setNext(newNode);
                    newNode.setPrevious(dl.getTail());
                    dl.setTail(newNode);
                } else {
                    temp.getPrevious().setNext(newNode);
                    newNode.setPrevious(temp.getPrevious());
                    temp.setPrevious(newNode);
                    newNode.setNext(temp);
                }
            } else {
                System.out.println("position not available");
            }
        }
    }

    public static void supprimerElement(DoublyLinkedList dl, int m) {
        DLLNode temp = dl.getHead();
        if (temp == null) {
            System.out.println("list is empty");
        } else if (temp.getNext() == null) {
            dl.removeFromHead();
        } else {
            while (temp != null) {
                if ((int) temp.getData() == m) {

                    if (temp == dl.getHead()) {
                        dl.setHead(dl.getHead().getNext());
                        dl.getHead().setPrevious(null);
                    } else if (temp == dl.getTail()) {
                        dl.setTail(dl.getTail().getPrevious());
                        dl.getTail().setNext(null);
                    } else {
                        System.out.println("test");
                        DLLNode temp2 = temp.getPrevious();
                        temp.getPrevious().setNext(temp.getNext());
                        temp.getNext().setPrevious(temp2);
                    }
                }

                temp = temp.getNext();
            }
        }
    }

    public static LinkedListTest inverser(LinkedListTest l) {
        Node temp = l.getHead();
        LinkedListTest l2 = new LinkedListTest();
        if (temp == null) {
            System.out.println("list is empty");
            return null;
        } else if (temp.getNext() == null) {
            return l;
        } else {
            while (l.getHead() != null) {
                int t = l.removeFromTail();
                l2.insertAtBack(t);
            }
            return l2;
        }
    }

    public static boolean incluse(LinkedListTest l3, LinkedListTest l2) {
        Node temp1 = l3.getHead();
        Node temp2 = l2.getHead();

        boolean bool = false;
        while (temp1 != null || temp2 != null) {
            System.out.println("test");
            if ((int) temp1.getData() == (int) temp2.getData()) {
                temp1 = temp1.getNext();

                if (temp2.getNext() == null) {

                    bool = true;
                    return bool;
                }
                temp2 = temp2.getNext();

            } else if ((int) temp1.getData() < (int) temp2.getData()) {
                temp1 = temp1.getNext();
            } else {
                temp2 = temp2.getNext();
            }
        }

        return bool;

    }

    public static StackTest stackSort(int[] arr) {
        StackTest s1 = new StackTest();
        StackTest s2 = new StackTest();

        for (int i = 0; i < arr.length; i++) {
            
            if (s1.getTop() == null || (int)s1.getTop().getData() <= arr[i]) {
                s1.push(arr[i]);
                
            } else {
                do {
                    s2.push(s1.pop());
                    
                } while (s1.getTop() != null && (int) s1.getTop().getData() >= arr[i]);

                s1.push(arr[i]);

                
                while (s2.getTop() != null) {
                    
                    s1.push(s2.pop());
                }
            }
            

        }
        
        return s1;
    }

}
