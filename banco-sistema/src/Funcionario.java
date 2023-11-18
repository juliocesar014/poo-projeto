class Funcionario {
    private String nome;
    private double salario;

   
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

   
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$" + salario);
    }

   
    public double calcularSalarioFinal() {
        return salario;
    }

    
    public String getNome() {
        return nome;
    }
}
