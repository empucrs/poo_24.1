public class CadastroCliente {
    private Cliente [] listaDeClientes;
    int nClientes;

    public CadastroCliente(){
        listaDeClientes = new Cliente[100];
        nClientes=0;
    }

    public void insereClienteFisico(String nome, int idade, double salario){
        listaDeClientes[nClientes]= new ClienteFisico(nome, idade, salario);
        nClientes++;        
    }

    public void insereClienteJuridico(String nome, double mensalidade){
        listaDeClientes[nClientes]= new ClienteJuridico(nome, mensalidade);
        nClientes++;        
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("lista de clientes\n");
        for(Cliente c: listaDeClientes)
            if(c!=null){
                if(c instanceof ClienteFisico)
                    sb.append("CPF: "+c.getNome()+"; R$ "+c.getMensalidade()+"\n");
                else
                    sb.append("CNPJ: "+c.getNome()+"; R$ "+c.getMensalidade()+"\n");
            }
        return sb.toString();
    }

    



    
}
