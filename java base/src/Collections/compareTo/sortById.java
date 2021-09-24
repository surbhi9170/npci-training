package Collections.compareTo;

import java.util.Comparator;

class SortById implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.id - o2.id;
    }
}
