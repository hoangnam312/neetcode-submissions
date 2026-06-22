
class BrowserHistory {

    private class Node {
        String url;
        Node prev;
        Node next;

        Node(String url) {
            this.url = url;
        }
    }

    private Node current;
    private Node head;

    public BrowserHistory(String homepage) {
        Node value = new Node(homepage);
        value.prev = null;
        value.next = null;
        current = value;
        head = value;
    }

    public void visit(String url) {
        Node value = new Node(url);
        current.next = value;
        value.prev = current;
        current = value;
    }

    public String back(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current.prev == null)
                return current.url;
            current = current.prev;
        }
        return current.url;
    }

    public String forward(int steps) {
        for (int i = 0; i < steps; i++) {
            if (current.next == null)
                return current.url;
            current = current.next;
        }
        return current.url;
    }

    public void printHistory() {
        Node pointer = head;

        while (pointer != null) {
            if (pointer == current) {
                System.out.print("[" + pointer.url + "]");
            } else {
                System.out.print(pointer.url);
            }

            if (pointer.next != null) {
                System.out.print(" -> ");
            }

            pointer = pointer.next;
        }

        System.out.println();
    }
}
