public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password) {
    accountID = accountID;
    password = password;
    balance = 0;
  }

  public String toString(){
    return ("Account ID: " + accountID+", password: "+password+", balance: "+balance);
  }

  public double getBalance() {
    return (balance);
  }

  public int getAccountID() {
    return (accountID);
  }

  public void setPassword(String newPass) {
    password = newPass;
  }

  public boolean deposit(double amount) {
    if ((balance + amount) >= 0) {
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount) {
    if ((balance - amount) >= 0) {
      balance -= amount;
      return true;
    }
    return false;
  }
}
