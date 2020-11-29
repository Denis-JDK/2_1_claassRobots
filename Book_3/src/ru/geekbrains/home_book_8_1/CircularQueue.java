package ru.geekbrains.home_book_8_1;

class CircularQueue implements ICharQ {
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    //создание пустой очереди заданного размера
    public CircularQueue(int size) {
        q = new char[size + 1]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    //помещение символа в очередь
    public void put(char ch) {
        //Очередь считается полной, если индекс putloc на единицу
        //меньше индекса getloc или если индекс putloc указывает
        //на конец массива, а индекс getloc - на его начало
        if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        q[putloc++] = ch;
        if (putloc == q.length) putloc = 0; //перейти в начало массива
    }

    //извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        char ch = q[getloc++];
        if (getloc == q.length) getloc = 0; //вернуть в начало очереди
        return q[getloc];
    }
}
