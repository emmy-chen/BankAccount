public class Tester{
  public static void main(String[] args) {
    BankAccount acc1 = new BankAccount(111, "hello");
    System.out.println(acc1.getInfo());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getBalance());
    acc1.setPassword("pingpongball");
    System.out.println(acc1.getInfo());
    acc1.deposit(100);
    System.out.println(acc1.getBalance());
    acc1.withdraw(200);
    acc1.withdraw(20);
    System.out.println(acc1.getBalance());
    System.out.println(acc1.toString());
    System.out.println(acc1.authenticate("hello"));
    System.out.println(acc1.authenticate("pingpongball"));
    BankAccount acc2 = new BankAccount(111, "hello");
    System.out.println(acc1.transferTo(acc2, 20, "pingpongball"));
    System.out.println(acc1.transferTo(acc2, 10000, "pingpongball"));
    System.out.println(acc1.transferTo(acc2, 20, "heyyyyy"));
    System.out.println(acc1.transferTo(acc2, -1, "pingpongball"));
  }
}
