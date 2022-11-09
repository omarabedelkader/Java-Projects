/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedQueue;

import java.util.Objects;

/**
 *
 * @author Omar
 */
public class Node <AnyType>{
    
    private AnyType data;
    private Node <AnyType> nextNode;

    public Node(AnyType data, Node<AnyType> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node(AnyType data) {
        this.data = data;
        this.nextNode = null;
    }

    public AnyType getData() {
        return data;
    }

    public Node<AnyType> getNextNode() {
        return nextNode;
    }

    public void setData(AnyType data) {
        this.data = data;
    }

    public void setNextNode(Node<AnyType> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" + "data=" + data + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Node<?> other = (Node<?>) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.nextNode, other.nextNode)) {
            return false;
        }
        return true;
    }
    
    
}
