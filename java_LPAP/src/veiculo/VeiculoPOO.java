package veiculo;

public class VeiculoPOO {  //Métodos

        public String modelo;
        public String marca;
        public int anoFabri;
        public double diaria;
        public int decisao = 0;

        public String alugar () {
            return "! VOCÊ ESTÁ ALUGANDO O VEÍCULO";
        }
        public String devolver () {
            return "! VEÍCULO DEVOLVIDO";
        }
        public String decisao () {
            if (decisao == 1) {
                return alugar();
            }
            else if (decisao == 2) {
                return devolver();
            }
            else {
                return "Tente novamente. Certifique-se de insirir: \n '1' ==> Para Alugar \n OU \n '2' ==> Para Devolver. ";
            }
        }
    }

