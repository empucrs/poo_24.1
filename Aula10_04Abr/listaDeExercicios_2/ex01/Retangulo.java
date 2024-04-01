/**
 * Retangulo
 */
public class Retangulo extends FiguraBidimensional{
    private int altura, largura;
    public Retangulo(int x, int y, int altura, int largura){
        super(x,y);
        this.altura=altura;
        this.largura=largura;
    }
    public double area() {
        return altura*largura;
    };
    public int getX_inferiorEsquerdo(){
        return this.getX();
    }
    public int getX_SuperiorEsquerdo(){
        return getX_inferiorEsquerdo();
    }
    public int getY_inferiorEsquerdo(){
        return this.getY();
    }
    public int getY_SuperiorEsquerdo(){
        return this.getY()+this.altura;
    }
    public int getX_inferiorDireito(){
        return this.getX()+this.largura;
    }
    public int getX_SuperiorDireito(){
        return this.getX_inferiorDireito();
    }
    public int getY_inferiorDireito(){
        return this.getY();
    }
    public int getY_SuperiorDireito(){
        return getY_SuperiorEsquerdo();
    }   

}