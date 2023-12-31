import java.util.LinkedList;
public class HashTable<K, V> {
    private int length;
    private int size;
    public class Entry {
        public K key;
        public V value;
        Entry() {};
        Entry(K _key, V _value) {
            key = _key;
            value = _value;
        }
    }
    private LinkedList<Entry>[] table;
    public HashTable(int len) {
        this.length = len;
        table = new LinkedList[len];
        size = 0;
    }
    public int size() {
        return size;
    }
    public int len() {
        return length;
    }

    private int hash(K key) {
        return Math.abs(key.hashCode()) % length;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    private boolean listEmpty(LinkedList<Entry> list) {
        return list == null;
    }

    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];
        if (listEmpty(list)) {
            list = new LinkedList < > ();
            Entry r = new Entry(key, value);
            list.add(r);
            table[index] = list;
            size++;
        }
        else {
            if (get(key) != null) {
                V oldValue = get(key).value;
                System.out.println("Already exists with key: " + key);
                Entry r = new Entry(key, value);
                list.add(r);
                //Old value was replaced by new one
            }
            else {
                Entry r = new Entry(key, value);
                list.add(r);
                size++;
            }
        }
    }

    public Entry get(K key) {
        if (key == null)
            return null;
        int index = hash(key);
        LinkedList <Entry> list = table[index];
        if (listEmpty(list))
            return null;
        else {
            for (Entry pair : list)
                if (pair.key.equals(key))
                    return pair;
        }
        return null;
    }
    public void remove(K key) {
        int index = hash(key);
        LinkedList <Entry> list = table[index];
        if (listEmpty(list))
            System.out.println("Empty cell");
        else {
            Entry pair = get(key);
            if (pair != null) {
                list.remove(pair);
                size --;
                System.out.println("Removed");
            }
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
}
//hashtable - массив. ключи прогоняются через хеш-функцию. так получаем индекс массива, по которому
// храним информацию