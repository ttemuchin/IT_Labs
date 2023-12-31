package lab4;

public class ArrayAverage {
    public static void main(String[] args) {
        Character[] arr = {'5', '9', '1', '6'};
        System.out.println(average(arr));
        Character[] arr2 = {'a', '3', '8', '5'};
        System.out.println(average(arr2));
    }

    public static float average(Character[] array) {
        float sum = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                String charEl = array[i].toString();
                sum += Float.parseFloat(charEl);
            }
            return sum / array.length;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("Type exception");
        } catch (Exception e) {
            System.out.println("RuntimeException");
        }
        return 0;
    }
}


//static<T>