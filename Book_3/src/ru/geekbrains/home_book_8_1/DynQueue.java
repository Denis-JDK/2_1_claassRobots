package ru.geekbrains.home_book_8_1;

//динамическая очередь
class DynQueue implements ICharQ {
    private char q[]; //массив для хранения элементов очереди
    private int putloc, getloc; //индексы вставляемых и извлекаемых элементов

    //создание пустой очереди заданного размера
    public DynQueue(int size) {
        q = new char[size]; //выделение памяти для очереди
        putloc = getloc = 0;
    }

    //помещение символа в очередь
    public void put(char ch) {
        if (putloc == q.length) {
            //увеличение размера очереди
            char t[] = new char[q.length * 2];

            //копирование элементов в новую очередь
            for (int i = 0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }
        q[putloc++] = ch;
    }

    //извлечение символа из очереди
    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        return q[getloc++];
    }
}