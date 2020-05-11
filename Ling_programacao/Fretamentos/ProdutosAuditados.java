package Fretamentos;

import java.sql.Date;

// interface para produtos que são auditados (combustiveis e produtos perigosos).

public interface ProdutosAuditados {
	
	public abstract Date getDatahora();
	public abstract String getOrgaoInpsecao(); 

}
