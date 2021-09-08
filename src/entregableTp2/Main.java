package entregableTp2;

public class Main {

	public static void main(String[] args) {
		
		// Se construye el �rbol de ejemplo utilizando el constructor previamente mencionado
		int[] valoresIniciales = new int[] {10, 5, 12, 2, 1, 3, 8, 6, 11, 25, 22, 30};
		TreeWithNode miArbol = new TreeWithNode(valoresIniciales);

		System.out.println("El recorrido Preorder es: ");
		miArbol.printPreorder();
		System.out.println();
		System.out.println("El recorrido Inorder es: ");
		miArbol.printInorder();
		System.out.println();
		System.out.println("El recorrido es: ");
		miArbol.printPostorder();
		System.out.println();
		System.out.println("mayor elemento: ");
		System.out.println( miArbol.getMaxElem());
		System.out.println("la altura: ");
		System.out.println( miArbol.getHeight());
		System.out.println("nodos de la rama mas larga: ");
		System.out.println( miArbol.getLongestBranch());
		System.out.println("elementos del nivel: ");
		System.out.println( miArbol.getElementAtLevel(2));
		System.out.println("las hojas del arbol: ");
		System.out.println( miArbol.getFrontera());
		System.out.println("--------------------");

		miArbol.add(23);
		miArbol.add(4);
		miArbol.delete(11);
		miArbol.delete(25);

		System.out.println("El recorrido Preorder es: ");
		miArbol.printPreorder();
		System.out.println();
		System.out.println("El recorrido Inorder es: ");
		miArbol.printInorder();
		System.out.println();
		System.out.println("El recorrido es: ");
		miArbol.printPostorder();
		System.out.println();
		System.out.println("mayor elemento: ");
		System.out.println( miArbol.getMaxElem());
		System.out.println("la altura: ");
		System.out.println( miArbol.getHeight());
		System.out.println("nodos de la rama mas larga: ");
		System.out.println( miArbol.getLongestBranch());
		System.out.println("elementos del nivel: ");
		System.out.println( miArbol.getElementAtLevel(2));
		System.out.println("las hojas del arbol: ");
		System.out.println( miArbol.getFrontera());
		System.out.println("--------------------");
		
		miArbol.add(65);
		miArbol.delete(8);
		miArbol.delete(10);
		miArbol.add(55);

		System.out.println("/nEl recorrido Preorder es: ");
		miArbol.printPreorder();
		System.out.println("/nEl recorrido Inorder es: ");
		miArbol.printInorder();
		System.out.println("/nEl recorrido es: ");
		miArbol.printPostorder();
		System.out.println("mayor elemento: ");
		System.out.println( miArbol.getMaxElem());
		System.out.println("la altura: ");
		System.out.println( miArbol.getHeight());
		System.out.println("nodos de la rama mas larga: ");
		System.out.println( miArbol.getLongestBranch());
		System.out.println("elementos del nivel: ");
		System.out.println( miArbol.getElementAtLevel(2));
		System.out.println("las hojas del arbol: ");
		System.out.println( miArbol.getFrontera());
		System.out.print("Diferencia entre hojas adyacentes de derecha a izquierda: ");
		System.out.println(miArbol.differenceBetweenAdjacentSheets());
		System.out.println("--------------------");
		
	}

}
