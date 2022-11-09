/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpringProject19;

/**
 *
 * @author Omar
 * @param <AnyType>
 */
public class CyclicDoubleList<AnyType> {

    private DoubleNode<AnyType> head;
    private int listSize;

    public CyclicDoubleList() {
        head = null;
        listSize = 0;
    }

    public int size() {
        return listSize;
    }

    public boolean empty() {
        return listSize == 0;
    }

    public AnyType front() {
        if (empty()) {
            throw new RuntimeException();
        } else {
            return head.getData();
        }
    }

    public AnyType back() {
        if (empty()) {
            throw new RuntimeException();
        } else {
            DoubleNode<AnyType> prev = head.getPrevious();
            return prev.getData();
        }
    }

    public DoubleNode<AnyType> head() {
        return head;
    }

    public int count(AnyType e) {
        int count = 0;
        if (empty()) {
            System.out.println("List is Empty");
        } else {
            DoubleNode<AnyType> current = head;
            do {
                if (current.getData() == e) {
                    count++;
                }
                current = current.getNext();
            } while (current != head);
        }
        return count;
    }

    public void push_front(AnyType e) {

        DoubleNode<AnyType> n = new DoubleNode<AnyType>(e);

        if (empty()) {

            n.setNext(n);
            n.setPrevious(n);
            head = n;
            //listSize++;

        } else {
            n.setPrevious(head.getPrevious());
            head.getPrevious().setNext(n);
            head.setPrevious(n);
            n.setNext(head);

            head = n;
            //listSize++;
        }
        listSize++;
    }

    public void push_back(AnyType e) {

        DoubleNode<AnyType> n = new DoubleNode<AnyType>(e);

        if (empty()) {

            n.setNext(n);
            n.setPrevious(n);
            head = n;
            //listSize++;
        } else {
            DoubleNode<AnyType> lastOne = head.getPrevious();

            n.setPrevious(lastOne);
            lastOne.setNext(n);
            head.setPrevious(n);
            n.setNext(head);
            //listSize++;
        }
        listSize++;
    }

    public AnyType pop_front() {
        if (empty()) {
            throw new RuntimeException();
        } else if (listSize == 1) {
            DoubleNode<AnyType> temporary = head;
            head = null;
            listSize--;
            return temporary.getData();
        } else {
            DoubleNode<AnyType> last = head.getPrevious();
            AnyType data = head.getData();

            head = head.getNext();
            head.setPrevious(last);
            last.setNext(head);
            listSize--;
            return data;
        }
    }

    public AnyType pop_back() {
        if (empty()) {
            throw new RuntimeException();
        } else if (listSize == 1) {
            DoubleNode<AnyType> temporary = head;
            head = null;
            listSize--;
            return temporary.getData();
        } else {
            DoubleNode<AnyType> temp = head.getPrevious();
            DoubleNode<AnyType> temp2 = temp.getPrevious();
            AnyType data = temp.getData();

            temp2.setNext(head);
            head.setPrevious(temp2);
            listSize--;
            return data;
        }
    }

    public int erase(AnyType e) {
        int count = 0;
        if (empty()) {
            System.out.print("List is empty");
            return -1;
        } else {
            DoubleNode<AnyType> current = head;
            for (int i = 0; i < listSize; i++) {
                if (current.getData() == e) {
                    if (current == head) {
                        if (listSize == 1) {
                            head = null;
                            //listSize --;
                            //count++;

                        } else {
                            DoubleNode<AnyType> lastOne = head.getPrevious();
                            head = head.getNext();
                            head.setPrevious(lastOne);
                            lastOne.setNext(head);
                            //listSize--;
                            //count++;
                        }
                    }
                    if (current.getNext() == head) {
                        if (listSize == 1) {
                            head = null;
                            //listSize --;
                            //count++;

                        } else {
                            DoubleNode<AnyType> last = head.getPrevious();
                            DoubleNode<AnyType> beforeLast = last.getPrevious();

                            beforeLast.setNext(head);
                            head.setPrevious(beforeLast);
                            //listSize--;
                            //count++;
                        }

                    }
                    if (current != head || current.getNext() != head) {
                        DoubleNode<AnyType> next = current.getNext();
                        DoubleNode<AnyType> prev = current.getPrevious();
                        prev.setNext(next);
                        next.setPrevious(prev);
                        //listSize--;
                        //count++;
                    }
                    listSize--;
                    count++;
                }
                current = current.getNext();
            }
            return count;
        }
    }

    public void print() {
        DoubleNode<AnyType> current = head;

        for (int i = 0; i < listSize; i++) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

}
