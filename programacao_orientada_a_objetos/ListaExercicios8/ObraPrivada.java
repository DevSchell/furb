package ListaExercicios8;

public class ObraPrivada extends Obra{
    private int codigoArea;
    private double areaDoTerreno;
    private double comprimento;
    private double largura;

    public void gerarResumo() {
        //TODO: Implement method...
    }

    public int getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(int codigoArea) {
        this.codigoArea = codigoArea;
    }

    public double getAreaDoTerreno() {
        return areaDoTerreno;
    }

    public void calcularAreaDoTerreno(double areaDoTerreno) {
        this.areaDoTerreno = largura * comprimento;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
}