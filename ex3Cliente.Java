package aulaac1;
// classe mãe

public class Cliente {
     // classe 1
        
        
        
         //atributos 1
         private String nome;
         private String endereco;
         private String cidade;
         private String UF;
         private int CEP;
        
         
         // get e set dos atributos
         public String getNome() {
            return nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.nome = nome;
        }

        /**
         * @return the endereco
         */
        public String getEndereco() {
            return endereco;
        }

        /**
         * @param endereco the endereco to set
         */
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        /**
         * @return the cidade
         */
        public String getCidade() {
            return cidade;
        }

        /**
         * @param cidade the cidade to set
         */
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }

        /**
         * @return the UF
         */
        public String getUF() {
            return UF;
        }

        /**
         * @param UF the UF to set
         */
        public void setUF(String UF) {
            this.UF = UF;
        }

        /**
         * @return the CEP
         */
        public int getCEP() {
            return CEP;
        }

        /**
         * @param CEP the CEP to set
         */
        public void setCEP(int CEP) {
            this.CEP = CEP;
        }
        
          //criando metodo 1
         public void IncluirNovoCliente(String nome, String endereco, String UF , String Cidade, String CEP){ // argummento do metodo
             this.nome=nome;
             this.endereco = endereco;
             this.UF=UF;
             this.cidade=Cidade;
             this.CEP= CEP;
         
     
         }
          public void AtualizarCliente(){
         }
}
