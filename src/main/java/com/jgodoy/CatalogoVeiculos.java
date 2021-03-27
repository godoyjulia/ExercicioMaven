package com.jgodoy;


import java.util.List;
import java.util.ArrayList;

public class CatalogoVeiculos {
   
    private List<Veiculo> veiculos;

    public CatalogoVeiculos(){
     //   veiculos = new ArrayList<>();
     //   veiculos.add(new VeiculoUtilitario("toro", "ABC0987", "fiat", 80.000, 1, 4, 2018));
     //   veiculos.add(new VeiculoUtilitario("saveiro", "LKJ9987", "volkswagen", 50.000,1, 4, 2017));
     //   veiculos.add(new VeiculoPasseio("BNH9876", "FORD", "KA", 2020, 48.000, 9.2));
     //   veiculos.add(new VeiculoPasseio("GHJ5467", "VOLKSWAGEN", "gol", 2019, 39.999, 12.9));
     //   veiculos.add(new VeiculoPassageiros("ABC3390", "VOLVO", "comil", 2011, 450.000, 48));
     //   veiculos.add(new VeiculoPassageiros("GBC6673", "audi", "audi TT", 2016, 193.990,2));

    }

    public Veiculo consultaPorPlaca (String placa){
        for(Veiculo v : veiculos){
            if(v.getPlaca().toLowerCase().equals(placa.toLowerCase())){
                return v;
            }
        }
        return null;
    }

    public List<Veiculo> consultaPorMarca(String marca){
        List<Veiculo> mesmaMarca = new ArrayList<Veiculo>();        
        for (Veiculo v : veiculos) {
            if (v.getMarca().toLowerCase().equals(marca.toLowerCase())) {
                mesmaMarca.add(v);
            }
        }

        return mesmaMarca; 
    }

    public List<Veiculo> consultaPorAno(int ano){
        List<Veiculo> mesmoAno = new ArrayList<Veiculo>();        
        for (Veiculo v : veiculos) {
            if (v.getAno()==ano) {
                mesmoAno.add(v);
            }
        }

        return mesmoAno;
    }

    public List<Veiculo> consultaPorTipo(String tipo){
        List<Veiculo> mesmoTipo = new ArrayList<Veiculo>();
        if(tipo.toLowerCase().equals("passeio")){
            for (Veiculo v : veiculos) {
                if (v instanceof VeiculoPasseio) {
                    mesmoTipo.add(v);
                }
            }
        }    
        else if(tipo.toLowerCase().equals("passageiro")){
            for (Veiculo v : veiculos) {
                if (v instanceof VeiculoPassageiros) {
                    mesmoTipo.add(v);
                }
            }
        }
        else if(tipo.toLowerCase().equals("utilitario")){
            for (Veiculo v : veiculos) {
                if (v instanceof VeiculoUtilitario) {
                    mesmoTipo.add(v);
                }
            }
        }          
        return mesmoTipo;
    }
}
