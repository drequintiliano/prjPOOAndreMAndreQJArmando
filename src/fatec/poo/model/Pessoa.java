package fatec.poo.model;

public class Pessoa {
    private String nome;
    private String dataNasc;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String sexo;
    private String estadoCivil;
    private String rg;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public static boolean validarCPF(String CPF){
        /*double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        double p6 = 0;
        double p7 = 0;
        double p8 = 0;
        double p9 = 0;
        double cpf_2 = 0;
        double cpf_3 = 0;
        
        Valida_CPF = Valida_CPF.replaceAll("\\.-", "");
        
        char[] posicao = new char[Valida_CPF.length()];
        
        for(int x = 0; x <= Valida_CPF.length(); x++){
            posicao[x] = Valida_CPF.charAt(x);
       }
       
      /*
        String minhaString ="ESTA_EH_A_MINHA_STRING";
		//.length() retorna o tamanho da string em inteiros 
		char[] meuArray = new char[minhaString.length()];
		for (int i=0;i<minhaString.length();i++){
			//charAt(i) retorna  o caracter no index especificado
			meuArray[i]=minhaString.charAt(i);
		}
      */
        long digito_1 = 0;
        long digito_2 = 0;
        long digito_1validado = 0;
        long digito_2validado = 0;
        long p_a = 0, p1=0, n1 = 0;
        long p_b = 0, p2=0, n2 = 0;
        long p_c = 0, p3=0, n3 = 0;
        long p_d = 0, p4=0, n4 = 0;
        long p_e = 0, p5=0, n5 = 0;
        long p_f = 0, p6=0, n6 = 0;
        long p_g = 0, p7=0, n7 = 0;
        long p_h = 0, p8=0, n8 = 0;
        long p_i = 0, p9=0;
        long cpf_2 = 0;
        long cpf_3 = 0;
        
        //CPF = CPF.replaceAll("\\.-", "");
        long val_cpf = Long.parseLong(CPF);        
                
        digito_2 = val_cpf%10;
        cpf_2 = val_cpf - digito_2;
        
        digito_1 = (cpf_2%100)/10;
        cpf_3 = (cpf_2-(digito_1*10))/100;
        
        p_a = cpf_3/100000000;        
        p_b = cpf_3/10000000;        
        p_c = cpf_3/1000000;        
        p_d = cpf_3/100000;        
        p_e = cpf_3/10000;        
        p_f = cpf_3/1000;        
        p_g = cpf_3/100;        
        p_h = cpf_3/10;        
        p_i = cpf_3/1;        
        
        n1 = p_a*10;        
        n2 = p_b*10;        
        n3 = p_c*10;        
        n4 = p_d*10;        
        n5 = p_e*10;        
        n6 = p_f*10;        
        n7 = p_g*10;        
        n8 = p_h*10;        
        
        p1 = p_a;        
        p2 = p_b - n1;        
        p3 = p_c - n2;        
        p4 = p_d - n3;        
        p5 = p_e - n4;        
        p6 = p_f - n5;        
        p7 = p_g - n6;        
        p8 = p_h - n7;        
        p9 = p_i - n8;        
        
        digito_1validado = ((p1*1 + p2*2 + p3*3 + p4*4 + 
                            p5*5 + p6*6 + p7*7 + p8*8 +
                            p9*9)%11);
        
        if(digito_1validado == 10){
            digito_1validado = 0;
            System.out.print("\nDigito_1 válido = " + digito_1validado);
        }else{
            System.out.print("\nDigito_1 válido = " + digito_1validado);
        }
        
        digito_2validado = (((p1*11 + p2*10 + p3*9 + p4*8 +
                            p5 *7 + p6 *6 + p7*5 + p8*4 +
                            p9*3  + digito_1validado*2) * 10)%11);
                
        if(digito_2validado == 10){
            digito_2validado = 0;
            System.out.print("\nDigito_2 válido = " + digito_2validado);
        }else{
            System.out.print("\nDigito_2 válido = " + digito_2validado);
        }
        
        if(digito_1==digito_1validado && digito_2==digito_2validado){ 
            return(true);
        }else{
            return(false);
        }        
    }
}