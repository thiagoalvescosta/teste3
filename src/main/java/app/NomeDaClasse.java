package app;

import cronapi.CronapiMetaData;
import cronapi.Utils;
import cronapi.Var;
import cronapi.CronapiMetaData.CategoryType;
import cronapi.CronapiMetaData.ObjectType;	


/**
 * Classe que representa ...
 * 
 * @author local
 * @version 1.0
 * @since 2017-11-06
 *
 */
 
public class NomeDaClasse {

	@CronapiMetaData(type = "function", name = "Nova Função", description = "Descrição da Função", params = {
          "Input: Param description" }, paramsType = { ObjectType.STRING }, returnType = ObjectType.STRING)
	private static Var NovaFuncao(Var input) {
		return Var.valueOf("Input " + input.toString());
	}

}


