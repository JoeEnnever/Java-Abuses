package segfault;
/**
 * This was fixed in a recent Java patch
 * Works in java version "1.6.0_21"
 */
public class Segfault {
    public static void main(String[] args){
        Object[] head = new Object[1];
        Object[] tail = head;
        while(head != null){
            tail[0] = new Object[1];
            tail = (Object[]) tail[0];
        }
    }
}
