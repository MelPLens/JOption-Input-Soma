package aulaac1;


public class PessoaJuridica extends Cliente {
    
           //atributos 2
           private int CNPJ;
           private String incricao_estadual;
           private String razao_social;
    
           
            //criando metodo 2
            public void ValidadeCNPJ(){
           
           }

    /**
     * @return the CNPJ
     */
    public int getCNPJ() {
        return CNPJ;
    }

    /**
     * @param CNPJ the CNPJ to set
     */
    public void setCNPJ(int CNPJ) {
        this.CNPJ = CNPJ;
    }

    /**
     * @return the incricao_estadual
     */
    public String getIncricao_estadual() {
        return incricao_estadual;
    }

    /**
     * @param incricao_estadual the incricao_estadual to set
     */
    public void setIncricao_estadual(String incricao_estadual) {
        this.incricao_estadual = incricao_estadual;
    }

    /**
     * @return the razao_social
     */
    public String getRazao_social() {
        return razao_social;
    }

    /**
     * @param razao_social the razao_social to set
     */
    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
    
}
