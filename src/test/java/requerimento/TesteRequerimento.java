package requerimento;

import org.junit.Assert;
import org.junit.Test;

public class TesteRequerimento {

	@Test
	public void test() {
		Produto produto = new  Produto();
		produto.setId(1);
		produto.setNome("produto");
		
		Assert.assertEquals("nome",produto.getNome(), "produto");
		Assert.assertEquals("id",produto.getId(), new Integer(1));
	}

}
