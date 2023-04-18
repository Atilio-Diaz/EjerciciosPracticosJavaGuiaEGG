package cuentas;

import java.util.Scanner;

public class Cuenta {

    private String titular="Aprendiz";
    private float saldo=150000;

    public Cuenta() {
    }

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void Retirar_dinero() {
        Scanner leer=new Scanner(System.in);
        float extrccion;
        System.out.println("Cuanto desea retirar");
        extrccion=leer.nextFloat();
        if (saldo>=0 && extrccion>=0 && extrccion<=saldo && extrccion!=0) {
            saldo-=extrccion;
            System.out.println("TRANSACION EXITOSA");
        }else if(saldo==0){
            System.out.println("NO SE COMPLETO LA OPERACION");
            
        }else if (extrccion<0){
            System.out.println("Para depositos dirijase al sector administrativo");
            
        }else{
             System.out.println("Se exedio en el retiro");
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
}
