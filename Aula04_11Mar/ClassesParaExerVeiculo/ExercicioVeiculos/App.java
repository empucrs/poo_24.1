public class App{
    public static void main(String args[]){

        if(args.length!=4){
            System.out.println("Os parametros não foram informados adequadamente");            
            System.out.println("Parametros esperados");            
            System.out.println("java app <codigoDaPlaca> <PaisDeOrigem> <qtdeAbastecimento> <quilometrosDeslocamento>");
            System.exit(0);
        }

        Placa p1 = new Placa(args[1], args[0]);
        
        Veiculo v1 = new Veiculo(p1, 10);
        Veiculo v2 = new Veiculo(p1, 50);
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("v1\n"+v1);
        System.out.println("v2\n"+v2);

        v1.setPais("Paraguai");
        System.out.println("-=-=-=-=-=-=-=-=-");
        System.out.println("v1\n"+v1);
        System.out.println("v2\n"+v2);

       }
}