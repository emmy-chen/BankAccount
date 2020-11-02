public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String p) {
    accountID = ID;
    password = p;
    balance = 0;
  }

  public String getInfo(){
    return ("Account ID: #" + accountID+", password: "+password+", balance: $"+balance);
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

  public String toString() {
    return ("#" + accountID+ "\t" + "$" + balance);
  }

  public boolean authenticate(String password) {
    return (this.password.equals(password));
  }


  public boolean transferTo(BankAccount other, double amount, String password) {
    this.password = password;
    if (this.authenticate(password) == false) {
      return false;
    }
    if ((this.balance - amount) >= 0) {
      this.balance -= amount;
      other.deposit(amount);
    }
    return true;
  }
}
