package doublylinkedlist.editor;

public class TextNode {
    String content;
    TextNode prev;
    TextNode next;

    public TextNode(String content) {
        this.content = content;
        this.prev = null;
        this.next = null;
    }
}
