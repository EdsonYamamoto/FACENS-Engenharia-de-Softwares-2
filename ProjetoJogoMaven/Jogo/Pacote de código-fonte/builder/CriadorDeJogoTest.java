package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CriadorDeJogoTest {

	@Test
	void testParaDescricaoVazia() {
        System.out.println("testParaDescricaoVazia");
        String descricao = "";
        CriadorDeJogo instance = new CriadorDeJogo();
        CriadorDeJogo expResult = null;
        CriadorDeJogo result = instance.para(descricao);
        assertEquals(expResult, result);
	}
	
	
	
}
