package com.curso.java12a17;

public class TextBlocksApp {

	public static void main(String[] args) {
		var frase = "esto es una frase\n" + "que me he inventado yo.\n" + "Para el curso de Java...";

		var fraseBlock = """
				{
				  "nombre": "Pepe",
				  "apellidos": "Gutierrez"
				}
				""";

		System.out.println(fraseBlock);

		var fraseInterpolacion = """
		{
		  "nombre": "%s",
		  "apellidos": "%s"
		}
		""".formatted("Pepe", "Gutierrez");

		System.out.println(fraseInterpolacion);
		
		String data = """
				Esto es una única \
				frase, pero la escribo \
				así por legibilidad \
				""";
		System.out.println(data);
		
		String data2 = """
                ----------
                    ()  \s
                   (  ) \s
                  (    )\s
                ----------
                """;
        System.out.println(data2);

	}

}
