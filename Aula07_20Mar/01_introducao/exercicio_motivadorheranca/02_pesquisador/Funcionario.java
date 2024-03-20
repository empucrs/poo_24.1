public class Funcionario{
    public static final double LIM_ISENCAO_IR = 2000;
    private String matricula;
    private String nome;
    private double salarioBruto;
    private String categoria;
    private int especializacao;
    
    public Funcionario(String matricula, String nome, double salarioBruto, String categoria, int especializacao){
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        if(categoria.toUpperCase().equals("RISCO"))
            this.categoria = categoria.toUpperCase();
        else if(categoria.toUpperCase().equals("PESQUISADOR")){
            this.categoria = categoria.toUpperCase();
            if(especializacao>=1)
                this.especializacao=especializacao;
            else
                this.especializacao=1;
        }
        else
            this.categoria = "COMUM";
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

    public String getcategoria(){
        return categoria;
    }

    public int getEspecilizacao(){
        return especializacao;
    }

    public void setEspecilizacao(int especializacao){
        if(categoria.equals("PESQUISADOR") && (especializacao>=1))
            this.especializacao=especializacao;
    }
    
    public double getINSS(){
        return salarioBruto*0.1;
    }

    public double getImpRenda(){
        double sb = salarioBruto;
        
        if(categoria.equals("RISCO"))
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
        if(categoria.equals("RISCO")){            
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
        aux += "Categoria: "+this.getcategoria()+"\n";
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