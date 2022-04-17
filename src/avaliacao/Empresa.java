package avaliacao;
import java.util.Scanner;
public class Empresa {
    private Contrato[] contratos = new Contrato[200];
    private Cliente [] clientes = new Cliente[200];
    
    public Empresa(){
        
    }
    public void cadastrarContrato(){
        
        Scanner gt = new Scanner(System.in);
        int tp,flag;
        String trans;
        System.out.println("Digite o CNPJ do cliente: ");
        Cliente cliente = pesquisarCliente(gt.next());
        Contrato c = null;
        Propaganda p = null;
        char op;
        
        if(cliente!=null){
            
            c= new Contrato(cliente);
            do{
                
                do{
                    System.out.println("Digite o tipo de propaganda que deseja inserir:[1]Radio [2]Tv ");
                    tp = gt.nextInt();
                    }while(tp!=1 && tp!=2);
                    switch(tp){
                        
                        case 1:
                            System.out.println("Propaganda em radio, digite o tipo de transmissão [FM] [AM] ou [AMBAS]");
                            trans = gt.next().toUpperCase();
                            do{
                                System.out.println("Digite o tipo: [1]Merchandising [2]Spot [3]Jingle");
                                flag=gt.nextInt();
                            }while(flag!=1 && flag!= 2 && flag != 3);
                            System.out.println("Digite a duracao em semana:");
                            p=new Radio (gt.nextInt(),trans,flag);
                            c.adicionarPropagandas(p);
                            break;
                        case 2:
                            System.out.println("Propaganda em Tv. digite o horario [Dia] {Nobre] ou [Corujão]");
                            trans = gt.next().toUpperCase();
                            do{
                                System.out.println("digite o tipo: [1]Merchandising [2]Comercial");
                                flag=gt.nextInt();
                            }while(flag!=1 && flag!=2);
                            System.out.println("Digite a duração em semanas:");
                            p= new Tv(trans,gt.nextInt(),flag);
                            c.adicionarPropagandas(p);
                            break;
                        default:
                            System.out.println("Opção invalida");
                    }
                    System.out.println("Inserir Propaganda ao contrato?(S/N)");
                    op=gt.next().toUpperCase().charAt(0);
                }while(op!='N');
                for(int i=0;i<contratos.length;i++){
                    if(contratos[i]==null){
                        contratos[i]=c;
                        break;
                    }
                }
            
            }
        else{
            System.out.println("Vamos cadastrar o cliente");
            System.out.println("Digite CNPJ, razão social, nome do contato, telefone e e-mail:");
            Cliente c1= new Cliente(gt.next(),gt.next(),gt.next(),gt.next(),gt.next());
            for(int i = 0;i<clientes.length;i++){
                if(clientes[i]==null){
                    clientes[i]=c1;
                    break;
                }
            }
            
                
           }
    
        } 
    public Cliente pesquisarCliente(String cnpj){
        for(int i=0;i<clientes.length;i++){
            if((clientes[i]!=null)&&(clientes[i].getCnpj().equals(cnpj))){
                return clientes[i];
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }
    public Contrato pesquisarContrato(int numero, int ano){
        for(int i=0;i<clientes.length;i++){
            if((contratos[i]!=null)&& (contratos[i].getNumero()==numero)&&(contratos[i].getAno()==ano)){
                return contratos[i];
            }
        }
        return null;
    } 
    public void imprimirContrato(Cliente cliente){
        boolean flag=false;
        for(int i=0;i<contratos.length;i++){
            if((contratos[i]!=null)&& (contratos[i].getCliente().equals(cliente))){
                flag=true;
                System.out.println(contratos[i].toString());
            }
        }
        if(!flag)
            System.out.println("Nenhum contrato encontrado para este cliente.");
    }
     
    
    
    
    
    
}

    