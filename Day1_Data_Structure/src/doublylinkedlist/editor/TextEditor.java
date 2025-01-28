package doublylinkedlist.editor;

public class TextEditor {
    private TextNode current;
    private int historySize = 0;
    private final int MAX_HISTORY = 10;

    public void addTextState(String content) {
        TextNode newNode = new TextNode(content);
        if (current != null) {
            current.next = newNode;
            newNode.prev = current;
        }
        current = newNode;
        historySize++;
        if (historySize > MAX_HISTORY) {
            trimOldHistory();
        }
        System.out.println("Added state: " + content);
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Undo performed. Current state: " + current.content);
        } else {
            System.out.println("No previous state to undo.");
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Redo performed. Current state: " + current.content);
        } else {
            System.out.println("No next state to redo.");
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current state: " + current.content);
        } else {
            System.out.println("No state available.");
        }
    }

    private void trimOldHistory() {
        TextNode node = current;
        while (node.prev != null) {
            node = node.prev;
        }
        node.next.prev = null;
        historySize--;
        System.out.println("Old history trimmed.");
    }
}
