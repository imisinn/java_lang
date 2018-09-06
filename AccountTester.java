class Account{
    String name;
    String no;
    long balance;
}

class AccountTester{
    public static void main(String[] args){
        Account adachi = new Account();

        adachi.name = "足立幸一";
        adachi.no = "123456";
        adachi.balance = 1000;

        adachi.balance +=100;

        System.out.println("口座名義 :" + adachi.name + "  口座番号:" + adachi.no + "   預金残高:" + adachi.balance);
    }
}
