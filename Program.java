import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Arrays<Integer> newArray = new Arrays();
        newArray.addElement(1);
        newArray.addElement(2);
        newArray.addElement(1);
        newArray.addElement(2);
        newArray.addElement(3);
        newArray.addElement(1);
        newArray.addElement(4);
        System.out.println(newArray.replaceElement(55, 0));
    }
}

class Arrays<T> {
    private List<T> arrayElements;

    public Arrays() {
        arrayElements = new ArrayList<T>();
    }

// Печать массива на экран
    @Override
    public String toString() {
        String res = "[";
        int count = 0;
        for (T t : arrayElements) {
            if (count == arrayElements.size() - 1) res += t.toString();
            else res += t.toString() + ", ";
            count++;
        }
        return res + "]";
    }
//  Добавление элемента
    public void addElement(T element) {
        arrayElements.add(element);
    }
//  Удаление элемента 
    public void deleteElementPosition(int position) {
        arrayElements.remove(position);
    }
//  Удаление всех элементов с заданным значением
    public void deleteElementValue(T value) {
        List<T> removeList = new ArrayList<T>();
        for (int index = 0; index < lenArray(); index++) {
            if (arrayElements.get(index) == value) removeList.add(arrayElements.get(index));
        }
        arrayElements.removeAll(removeList);
    }
//  Поиск минимума
    public T minElement() {
        T min = arrayElements.get(0);
        if (min instanceof String) {
            System.out.println("Строки нельзя сравнивать");
            return null;
        } 

        if (min instanceof  Integer) {
            for (T element : arrayElements) {
                if ((Integer) element < (Integer) min) min = element;
            }
        }

        if (min instanceof  Double) {
            for (T element : arrayElements) {
                if ((Double) element < (Double) min) min = element;
            }
        }
        return (T) min;
    }
//  Поиск максимума
    public T maxElement() {
        T max = arrayElements.get(0);
        if (max instanceof String) {
            System.out.println("Строки нельзя сравнивать");
            return null;
        } 

        if (max instanceof  Integer) {
            for (T element : arrayElements) {
                if ((Integer) element > (Integer) max) max = element;
            }
        }

        if (max instanceof  Double) {
            for (T element : arrayElements) {
                if ((Double) element > (Double) max) max = element;
            }
        }
        return (T) max;
    }
//  Поиск суммы элементов массива
    public T sumElement() {
        if (arrayElements.get(0) instanceof String) {
            String sum = "";
            for (T element : arrayElements) sum += (String) element;
            return (T) sum;
        } 

        if (arrayElements.get(0) instanceof  Integer) {
            Integer sum = 0;
            for (T element : arrayElements) sum += (Integer) element;
            return (T) sum;
        }

        if (arrayElements.get(0) instanceof  Double) {
            Double sum = 0.;
            for (T element : arrayElements) sum += (Double) element;
            return (T) sum;
        }
        return null;
    }
//  Поиск произведения элементов массива
    public T multiElement() {
        if (arrayElements.get(0) instanceof String) {
            System.out.println("Строки нельзя умножать");
            return null;
        } 

        if (arrayElements.get(0) instanceof  Integer) {
            Integer multi = 1;
            for (T element : arrayElements) multi *= (Integer) element;
            return (T) multi;
        }

        if (arrayElements.get(0) instanceof  Double) {
            Double multi = 1.;
            for (T element : arrayElements) multi *= (Double) element;
            return (T) multi;
        }
        return null;
    }
//  Поиск индекса заданного элемента в массиве, если такого элемента в массиве нет то возвращать -1
    public void searchIndex(T element) {
        boolean flag = false;
        for (int index = 0; index < lenArray(); index++) {
            if (arrayElements.get(index) == element) {
                System.out.printf("%d ", index);
                flag = true;
            }
        }
        if (flag == false) System.out.println(-1);
        else System.out.println();
    }
//  Проверка наличия элемента в массиве. Возвращает true, если элемент в массиве есть, false – нет.
    public boolean checkElement(T element) {
        boolean flag = false;
        for (int index = 0; index < lenArray(); index++) {
            if (arrayElements.get(index) == element) {
                flag = true;
            }
        }
        return flag;
    }
//  Пузырьковая сортировка
    public List<T> bubblesSort(Arrays<T> array) {
        if (array.valuePositionElement(0) instanceof Integer) {
            int[] arr = new int[array.lenArray()];
            int count = 0;
            for (int i = 0; i < array.lenArray(); i++) {
                arr[count] = (Integer) array.valuePositionElement(i);
                count++;
            }
            for (int out = arr.length - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (arr[in] > arr[in + 1]) {
                        int temp = arr[in];
                        arr[in] = arr[in + 1];
                        arr[in + 1] = temp;
                    }          
                }
            }
            List<T> newArr = new ArrayList<T>();
            for (Integer i = 0; i < arr.length; i++) {
                Integer temp = arr[i];
                newArr.add((T) temp);
            }
            return newArr;
        }
        if (array.valuePositionElement(0) instanceof Double) {
            Double[] arr = new Double[array.lenArray()];
            int count = 0;
            for (int i = 0; i < array.lenArray(); i++) {
                arr[count] = (Double) array.valuePositionElement(i);
                count++;
            }
            for (int out = arr.length - 1; out >= 1; out--) {
                for (int in = 0; in < out; in++) {
                    if (arr[in] > arr[in + 1]) {
                        Double temp = arr[in];
                        arr[in] = arr[in + 1];
                        arr[in + 1] = temp;
                    }          
                }
            }
            List<T> newArr = new ArrayList<T>();
            for (Integer i = 0; i < arr.length; i++) {
                Double temp = arr[i];
                newArr.add((T) temp);
            }
            return newArr;
        }
        else return null;
    }
