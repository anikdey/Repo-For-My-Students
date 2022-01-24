package monirameem.queue;

import org.w3c.dom.*;

public class LinkedListBasedQueue<T> {

    private int size = 0;
    private Node<T> front;
    private Node<T> rear;

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void enQueue(T data) {
        Node<T> node = new Node<>(data,null);

        if (front == null){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
        size++;
    }

    public T deQueue(){
        Node<T> temp = front;
        if (temp == null)
            return null;
        front = front.next;
        size--;
        return temp.data;
    }

    public void print() {
        Node<T> temp = front;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static class Node<T> implements org.w3c.dom.Node {

        private T data;
        private Node<T> next;

        Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }

        public Node<T> getNext() {
            return next;
        }

        public T getData() {
            return data;
        }

        @Override
        public String getNodeName() {
            return null;
        }

        @Override
        public String getNodeValue() throws DOMException {
            return null;
        }

        @Override
        public void setNodeValue(String nodeValue) throws DOMException {

        }

        @Override
        public short getNodeType() {
            return 0;
        }

        @Override
        public org.w3c.dom.Node getParentNode() {
            return null;
        }

        @Override
        public NodeList getChildNodes() {
            return null;
        }

        @Override
        public org.w3c.dom.Node getFirstChild() {
            return null;
        }

        @Override
        public org.w3c.dom.Node getLastChild() {
            return null;
        }

        @Override
        public org.w3c.dom.Node getPreviousSibling() {
            return null;
        }

        @Override
        public org.w3c.dom.Node getNextSibling() {
            return null;
        }

        @Override
        public NamedNodeMap getAttributes() {
            return null;
        }

        @Override
        public Document getOwnerDocument() {
            return null;
        }

        @Override
        public org.w3c.dom.Node insertBefore(org.w3c.dom.Node newChild, org.w3c.dom.Node refChild) throws DOMException {
            return null;
        }

        @Override
        public org.w3c.dom.Node replaceChild(org.w3c.dom.Node newChild, org.w3c.dom.Node oldChild) throws DOMException {
            return null;
        }

        @Override
        public org.w3c.dom.Node removeChild(org.w3c.dom.Node oldChild) throws DOMException {
            return null;
        }

        @Override
        public org.w3c.dom.Node appendChild(org.w3c.dom.Node newChild) throws DOMException {
            return null;
        }

        @Override
        public boolean hasChildNodes() {
            return false;
        }

        @Override
        public org.w3c.dom.Node cloneNode(boolean deep) {
            return null;
        }

        @Override
        public void normalize() {

        }

        @Override
        public boolean isSupported(String feature, String version) {
            return false;
        }

        @Override
        public String getNamespaceURI() {
            return null;
        }

        @Override
        public String getPrefix() {
            return null;
        }

        @Override
        public void setPrefix(String prefix) throws DOMException {

        }

        @Override
        public String getLocalName() {
            return null;
        }

        @Override
        public boolean hasAttributes() {
            return false;
        }

        @Override
        public String getBaseURI() {
            return null;
        }

        @Override
        public short compareDocumentPosition(org.w3c.dom.Node other) throws DOMException {
            return 0;
        }

        @Override
        public String getTextContent() throws DOMException {
            return null;
        }

        @Override
        public void setTextContent(String textContent) throws DOMException {

        }

        @Override
        public boolean isSameNode(org.w3c.dom.Node other) {
            return false;
        }

        @Override
        public String lookupPrefix(String namespaceURI) {
            return null;
        }

        @Override
        public boolean isDefaultNamespace(String namespaceURI) {
            return false;
        }

        @Override
        public String lookupNamespaceURI(String prefix) {
            return null;
        }

        @Override
        public boolean isEqualNode(org.w3c.dom.Node arg) {
            return false;
        }

        @Override
        public Object getFeature(String feature, String version) {
            return null;
        }

        @Override
        public Object setUserData(String key, Object data, UserDataHandler handler) {
            return null;
        }

        @Override
        public Object getUserData(String key) {
            return null;
        }
    }

    public static void main(String[] args) {

        LinkedListBasedQueue<Integer> queue = new LinkedListBasedQueue<>();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.print();

        System.out.println(queue.deQueue());
        queue.print();
        queue.enQueue(5);
        queue.print();

    }
}
