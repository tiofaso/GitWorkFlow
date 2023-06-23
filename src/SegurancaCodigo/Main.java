import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

class MD5Encryption { //made by chat gpt
    public static String encryptToMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());
            byte[] digest = md.digest();

            // Convert the byte array to hexadecimal representation
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        //usr: catalisa@zup.com.br
        //senha: 123456Catalisa

        Scanner entrada = new Scanner(System.in);

        System.out.printf("Seja bem-vinde!\n");

        System.out.printf("Digite o seu e-mail:");
        String email = entrada.nextLine();

        System.out.printf("Digite a sua senha:");
        String senha = entrada.nextLine();

        //Instanciando objeto
        CheckLogin usr = new CheckLogin();

         int verificaAcesso = 0;

         //Verificando e-mail
         if(usr.VerificaEmail(email) == 1){ verificaAcesso = verificaAcesso + 1;}
         //Verificando senha
         if(usr.VerificaSenha(senha) == 1){ verificaAcesso = verificaAcesso + 1;}

         if(verificaAcesso == 2){
             System.out.printf("Login realizado com sucesso!");
         }else{System.out.printf("Dados inválidos");}


    }
}