class Account{
    private String name;
    private String no;
    private long balance;

    Account(String n,String num,long z){
        name = n;
        no = num;
        balance = z;
    }

    String getName(){
        return name;
    }

    String getNo(){
        return no;
    }

    long getBalance(){
        return balance;
    }

    void deposit(long k){
        balance += k;
    }

    void withdraw(long k){
        balance -= k;
    }
}

class AccountTester{
    public static void main(String[] args){
        Account adachi = new Account("足立幸一","123456",1000);

        adachi.withdraw(200);

        System.out.println("口座名義 :" + adachi.getName() + "  口座番号:" + adachi.getNo() + "   預金残高:" + adachi.getBalance());
    }
}