//  Сортировка простыми вставками
    public List<T> insertionSort(Arrays<T> array) {
        if (array.valuePositionElement(0) instanceof Integer) {
            int[] arr = new int[array.lenArray()];
            int count = 0;
            for (int i = 0; i < array.lenArray(); i++) {
                arr[count] = (Integer) array.valuePositionElement(i);
                count++;
            }
            int j;
            for (int i = 1; i < arr.length; i++) {
                int swap = arr[i];
                for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[j] = swap;
            }
            List<T> newArr = new ArrayList<T>();
            for (Integer i = 0; i < arr.length; i++) {
                Integer temp = arr[i];
                newArr.add((T) temp);
            }
            return newArr;
        }
        if (array.valuePositionElement(0) instanceof Double) {
            Double[] arr = new Double[array.lenArray()];
            int count = 0;
            for (int i = 0; i < array.lenArray(); i++) {
                arr[count] = (Double) array.valuePositionElement(i);
                count++;
            }
            int j;
            for (int i = 1; i < arr.length; i++) {
                Double swap = arr[i];
                for (j = i; j > 0 && swap < arr[j - 1]; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[j] = swap;
            }
            List<T> newArr = new ArrayList<T>();
            for (Integer i = 0; i < arr.length; i++) {
                Double temp = arr[i];
                newArr.add((T) temp);
            }
            return newArr;
        }
        else return null;
    }
//  Сортировка простым выбором
    public List<T> SelectionSort(Arrays<T> array) {
        if (array.valuePositionElement(0) instanceof Integer) {
            int[] arr = new int[array.lenArray()];
            int count = 0;
            for (int i = 0; i < array.lenArray(); i++) {
                arr[count] = (Integer) array.valuePositionElement(i);
                count++;
            }
            for (int i = 0; i < arr.length - 1; i++) {
                int minElementIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minElementIndex] > arr[j]) {
                        minElementIndex = j;
                    }
                }
        
                if (minElementIndex != i) {
                    int temp = arr[i];
                    arr[i] = arr[minElementIndex];
                    arr[minElementIndex] = temp;
                }
            }
            List<T> newArr = new ArrayList<T>();
            for (Integer i = 0; i < arr.length; i++) {
                Integer temp = arr[i];
                newArr.add((T) temp);
            }
            return newArr;
        }
        if (array.valuePositionElement(0) instanceof Double) {
            Double[] arr = new Double[array.lenArray()];
            int count = 0;
            for (int i = 0; i < array.lenArray(); i++) {
                arr[count] = (Double) array.valuePositionElement(i);
                count++;
            }
            for (int i = 0; i < arr.length - 1; i++) {
                int minElementIndex = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[minElementIndex] > arr[j]) {
                        minElementIndex = j;
                    }
                }
        
                if (minElementIndex != i) {
                    Double temp = arr[i];
                    arr[i] = arr[minElementIndex];
                    arr[minElementIndex] = temp;
                }
            }
            List<T> newArr = new ArrayList<T>();
            for (Integer i = 0; i < arr.length; i++) {
                Double temp = arr[i];
                newArr.add((T) temp);
            }
            return newArr;
        }
        else return null;
    }
//  Получение элемента массива по индексу
    public T valuePositionElement(int position) {
        int count = 0;
        for (T element : arrayElements) {
            if (count == position) {
                return element;
            }
            count++;
        }
        return null;
    }
//  Задание значения элементу массива с заданным индексом
    public List<T> replaceElement(T value, int position) {
        List<T> copyList = List.copyOf(arrayElements);
        arrayElements.clear();
        for (int i = 0; i < copyList.size(); i++) {
            if (i == position) arrayElements.add(value);
            else arrayElements.add(copyList.get(i));
        }        
        return arrayElements;
    }
//  Длинна массива
    public Integer lenArray() {
        int count = 0;
        for (T element : arrayElements) {
            count++;
        }
        return count;
    }
}