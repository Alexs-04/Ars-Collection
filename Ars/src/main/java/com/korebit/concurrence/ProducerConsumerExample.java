package com.korebit.concurrence;

public class ProducerConsumerExample {

    static class DataBox {

        private String data;
        private volatile boolean hasData = false;

        public synchronized void produce(String value) {
            while (hasData) {
                try {
                    wait(); // Espera a que el consumidor consuma
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            this.data = value;
            hasData = true;
            System.out.println("🔨 Productor produjo: " + value);
            notify(); // Notifica al consumidor
        }

        public synchronized void consume() {
            while (!hasData) {
                try {
                    wait(); // Espera a que el productor produzca
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }

            hasData = false;
            System.out.println("✅ Consumidor consumió: " + data);
            notify(); // Notifica al productor
        }
    }

    public void example() {
        DataBox box = new DataBox();

        Thread producer = new Thread(() -> {
            String[] values = {"🍎", "🍌", "🍒", "🍇"};
            for (String value : values) {
                box.produce(value);
                try {
                    Thread.sleep(1000); // Simula tiempo de producción
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                box.consume();
                try {
                    Thread.sleep(1500); // Simula tiempo de consumo
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
