package doublylinkedlist.editor;
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addTextState("Hello");
        editor.addTextState("Hello World");
        editor.addTextState("Hello World!!!");

        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.undo();

        editor.displayCurrentState();
    }
}
