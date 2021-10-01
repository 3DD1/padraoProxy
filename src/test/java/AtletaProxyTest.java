import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AtletaProxyTest {
    @BeforeEach
    void setUp(){
        BD.addAtleta(new Atleta(1, "Maria", "Silva"));
    }
}