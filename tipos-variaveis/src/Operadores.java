public class Operadores {
    public static void main(String[] args) {
         
        String nomeUm = "Caio";
        String nomeDois =new String("Caio");

        System.out.println(nomeUm.equals(nomeDois));

        boolean condicao1 = true;
        boolean condicao2 = false;


        if (condicao1 && condicao2) {
            System.out.println("As duas condicoes sao verdadeiras");

        }else
        System.out.println("fim....");

        if (condicao1 || condicao2) {
            System.out.println("Uma das condicoes é verdadeiras");            
        }else 
        System.out.println("fim...");



    }
}
