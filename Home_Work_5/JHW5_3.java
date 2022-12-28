package Home_Work_5;

public class JHW5_3 {
    //вернуть левого потомка `A[i]`
private static int LEFT(int i) {
    return (2 * i + 1);
}

//вернуть правого потомка `A[i]`
private static int RIGHT(int i) {
    return (2 * i + 2);
}

//вспомогательная функция для замены двух индексов в массиве
private static void swap(int[] sortArr, int i, int j) {
    int swap = sortArr[i];
    sortArr[i] = sortArr[j];
    sortArr[j] = swap;
}

//рекурсивный алгоритм heapify-down. Узел с индексом `i` и 2 его прямых потомка нарушают свойство кучи
private static void heapify(int[] sortArr, int i, int size) {
    int left = LEFT(i);
    int right = RIGHT(i);
    int largest = i;

    if (left < size && sortArr[left] > sortArr[i]) largest = left;
    if (right < size && sortArr[right] > sortArr[largest]) largest = right;

    if (largest != i) {
        swap(sortArr, i, largest);
        heapify(sortArr, largest, size);
    }
}

//функция для удаления элемента с наивысшим приоритетом
public static int pop(int[] sortArr, int size) {
    if (size <= 0) {
        return -1;
    }
    int top = sortArr[0];

    sortArr[0] = sortArr[size-1];

    heapify(sortArr, 0, size - 1);
    return top;
}

//функция для выполнения пирамидальной сортировки массива `A` размера `n`
public static void heapSort(int[] sortArr) {
    int n = sortArr.length;
    int i = (n - 2) / 2;
    while (i >= 0) {
        heapify(sortArr, i--, n);
    }

    while (n > 0) {
        sortArr[n - 1] = pop(sortArr, n);
        n--;
    }
}

public static void main(String args[]) {
    int[] sortArr = {32, 95, 0, -2, 67, 19, -47};
    heapSort(sortArr);
    for(int i = 0; i < sortArr.length; i++){
        System.out.print(sortArr[i] + "\n");
    }
}
}
