package ejercicios.demo;

public class Demo2
{
	/**
	 * Devuelve verdadero si todos los elementos están en el conjunto.
	 */
	public static boolean pertenecenTodos(int[] elems, int[] conjunto) {
		if(elems.length>conjunto.length)
			return false;
		if(elems.length==0 || conjunto.length==0)
			return false;
		boolean acum=true;
		for(int i=0;i<elems.length;i++){
			acum=acum && siEsta(elems[i],conjunto);
		}
		return acum;
	}
	public static boolean siEsta(int elem, int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==elem)
				return true;
		}
		return false;
	}

	/**
	 * Devuelve el índice del pico en un arreglo unimodal.
	 *
	 * Nomenclatura: un arreglo unimodal de N elementos es estrictamente
	 * creciente hasta una determinada posición P, y estrictamente
	 * decreciente a partir de ella. Se cumple que 0 < P < N-1.
	 *
	 * Se garantiza que el arreglo pasado como parámetro tiene forma de
	 * pico y, por tanto, al menos 3 elementos.
	 */
	public static int indicePico(int[] arreglo) {
		int pos=-1;
		int pico=arreglo[0];
		if(arreglo.length==0)
			return pos;
		for(int i=1;i<arreglo.length;i++){
			if(pico<arreglo[i]){
				pico=arreglo[i];
				pos=i;
			}
		}
		return pos;
		// Ejemplos:
		//     [2, 4, 6, 19, 15, 8, -2] → se devuelve 3
		//     [10, 20, 30, 40, 50, 15] → se devuelve 4
		//     [50, 100, 75]            → se devuelve 1
	
	}
}
