package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;

@CronapiMetaData(type = "blockly")
@CronappSecurity(execute = "Administrators")
public class Bloco {

	public static final int TIMEOUT = 300;

	/**
	 *
	 * @return Var
	 */
	// Bloco
	public static Var Executar() throws Exception {
		return new Callable<Var>() {

			public Var call() throws Exception {
		//		cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
			//			Var.valueOf("Teste"));
				//return Var.VAR_NULL;
        cronapi.database.Operations.execute(Var.valueOf("app.entity.User"), Var.valueOf("update User set email = :x"),Var.valueOf("x",Var.valueOf("admin@admin")));
        return Var.VAR_NULL;
			}
		}.call();
	}

}
