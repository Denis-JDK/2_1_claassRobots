package ru.geekbrains.home_book_8_1;


 class IQDemo {
     public static void main(String[] args) {

         FixedQueue q1 = new FixedQueue(10);
         DynQueue q2 = new DynQueue(5);
         CircularQueue q3 = new CircularQueue(10);

         ICharQ iQ;

         char ch;
         int i;

         iQ = q1;
         //помещение ряда символов в очередь фиксированного размера
         for (i=0; i < 10; i++)
             iQ.put((char) ('A' + i));

         //отображение содержимого очереди
         System.out.println("Содержимое фиксированной очереди: ");
         for (i = 0; i < 10; i++) {
             ch = iQ.get();
             System.out.print(ch);
         }
         System.out.println();

         iQ = q2;
         //помещение ряда символов в динамическую очередь
         for (i = 0; i < 10; i++)
             iQ.put((char) ('Z' - i));

         //отображение содержимого очереди
         System.out.println("Содержимое динамической очереди: ");
         for (i = 0; i < 10; i++) {
             ch = iQ.get();
             System.out.print(ch);
         }

         System.out.println();

         iQ = q3;
         //помещение ряда символов в кольцевую очередь
         for (i = 0; i < 10; i++)
             iQ.put((char) ('A' + i));

         //отображение содержимого очереди
         System.out.print("Содержимое кольцевой очереди: ");
         for (i = 0; i < 10; i++) {
             ch = iQ.get();
             System.out.print(ch);
         }

         System.out.println();

         //помещение дополнительных символов в кольцевую очередь
         for (i = 10; i < 20; i++)
             iQ.put((char) ('A' + i));

         //отображение содержимого очереди
         System.out.print("Содержимое кольцевой очереди: ");
         for (i = 0; i < 10; i++) {
             ch = iQ.get();
             System.out.print(ch);
         }

         System.out.println("\nСохранение и использование данных" +
                 " кольцевой очереди.");

         //помещение дополнительных символов в кольцевую очередь
         //с последующим их извлечением
         for (i = 10; i < 20; i++) {
             iQ.put((char) ('A' + i));
             ch = iQ.get();
             System.out.print(ch);


         }
     }
 }
