package br.com.mfraga;

public class Pessoa {
    private String name;
    private int age;
    private String cpf;
    private String rg;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     *
     * @param email usar este método para mudança de email.
     */
    public void mudarEmail(String email){
        setEmail(email);
    }

    public String apresentar(){
        return "Olá, meu nome é " + name;
    }

    public String falar(String frase){
        return name + " diz: " + frase;
    }
}
