public class Multithreading {
    public static void main(String[] args) {
        // Создание двух потоков
        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        
        // Запуск потоков
        thread1.start();
        thread2.start();
        
        // Главный поток ожидает завершение потоков thread1 и thread2
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Многопроцессорная программа завершена");
    }
}

// Поток, выполняющий задачу 1
class Task1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Задача 1: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Поток, выполняющий задачу 2
class Task2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Задача 2: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
} 
