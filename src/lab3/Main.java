public class Main {
    public static void main(String[] args) {
        HashTable<Integer, Student> listOfIncoming = new HashTable<>(10);
        listOfIncoming.put(683431, new Student("Стив", "Роджерс", 107, 4.9F));
        listOfIncoming.put(875490, new Student("Тони", "Старк", 40, 6));
        listOfIncoming.put(118046, new Student("Тор", "Одинсон", 4532, 3.8F));
        Student fakeIronMan = listOfIncoming.get(875490).value;
        System.out.println(fakeIronMan.getAll());
        Student fakeCaptain = listOfIncoming.get(683431).value;
        System.out.println(fakeCaptain.getAll());

        System.out.println();
        System.out.println(listOfIncoming.getSize());
        System.out.println(listOfIncoming.get(875490).value);
        listOfIncoming.remove(875490);
        System.out.println(listOfIncoming.get(875490));
        System.out.println(listOfIncoming.getSize());

    }
}