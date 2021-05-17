import java.util.*;

/**
 * Clase VectorHeap
 * @author  Juan Fernando Ramirez
 * @version 1
 */
public class VectorHeap<E extends Comparable<E>> extends PriorityQueue<E> {
    /**
     * Cola donde se guardaran los objetos
     */

    private Vector<E> heap;

    public VectorHeap(){
        heap = new Vector<E>();
    }

}
