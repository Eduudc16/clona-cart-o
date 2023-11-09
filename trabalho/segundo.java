package trabalho;

class segundo {
    
    public static void main(String[] args) {
        carro carro1 = new  carro();
        carro carro2 = new  carro();

        carro1.marca = "bmw";
        carro1.modelo = "m3";
        carro1.motor = "v10 5.0L";
        carro1.num_rodas = 10;
        carro1.cor = "preto";

        carro2.marca = "Fiat";
        carro2.modelo = "uno";
        carro2.motor = "v10 5.0L";
        carro2.num_rodas = 10;
        carro2.cor = "preto";

        System.out.println(carro1.marca + " " + carro1.modelo + " " + carro1.motor + " " + carro1.num_rodas + " " + carro1.cor);
        System.out.println(carro2.marca + " " + carro2.modelo + " " + carro2.motor + " " + carro2.num_rodas + " " + carro2.cor);
        
    }
    
}
