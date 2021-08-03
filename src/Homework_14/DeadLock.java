package Homework_14;

class DeadLock {

    static class Account {
        private long amount;

        public void setAmount(long amount) {
            this.amount = amount;
        }

        public long getAmount() {
            return amount;
        }

        void plus(long amount) {
            this.amount += amount;
        }

        void minus(long amount) {
            try {
                if (this.amount < amount) {
                    throw new Exception("Недостаточно средств для выполнения транзакции!");
                } else {
                    this.amount -= amount;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static class Transaction extends Thread {

        long amount;
        final Account first;
        final Account second;

        Transaction(long amount, Account first, Account second) {
            this.amount = amount;
            this.first = first;
            this.second = second;
        }

        @Override
        public void run() {
            synchronized (first) {
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                synchronized (second) {
                    first.minus(amount);
                    second.plus(amount);
                }
            }
        }
    }


    public static void main(String[] args) {
        Account first = new Account();
        Account second = new Account();
        Account third = new Account();

        first.setAmount(1000);
        second.setAmount(1000);
        third.setAmount(1000);

        new Transaction(100, first, second).start();
        new Transaction(200, second, third).start();
        new Transaction(300, third, first).start();

    }
}
