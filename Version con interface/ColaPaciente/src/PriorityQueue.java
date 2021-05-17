/**
 * @author Juan Ramirez
 * @param <E>
 */
public interface PriorityQueue<E extends Comparable<E>>{
    /**
     *
     * @return el primero de la lista
     */
  public E peek();

    /**
     *
     * @return elimina y regresa el primero de la lista
     */
  public E remove();

    /**
     *
     * @param valor que es un tipo abstracto en este caso se usara objeto paciente
     */
  public void add(E valor);

    /**
     *
     * @return booleano para saber si esta vacia
     */
  public boolean isEmpty();

    /**
     *
     * @return el tamano de la cola de prioridad
     */
  public int size();

    /**
     * elimina toda la lista
     */
  public void clear();


}
