
package avaliacao;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner gt = new Scanner(System.in);
        Empresa e= new Empresa();
        int opcao;
        do{
            String TextBlock="""
                            1-Cadastrar contrato
                            2- imprimir contrato de um cliente
                            3- Imprimir um contrato pelo numero/ano
                            4- Sair
                            Digite a opção:
                            """;
                            System.out.println(TextBlock);
                            opcao = gt.nextInt();
                            switch(opcao){
                                case 1:
                                    e.cadastrarContrato();
                                    break;
                                case 2:
                                    System.out.println("Digite CNPJ:");
                                    e.imprimirContrato(e.pesquisarCliente(gt.next()));
                                    break;
                                case 3:
                                    System.out.println("Digite numero e ano do contrato:");
                                    Contrato c= e.pesquisarContrato(gt.nextInt(),gt.nextInt());
                                    if(c!=null)
                                        System.out.println(c.toString());
                                    else
                                        System.out.println("COntrato não encontrado");
                                case 4:
                                    System.out.println("programa finalizado");
                                default:
                                    System.out.println("Opção inválida");
                                    
                            }
                            
        }while(opcao!=4);
        gt.close();
     
    }
    
}
