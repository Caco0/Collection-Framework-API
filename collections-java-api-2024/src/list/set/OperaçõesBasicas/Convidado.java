package list.set.OperaçõesBasicas;

public class Convidado {


    //atributos 
    private String nome;
    private int codigoConvite;
    
    //construtor padrão
    public Convidado(String nome, int codigoConvite){
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }
    //geters
    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Convidado: Nome= " + nome + ", codigoConvite=" + codigoConvite + "\n";
    }
    
}
