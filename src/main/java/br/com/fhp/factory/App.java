package br.com.fhp.factory;


import br.com.fhp.factory.enumeradores.ClimaEnum;
import br.com.fhp.factory.enumeradores.CombustivelEnum;
import br.com.fhp.factory.factory.FabricaVeiculo;
import br.com.fhp.factory.factory.Factory;
import br.com.fhp.factory.modelo.Veiculo;

public class App
{
    public static void main( String[] args )
    {

        FabricaVeiculo fabricaConcreta = new FabricaVeiculo();
        problema(fabricaConcreta);
        extensaoDoProblema(fabricaConcreta);


    }

    public static void problema(Factory fabricaConcreta){
        System.out.println("################### PARÂMETROS CLIMA E QUANTIDADE DE PESSOAS ############################################\n");

        System.out.println("---- FABRICANDO TESLA ------");
        Veiculo veiculo = fabricaConcreta.controiCarro(ClimaEnum.SOL, 2);

        veiculo.imprimir();

        System.out.println("---- FABRICANDO ESCORTE ------");
        veiculo = fabricaConcreta.controiCarro(ClimaEnum.SOL, 3);

        veiculo.imprimir();

        System.out.println("---- FABRICANDO OPALA ------");
        veiculo = fabricaConcreta.controiCarro(ClimaEnum.CHUVA, 3);

        veiculo.imprimir();

        System.out.println("---- FABRICANDO VAN BESTA ------");
        veiculo = fabricaConcreta.controiCarro(ClimaEnum.SOL, 10);

        veiculo.imprimir();
    }

    public static void extensaoDoProblema(Factory fabricaConcreta){
        System.out.println("\n###################### PARÂMETROS COMBUSTÍVEL #####################################\n");

        System.out.println("---- FABRICANDO TESLA ------");
        Veiculo veiculo = fabricaConcreta.controiCarro(CombustivelEnum.ELETRICIDADE);

        veiculo.imprimir();

        System.out.println("---- FABRICANDO ESCORTE ------");
        veiculo = fabricaConcreta.controiCarro(CombustivelEnum.ALCOOL);

        veiculo.imprimir();

        System.out.println("---- FABRICANDO OPALA ------");
        veiculo = fabricaConcreta.controiCarro(CombustivelEnum.GASOLINA);

        veiculo.imprimir();

        System.out.println("---- FABRICANDO VAN BESTA ------");
        veiculo = fabricaConcreta.controiCarro(CombustivelEnum.DIESEL);

        veiculo.imprimir();
    }
}
