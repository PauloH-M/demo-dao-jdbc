package model.dao;

import model.dao.impl.SellerDaoJDBC;

// a minha clase vai expor um metodo que retorna o tipo da interface mas
// internamente ela vai estanciar uma implementação é para não precisar expor a implementaçao

public class DaoFactory { 

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
