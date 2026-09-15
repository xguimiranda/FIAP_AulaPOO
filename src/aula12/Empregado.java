package aula12;

public record Empregado(String nome, double  salario, int anoDeExperiencia) {

    @Override
    public String toString() {
        return "Empregado: \n" +
                "nome= " + nome + '\n' +
                "salario= " + salario +
                "\nanoDeExperiencia= " + anoDeExperiencia + "\n";
    }
}
