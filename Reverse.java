import java.util.LinkedList;
import java.util.ListIterator;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<String> lst = new LinkedList<>();
        lst.add("abc"); lst.add("def"); lst.add("ghi"); lst.add("jkl");
        LinkedList<String> reversedList = reverseList(lst);
        System.out.println(reversedList);
    }   
    public static LinkedList<String> reverseList (LinkedList<String> lstForReversion) {
        LinkedList<String> resultLst = new LinkedList<>();
        ListIterator<String> iter = lstForReversion.listIterator(lstForReversion.size());
        while (iter.hasPrevious()) {
            resultLst.add(iter.previous());
        }
        return resultLst;
    }
}