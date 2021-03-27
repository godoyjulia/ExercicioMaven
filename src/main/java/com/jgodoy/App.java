package com.jgodoy;

import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.Reader;

public class App {
    public static void main(String[] args) throws Exception {
       
		try ( 

			//veiculo passageiro
			Reader reader1 = Files.newBufferedReader(Paths.get("/workspaces/Projetos2/ExercicioMaven/src/main/java/com/jgodoy/ListaVeiculoPassageiro.csv")); 
			CSVParser csvParser1 = new CSVParser(reader1, CSVFormat.DEFAULT); 

			//veiculo passeio
			Reader reader2 = Files.newBufferedReader(Paths.get("/workspaces/Projetos2/ExercicioMaven/src/main/java/com/jgodoy/ListaVeiculoPasseio.csv")); 
			CSVParser csvParser2 = new CSVParser(reader2, CSVFormat.DEFAULT); 

			//veiculo utilitario
			Reader reader3 = Files.newBufferedReader(Paths.get("/workspaces/Projetos2/ExercicioMaven/src/main/java/com/jgodoy/ListaVeiculoUtilitario.csv")); 
			CSVParser csvParser3 = new CSVParser(reader3, CSVFormat.DEFAULT); 
		) { 

			System.out.println("Veiculos de Passageiros:");
			for (CSVRecord csvRecord : csvParser1) { 

				if (csvRecord.getRecordNumber() >1){//para não pegar o "cabeçalho"
					// Accessing Values by Column Index 
					String placa = csvRecord.get(0); 
					String marca = csvRecord.get(1);
					String modelo = csvRecord.get(2);
					int ano = Integer.parseInt(csvRecord.get(3));
					double preco = Double.parseDouble(csvRecord.get(4)); 
					int nroPass = Integer.parseInt(csvRecord.get(5));

					VeiculoPassageiros v = new VeiculoPassageiros (
						placa, marca, modelo, ano, preco, nroPass
					);

					System.out.println("Record No - " + csvRecord.getRecordNumber());
					System.out.println("---------------");
					System.out.println("Tipo   : "  + v.getTipo());
					System.out.println("Placa  : "  + v.getPlaca());
					System.out.println("Marca  : "  + v.getMarca()); 
					System.out.println("Modelo : "  + v.getModelo()); 
					System.out.println("Preço  : "  + v.getValor()); 
					System.out.println("---------------\n\n"); 

				}//fecha if		
			}//fecha for

			System.out.println("Veiculos de Passeio:");
			for (CSVRecord csvRecord : csvParser2) { 

				if (csvRecord.getRecordNumber() >1){//para não pegar o "cabeçalho"
						
					String placa = csvRecord.get(0); 
					String marca = csvRecord.get(1);
					String modelo = csvRecord.get(2);
					int ano = Integer.parseInt(csvRecord.get(3));
					double preco = Double.parseDouble(csvRecord.get(4)); 
					double consumo = Double.parseDouble(csvRecord.get(5));

					VeiculoPasseio v = new VeiculoPasseio (
						placa, marca, modelo, ano, preco, consumo
					);

					System.out.println("Record No - " + csvRecord.getRecordNumber());
					System.out.println("---------------");
					System.out.println("Tipo   : "  + v.getTipo());
					System.out.println("Placa  : "  + v.getPlaca());
					System.out.println("Marca  : "  + v.getMarca()); 
					System.out.println("Modelo : "  + v.getModelo()); 
					System.out.println("Preco  : "  + v.getValor()); 
					System.out.println("---------------\n\n"); 

				}//fecha if		
			}//fecha for

			System.out.println("Veiculos Utilitários:");
			for (CSVRecord csvRecord : csvParser3) { 

				if (csvRecord.getRecordNumber() >1){//para não pegar o "cabeçalho"
						
					String modelo = csvRecord.get(0); 
					String placa = csvRecord.get(1);
					String marca = csvRecord.get(2);
					double preco = Double.parseDouble(csvRecord.get(3)); 
					int capTon = Integer.parseInt(csvRecord.get(4));
					int nroEixo = Integer.parseInt(csvRecord.get(5));
					int ano = Integer.parseInt(csvRecord.get(6));
					

					VeiculoUtilitario v = new VeiculoUtilitario (
						modelo, placa, marca, preco, capTon, nroEixo, ano
					);

					System.out.println("Record No - " + csvRecord.getRecordNumber());
					System.out.println("---------------");
					System.out.println("Tipo   : "  + v.getTipo());
					System.out.println("Placa  : "  + v.getPlaca());
					System.out.println("Marca  : "  + v.getMarca()); 
					System.out.println("Modelo : "  + v.getModelo()); 
					System.out.println("Preco  : "  + v.getValor()); 
					System.out.println("---------------\n\n"); 

				}//fecha if		
			}//fecha for

		}//fecha try
		catch(Exception e){
			System.out.println("erro!");
		}







		/*
        Scanner sc = new Scanner(System.in);

		CatalogoVeiculos cv = new CatalogoVeiculos();

		System.out.println("Bem vindo, \nEscolha uma forma de consulta:");
		System.out.println("a) Por Placa");
		System.out.println("b) Por Marca");
		System.out.println("c) Por Ano");
		System.out.println("d) Por Tipo");

		char escolhaConsulta = sc.nextLine().charAt(0);

		if (escolhaConsulta == 'a'){
			System.out.print("Digite a placa: ");
			String placa = sc.next();
			if (cv.consultaPorPlaca(placa) == null){
				System.out.println("Nenhum veiculo encontrado.");
			}
			else{
				System.out.println("Veiculo encontrado:");
				System.out.println("Marca: "+ cv.consultaPorPlaca(placa).getMarca());
				System.out.println("Ano: "+ cv.consultaPorPlaca(placa).getAno());
				System.out.println("Tipo: "+ cv.consultaPorPlaca(placa).getClass());
			}
		}
		else if (escolhaConsulta == 'b'){
            System.out.print("Digite a marca: ");
			String marca = sc.next();
			if (cv.consultaPorMarca(marca).isEmpty()){
				System.out.println("Nenhum veiculo encontrado.");
			}
			else{
				System.out.println("Veiculo(s) encontrado(s):");
				for (Veiculo v: cv.consultaPorMarca(marca)){
					System.out.println("Placa: "+ v.getPlaca());
					System.out.println("Ano: "  + v.getAno());
					System.out.println("Tipo: " + v.getClass());
				}
			}
		}
		else if (escolhaConsulta == 'c'){
            System.out.print("Digite o ano: ");
			int ano = sc.nextInt();
			if (cv.consultaPorAno(ano).isEmpty()){
				System.out.println("Nenhum veiculo encontrado.");
			}
			else{
				System.out.println("Veiculo(s) encontrado(s):");
				for (Veiculo v: cv.consultaPorAno(ano)){
					System.out.println("Placa: "+ v.getPlaca());
					System.out.println("Marca: "  + v.getMarca());
					System.out.println("Tipo: " + v.getClass());
				}
			}
		}
		else if (escolhaConsulta == 'd'){
            System.out.print("Digite o tipo: ");
			String tipo = sc.next();
			if (cv.consultaPorTipo(tipo).isEmpty()){
				System.out.println("Nenhum veiculo encontrado.");
			}
			else{
				System.out.println("Veiculo(s) encontrado(s):");
				for (Veiculo v: cv.consultaPorTipo(tipo)){
					System.out.println("Placa: "+ v.getPlaca());
					System.out.println("Marca: "  + v.getMarca());
					System.out.println("Ano: " + v.getAno());
				}
			}
		}
		else{
			System.out.println("Erro. Valor digitado inválido.");
		}
		
		sc.close();
		*/
	
	}
}
