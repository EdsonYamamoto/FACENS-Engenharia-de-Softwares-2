package dominio;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import builder.CriadorDeJogo;

class ParticipanteTest {
/*
	@Test
	void testParaInvalidarNomeComMenosDe2Caracteres() {
	    System.out.println("Teste para invalidar nome de participante menos de 2 caracteres");
	    String strUmCaracter="A1";
	    Participante participante = new Participante(strUmCaracter);
	    
	    assertTrue(participante.getNome().trim().length()>1);
	}
*/	
	
	
	
	
	
	
	/**
	 * Edson Yamamoto 
	 */
	@Test
	void testParaValidarNomesApenasComCaracteresEEspaco() {
	    System.out.println("Teste para validar nomes somente com letras e espa�o");
	    String nomeParticipante="Castro Damaceno !!@ 231 ";
	    Participante participante = new Participante(nomeParticipante);
	    
	    String patternString = "[^a-zA-Z\\s]";
	    Pattern pattern = Pattern.compile(patternString);
	    Matcher matcher = pattern.matcher(participante.getNome().trim());
	    
	    int cont=0;
	    while(matcher.find())
	    {
	    	cont++;
	    	System.out.println("Encontrado: "+cont+" : " + matcher.group());
	    }
	    assertTrue(cont==0);
	}
	
}
