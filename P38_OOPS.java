public class P38_OOPS {
    
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "ayush";
        //myAcc.password = "amp";
        myAcc.setPWD("asp");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPWD(String pwd){
        password = pwd;
    }
}
