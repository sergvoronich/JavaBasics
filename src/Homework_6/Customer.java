package Homework_6;

import java.util.Calendar;

public class Customer {

    private String lastName, middleName, firstName, bankAccountNumber;
    private int yearOfBirth;
    private long creditCardNumber;

    public Customer() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void customerInfo() {
        System.out.println("Информация о клиенте:");
        System.out.println("Фамилия: " + lastName);
        System.out.println("Имя: " + firstName);
        System.out.println("Отчество: " + middleName);
        System.out.println("Год рождения: " + yearOfBirth);
        System.out.println("Номер кредитной карты: " + creditCardNumber);
        System.out.println("Номер банковского счета: " + bankAccountNumber);
    }

    public int customerAge(int yearOfBirth) {
        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear - yearOfBirth;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setLastName("Иванов");
        customer1.setFirstName("Иван");
        customer1.setMiddleName("Иванович");
        customer1.setYearOfBirth(1981);
        customer1.setCreditCardNumber(2222333344445555L);
        customer1.setBankAccountNumber("BY15XXXX00000000000000000001");

        Customer customer2 = new Customer();
        customer2.setLastName("Петров");
        customer2.setFirstName("Петр");
        customer2.setMiddleName("Петрович");
        customer2.setYearOfBirth(1982);
        customer2.setCreditCardNumber(1111333344441111L);
        customer2.setBankAccountNumber("BY15XXXX00000000000000000010");

        Customer customer3 = new Customer();
        customer3.setLastName("Соколов");
        customer3.setFirstName("Андрей");
        customer3.setMiddleName("Андреевич");
        customer3.setYearOfBirth(1984);
        customer3.setCreditCardNumber(2222111144445555L);
        customer3.setBankAccountNumber("BY15XXXX00000000000000000101");

        Customer customer4 = new Customer();
        customer4.setLastName("Орлов");
        customer4.setFirstName("Валентин");
        customer4.setMiddleName("Валентинович");
        customer4.setYearOfBirth(1953);
        customer4.setCreditCardNumber(2222333311115555L);
        customer4.setBankAccountNumber("BY15XXXX0000000000000000024");

        Customer customer5 = new Customer();
        customer5.setLastName("Воробьев");
        customer5.setFirstName("Владимир");
        customer5.setMiddleName("Иосифович");
        customer5.setYearOfBirth(1969);
        customer5.setCreditCardNumber(2222333344441111L);
        customer5.setBankAccountNumber("BY15XXXX00000000000000000032");

        Customer[] customerArray = {customer1, customer2, customer3, customer4, customer5};
        System.out.println("Фамилии клиентов, у которых номер кредитной карты заканчивается на 1:");
        for (int i = 0; i < customerArray.length; i++) {
            if (customerArray[i].getCreditCardNumber() % 10 == 1) {
                System.out.println(customerArray[i].lastName);
            }
        }
    }
}
