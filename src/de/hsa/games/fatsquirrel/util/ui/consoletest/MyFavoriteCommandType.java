package de.hsa.games.fatsquirrel.util.ui.consoletest;

public enum MyFavoriteCommandType implements CommandTypeInfo{
	HELP("help", "  * list all commands"),
	EXIT("exit", "  * exit program"),
	ADDI("addi", "<param1>  <param2>   * simple integer add ",int.class, int.class ),
	ADDF("addf", "<param1>  <param2>   * simple float add ",float.class, float.class ),
	ECHO("echo", "<param1>  <param2>   * echos param1 string param2 times ",String.class, int.class );
	
	private String name;
	private String description;
	private Class<?> firstparam;
	private Class<?> secondparam;
	
	MyFavoriteCommandType (String name, String description,Class<?> firstInt, Class<?> secondInt) {
		this.name = name;
		this.description = description;
		this.firstparam = firstInt;
		this.secondparam = secondInt;
	}
	MyFavoriteCommandType (String name, String description) {
		this.name = name;
		this.description = description;
		firstparam = null;
		secondparam = null;
	}
	;
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getHelpText() {
		return description;
	}

	@Override
	public Class<?>[] getParamTypes() {
		Class<?>[] paramstype = new Class<?>[2];
		paramstype[0] = firstparam;
		paramstype[1] = secondparam;
		return paramstype;
	}
	

}
