public class Main {

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        ListNode node = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(4)))); // 1 -> 2 -> 2 -> 4
        ListNode node2 = null;
        System.out.println("size = " + size(node)); // 4
//        System.out.println(size(node2));


        System.out.println(getByIndex(node, 0)); // 1
        System.out.println(getByIndex(node, 3)); // 4
        System.out.println(getByIndex(node, 4)); // new IndexOutOfBoundsException
        System.out.println(asString(node));   // [1 -> 2 -> 2 -> 4]
//        System.out.println(asString(node2));
    }

    /**
     * Посчитать размер списка.
     */
    static int size(ListNode head) {
        if (head != null){
            ListNode iter = head;
            int counter = 0;
            while (iter != null){
                iter = iter.next;
                counter++;
            }
            return counter;

        } else {
            throw new UnsupportedOperationException();
        }
    }

    /**
     * Написать строковое представление списка в формате
     * [first_value -> second_value -> ... -> last_value]
     */
    static String asString(ListNode head) {
        if (head != null) {
            ListNode iter = head;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            while (iter != null) {
                stringBuilder.append(iter.value);
                if (iter.next != null){
                    stringBuilder.append("->");
                }
                iter = iter.next;
            }
            stringBuilder.append("]");
            return String.valueOf(stringBuilder);

        }else{
            throw new UnsupportedOperationException();
        }

    }

    /**
     * Найти значение по индексу
     */
    static int getByIndex(ListNode head, int index) {
        if (head != null){
            ListNode iter = head;
            int counter = 0;
            while (counter != index){
                if (iter != null) {
                    iter = iter.next;
                    counter++;
                } else{
                    throw new IndexOutOfBoundsException();
                }
            }
            return iter.value;
        } else {
            throw new UnsupportedOperationException();
        }
    }
}