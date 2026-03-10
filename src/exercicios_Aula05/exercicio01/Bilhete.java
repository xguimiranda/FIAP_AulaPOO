package exercicios_Aula05.exercicio01;

import java.util.Random;

public class Bilhete {
    int numero;
    String user;
    double saldo;
    static double tarifa = 5.40;
    String tipoTarifa;

    public Bilhete(String user, String tipoTarifa) {
        Random r = new Random();
        this.numero = r.nextInt(1000, 9999);
        this.user = user;
        this.saldo = 0;
        this.tipoTarifa = tipoTarifa;
    }

    public int getNumero() {
        return numero;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getSaldo() {
        return saldo;
    }

    public static double getTarifa() {
        return tarifa;
    }

    public String getTipoTarifa() {
        return tipoTarifa;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public void carregar(double valor) {
        if(valor <= 0) {
            return;
        }
        saldo += valor;
    }

    public boolean passarNaCatraca() {
        double valor = tarifa;
        if(tipoTarifa.equalsIgnoreCase("estudante") ||
                tipoTarifa.equalsIgnoreCase("professor")) {
            valor = valor / 2;
        }


        if(saldo < valor) {
            return false;
        }

        saldo = saldo - valor;
        return true;
    }

}
