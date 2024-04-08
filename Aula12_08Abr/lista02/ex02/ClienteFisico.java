public class ClienteFisico extends Cliente{
    private int idade;
    private double salario;

    public ClienteFisico(String nome, int idade, double salario){
        super(nome);
        this.idade=idade;
        this.salario=salario;
    }

    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
        if((idade>0)&&(idade<120)){
            this.idade=idade;
        }
    }
    public double getSalario(){
        return this.salario;        
    }
    public void setSala1rio(double salario){
        if(salario>0){
            this.salario=salario;            
        }
    }

    public double getMensalidade(){
        if(this.idade<60)
            return salario*0.10;
        else
            return salario*0.15;
    }

}
