# **2025-OBJPROG-LAB023**
Week 05 - Methods in Java

Laboratory # 23 - Week 05 - Guided Coding Exercise 2: Using Access Modifiers, Methods, and Attributes

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 23 - Week 05 - Guided Coding Exercise 2: Using Access Modifiers, Methods, and Attributes**

   **Objective:**
   - Understand and use access modifiers (public, private, protected).
   - Define methods and attributes within a class.

   **File Naming Convention:**
   - `BankAccountDemo.java`

   **Desired Output:**
   ```txt
   Account Holder: Alice
   Account Type: Checking
   Current Balance: $1150.0
   ```

   **Notable Observations:**
   - You can directly access the accountHolder and accountType because they have public and protected access respectively.
   - You cannot directly access balance (private) from the main method.
   - You need to use the public methods (deposit, withdraw, getBalance) to interact with the private balance.

   **Java Programming Best Practices:**
   - Use private access for sensitive data to protect it from unintended modification.
   - Provide public methods to allow controlled access to private attributes.
   - Use protected access when you want to allow access within the same package and subclasses.
      
   **Step-by-Step Instructions:**

   1. Create the BankAccount Class
      - Create a new Java file named `BankAccountDemo.java`.
      - Define a class called `BankAccount`.
      ```Java      
      class BankAccount {
          // Code will go here
      }
      ```
            
   2. Add Attributes with Access Modifiers
      - Inside the BankAccount class, declare three instance variables (attributes) with different access modifiers:
         - accountHolder of type String with public access.
         - balance of type double with private access.
         - accountType of type String with protected access.
      ```Java
      class BankAccount {
          public String accountHolder;
          private double balance;
          protected String accountType;
      }
      ```

   3. Create a Constructor
      - Inside the BankAccount class, create a constructor.
      - The constructor should take three parameters:
         - a String for the accountHolder
         - a double for the balance
         - a String for the accountType
      - Inside the constructor, initialize the accountHolder, balance, and accountType attributes using the provided parameters.
      ```Java
      class BankAccount {
          //... (attributes)...
      
          public BankAccount(String accountHolder, double balance, String accountType) {
              this.accountHolder = accountHolder;
              this.balance = balance;
              this.accountType = accountType;
          }
      }
      ```

   4. Add a deposit Method
      - Inside the BankAccount class, create a method named deposit.
      - This method should take a double parameter named amount.
      - Add logic to increase the balance by the amount if the amount is positive.
      ```Java
      class BankAccount {
          //... (attributes and constructor)...
      
          public void deposit(double amount) {
              if (amount > 0) {
                  balance += amount;
              }
          }
      }
      ```

   5. Add a withdraw Method
      - Inside the BankAccount class, create a method named withdraw.
      - This method should take a double parameter named amount.
      - Add logic to decrease the balance by the amount only if the amount is positive and less than or equal to the current balance.
      ```Java
      class BankAccount {
          //... (other methods)...
      
          public void withdraw(double amount) {
              if (amount > 0 && amount <= balance) {
                  balance -= amount;
              }
          }
      }
      ```

   6. Add a getBalance Method
      - Inside the BankAccount class, create a method named getBalance.
      - This method should return a double value representing the current balance.
      ```Java
      class BankAccount {
          //... (other methods)...
      
          public double getBalance() {
              return balance;
          }
      }
      ```

   7. Create the main Method
      - In the same file (BankAccountDemo.java), outside the BankAccount class, create the main method.
      ```Java
      public class BankAccountDemo {
          public static void main(String[] args) {
              // Code will go here
          }
      }
      ```

   8. Create a BankAccount Object
      - Inside the main method, create an object of the BankAccount class named myAccount. Use the constructor to initialize the accountHolder, balance, and accountType with appropriate values.
      ```Java
      BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");
      ```

   9. Access and Modify Account Details
      - In the main method:
         - Call the deposit method to deposit some amount into the account.
         - Call the withdraw method to withdraw some amount.
         - Print the accountHolder name using myAccount.accountHolder.
         - Print the accountType using myAccount.accountType.
         - Print the current balance using myAccount.getBalance().
      ```Java
      myAccount.deposit(250.0);
      myAccount.withdraw(100.0);
      System.out.println("Account Holder: " + myAccount.accountHolder);
      System.out.println("Account Type: " + myAccount.accountType);
      System.out.println("Current Balance: $" + myAccount.getBalance());
      ```

   10. Compile and Run
       - Save the file as `BankAccountDemo.java`.
       - Compile the code using `javac BankAccountDemo.java` in your terminal or command prompt.
       - Run the compiled code using `java BankAccountDemo`.

   **Conclusion**
   This exercise demonstrated the use of access modifiers in Java. Access modifiers control the visibility and accessibility of class members (attributes and methods). By using appropriate access modifiers, you can encapsulate data and protect it from unauthorized access, leading to more robust and maintainable code.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 23"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
