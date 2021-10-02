import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AtletaProxyTest {
    @BeforeEach
    void setUp(){
        BD.addAtleta(new Atleta(1,
                "Maria",
                "Silva",
                "Hipertrofia",
                89.3f,
                1.63f
                ));
        BD.addAtleta(new Atleta(1,
                "Xerovaldo",
                "Hipersom",
                "Aumento de carga",
                89.3f,
                1.63f
        ));

    }
}