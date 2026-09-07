public class ListStack implements StackInterface{
    StackNode top;
    int size = 0;

    // 1
    @Override
    public void clear() {
        size = 0;
        this.top = null;
    }

    // 2
    @Override
    public boolean isEmpty() {
        return top == null;
    }

    // 3
    @Override
    public Object peek() {
        if (top == null) return null;
        return top.dato;
    }

    // 4
    @Override
    public Object pop() {
        if (top == null) return null;

        Object aux = top.dato;
        top = top.below;
        size--;
        return aux;
    }

    // 5
    @Override
    public boolean push(Object object) {
        if (object == null) return false;

        StackNode nuevo = new StackNode(object);
        nuevo.below = top;
        top = nuevo;
        size++;
        return true;
    }

    // 6
    @Override
    public int size() {
        return size;
    }

    // 7
    @Override
    public boolean search(Object object) {
        if (top == null) return false;

        StackNode actual = this.top;
        while (actual != null) {
            if (actual.dato == null ? object == null : actual.dato.equals(object)) return true;
            actual = actual.below;
        }
        return false;
    }

    // 8
    @Override
    public String toString() {
        if (top == null) {
            return "Pila vacía";
        }

        StringBuilder sb = new StringBuilder("Top -> ");
        StackNode actual = this.top;

        while (actual != null) {
            sb.append("[").append(actual.dato).append("] -> ");
            actual = actual.below;
        }

        sb.append("null");
        return sb.toString();
    }
}