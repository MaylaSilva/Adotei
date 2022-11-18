package br.com.ada.adotei;

import br.com.ada.adotei.BusinessObject.EnumPorte;
import br.com.ada.adotei.BusinessObject.EnumRacaCachorro;
import br.com.ada.adotei.Modelo.Cachorro;
import br.com.ada.adotei.Modelo.Ong;

import java.util.Date;

public class Teste {
    Ong petoresco = new Ong("Petoresco","00000000/0000-00","Rua dos Marmelos, 50",
            10,"4430000000","petoresco@hotmail.com","Não tem");
    Cachorro caramelo = new Cachorro("Bob", 3,"Pêlo curto, brincalhão",
            true, false, true, EnumRacaCachorro.SRD, EnumPorte.PEQUENO,petoresco);
}
