package punto_5;

public class TestSinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList<String> Lista1 = new SinglyLinkedList<String>();
		System.out.println("Lista vacía?: " + Lista1.isEmpty());
		Lista1.addLast("abc");
		System.out.println("Lista vacía?: " + Lista1.isEmpty());
		System.out.println("Cardinalidad Lista: " + Lista1.size());
		System.out.println("Lista primero: " + Lista1.first());
		System.out.println("Lista último: " + Lista1.last());
		Lista1.addLast("xyz");
		System.out.println("Lista vacía?: " + Lista1.isEmpty());
		System.out.println("Cardinalidad Lista: " + Lista1.size());
		System.out.println("Lista primero: " + Lista1.first());
		System.out.println("Lista último: " + Lista1.last());
		Lista1.addFirst("lmn");
		System.out.println("Lista vacía?: " + Lista1.isEmpty());
		System.out.println("Cardinalidad Lista: " + Lista1.size());
		System.out.println("Lista primero: " + Lista1.first());
		System.out.println("Lista último: " + Lista1.last());
		System.out.println("Listado de la lista:" + Lista1);

		// Pruebas de los métodos agregados
		System.out.println("\n--- Pruebas de métodos nuevos ---");

		System.out.println("Lista original: " + Lista1);

		System.out.println("Agregando '123' en posición 1");
		Lista1.addPos("123", 1);
		System.out.println("Lista luego de addPos: " + Lista1);

		System.out.println("Eliminando elemento 'xyz'");
		Lista1.removeElement("xyz");
		System.out.println("Lista luego de removeElement: " + Lista1);

		System.out.println("Eliminando elemento en posición 0");
		Lista1.removePos(0);
		System.out.println("Lista luego de removePos: " + Lista1);

		System.out.println("Buscando 'abc': " + Lista1.search("abc"));
		System.out.println("Buscando 'no-existe': " + Lista1.search("no-existe"));

		SinglyLinkedList<String> Lista2 = new SinglyLinkedList<String>();
		Lista2.addLast("x");
		Lista2.addLast("y");
		Lista2.addLast("z");
		System.out.println("Concatenando con otra lista [x, y, z]");
		Lista1.concatenate(Lista2);
		System.out.println("Lista final: " + Lista1);
	}
}
