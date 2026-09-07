public class ListStack {
    StackNode top;
    int size = 0;

    public class ListStack implements StackInterface{
        StackNode top;
        int size = 0;

        // 1
        public void clear() {
            size = 0;
            this.top = null;
        }

        // 2
        public boolean isEmpty() {
            return top == null;
        }

        // 3
        public Object peek() {
            if (top == null) return null;
            return top.dato;
        }

        // 4
        public Object pop() {
            if (top == null) return null;

            Object aux = top.dato;
            top = top.below;
            size--;
            return aux;
        }

        // 5
        public boolean push(Object object) {
            if (object == null) return false;

            StackNode nuevo = new StackNode(object);
            nuevo.below = top;
            top = nuevo;
            size++;
            return true;
        }

        // 6
        public int size() {
            return size;
        }

        // 7
        public boolean search(Object object) {
            if (top == null) return false;

            StackNode actual = this.top;
            while (actual != null) {
                if (actual.dato == null ? object == null : actual.dato.equals(object)) return true;
                actual = actual.below;
            }
            return false;
        }

    /* 8
    public String toString() {
         if (this.top == null) return new Object[0];

        StackNode iterador = this.top;
        Object[] array = new Object[size];
        int i = 0;

        while (iterador != null) {
            array[i] = iterador.dato;
            i++;
            iterador = iterador.below;
        }
        return array;
    */
    }
}