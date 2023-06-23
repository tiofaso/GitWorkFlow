public class CheckLogin {
    protected String senhaUrs;
    protected String emailUrs;
    protected String fakeDbSenha = "4e5b8e5ec40ac2625e80d66fbc2f61c7";
    protected String fakeDbEmail = "catalisa@zup.com.br";

  public int VerificaEmail(String email){
        if(fakeDbEmail != email){return 1;}
        else{return 0;}
    }

    public int VerificaSenha(String senha){
        MD5Encryption senhaUsr = new MD5Encryption();
        String senhaTeste = senhaUsr.encryptToMD5(senha);
        int validacao = 0;
       if( senhaTeste != fakeDbSenha) {validacao = 1;}
       else if( senhaTeste == fakeDbSenha) {validacao = 0;}

       return validacao;
    }
}
