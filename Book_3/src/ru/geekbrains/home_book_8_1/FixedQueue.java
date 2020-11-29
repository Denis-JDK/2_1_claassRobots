package ru.geekbrains.home_book_8_1;


//Класс реализующий очередь фиксированного размера для хранения символов
class FixedQueue implements ICharQ {
    private char q[]; // массив для хранения элементов очереди
    private int putlok, getlok; // индексы вставляемых и извлекаемых элементов


    //создание пустой очереди заданного размера
    public FixedQueue(int size) {
        q = new char[size]; //выделение памяти для очереди
        putlok = getlok = 0;
    }

    //помещение символа в очередь
    public void put(char ch) {
        if (putlok == q.length) {
            System.out.println(" - очередь заполнена");
            return;
        }
        q[putlok++] = ch;
    }

    //извлечение символа из очереди
    public char get() {
        if (getlok == putlok) {
            System.out.println(" - Очередь пуста");
        }
        return q[getlok++];
    }


}
