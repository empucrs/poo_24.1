public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private String risco;
    
    public Funcionario(String matricula, String nome, double salarioBruto, String risco){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        if(risco.toUpperCase().equals("RISCO"))
            this.risco = risco.toUpperCase();
        else
            this.risco = "COMUM";
    }

	public String getMatricula() {
		return matricula;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalarioBruto() {
		return salarioBruto;
	}

    public String getRisco(){
        return risco;
    }
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        double sb = salarioBruto;
        
        if(risco.equals("RISCO"))
            sb = sb - getINSS() + getInsalubridade();

        if (sb <= LIM_ISENCAO_IR){
            return 0.0;
        }else{
            double aux = sb - LIM_ISENCAO_IR;
            double ir = aux * 0.2;
            return ir;
        }
    }

    public double getInsalubridade(){
        double insalubridade = 0;
        if(risco.equals("RISCO")){            
            insalubridade = (salarioBruto - getINSS())*0.25;
        }
        return insalubridade;
    }

    public double getSalarioLiquido(){
        return salarioBruto - getINSS() - getImpRenda() + getInsalubridade();
    }

    public String toString() {
        String aux = "";
        aux += "Categoria: "+this.getClass().getName()+"\n";
        aux += "Matricula: "+this.getMatricula()+"\n";
        aux += "Categoria: "+this.getRisco()+"\n";
        aux += "Nome: "+this.getNome()+"\n";
        aux += "Salario bruto: "+this.getSalarioBruto()+"\n";
        aux += "(-) INSS: "+this.getINSS()+"\n";
        aux += "(-) IR: "+this.getImpRenda()+"\n";
        aux += "(+) INSALUBRIDADE: "+this.getInsalubridade()+"\n";
        aux += "Salario liquido: "+this.getSalarioLiquido()+"\n";
        aux += "----------";
        return aux;    
    }
}