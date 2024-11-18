
class Pengguna {
    protected  String Username;
    protected  String Password;

    public Pengguna(String username, String password){
        this.Username = username;
        this.Password = password; 
    }

    public void login() {
        System.out.println("Login sebagai pengguna umum");
    } 
}


class Mahasiswa extends Pengguna{
    public Mahasiswa(String username, String password){
        super(username, password);
    }
    
    @Override
    public void login() {
        System.out.println("Login sebagai Mahasiswa dengan Nama " + Username);

    }
}

class Dosen extends Pengguna{
    public Dosen (String username, String password){
        super(username, password);
    }

    @Override 
    public void login() {
        System.out.println("Login sebagai Dosen dengan nama " + Username);
    }
}

class Admin extends Pengguna{
    public Admin (String username, String password){
        super(username, password);
    }

    @Override
    public void login() {
        System.out.println(" Login sebgai Admin dengan nama " + Username);
    }
}

public class LoginUser_07651 {
    public static void main(String[] args) {
        Pengguna Mahasiswa = new Mahasiswa("A_07651", "a07651");    
        Pengguna Dosen = new Dosen("A_07651", "a07651");    
        Pengguna Admin = new Admin("A_07651", "a07651");    



        Mahasiswa.login();
        Admin.login();
        Dosen.login();
    }
    
}
