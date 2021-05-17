import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Vector;

/**
 * Clase VectorHeap
 * @author  Juan Ramirez
 * @version 1
 */
public class VectorHeap<E extends Comparable<E>> implements PriorityQueue<E>{
    /**
     * Cola donde se guardaran los objetos
     */
    private static final int d = 2;
    private Vector<E> heap;
    private int tamHeap;

    public VectorHeap() {
        tamHeap = 0;
        heap = new Vector<>();

    }

    /**
     *
     * @return el primer elemento
     */
    @Override
    public E peek() {
        return heap.firstElement();
    }

    /**
     *
     * @return retorna el valor que se ha eliminado
     */
    @Override
    public E remove() {
        if(isEmpty())
            throw new NoSuchElementException("Heap is empty, No element to delete");
        E valor1 = heap.firstElement();

        heap.set(0,heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        tamHeap--;
        if(heap.size()>1){
            heapifyDown(0);
        }
        return valor1;
    }

    /**
     *
     * @param valor que es un tipo abstracto en este caso se usara objeto paciente
     */
    @Override
    public void add(E valor) {

        heap.add(valor);
        tamHeap++;
        heapifyUp(tamHeap-1);
    }

    /**
     *
     * @return un buleano que dice si esta vacio el vector
     */
    @Override
    public boolean isEmpty() {
        return tamHeap == 0;
    }

    /**
     *
     * @return el tamanio del vector
     */
    @Override
    public int size() {
        return tamHeap;
    }

    /**
     * borra todo el vector
     */
    @Override
    public void clear() {

    }

    /**
     *
     * @return false si no esta lleno y true si esta lleno
     */
    public boolean isFull(){
        return tamHeap ==heap.size();
    }

    /**
     *
     * @param i
     * @return el nodo padre
     */
    private int parent(int i){
        return (i-1)/d;
    }

    /**
     *
     * @param i
     * @param hijo
     * @return un hijo 1 izquierda 2 derecha
     */
    private int child(int i, int hijo){
        return (d*i)+hijo;
    }

    /**
     * Mantiene la estructura del heap cuando se hace un insert
     * @param i
     */
    private void heapifyUp(int i){
        int parent = parent(i);
        E temp = heap.get(i);
        while(i>0 && (temp.compareTo(heap.get(parent))<0)){
            heap.set(i,heap.get(parent));
            i = parent;
            parent = parent(i);

        }
        heap.set(i,temp);
    }

    /**
     * Mantiene la estructura del heap al borrar
     * @param i
     */
    private void heapifyDown(int i){

        E value = heap.get(i);
        while (i<tamHeap){
            int childpos = child(i,1);
            if(childpos < tamHeap){
                if ((child(i,2) < tamHeap) && ((heap.get(childpos+1)).compareTo(heap.get(childpos))<0)){
                    childpos++;
                }
                if((heap.get(childpos)).compareTo(value)<0){
                    heap.set(i, heap.get(childpos));
                    i = childpos;
                }
                else{
                    heap.set(i, value);
                    return;
                }
            }
            else{
                heap.set(i, value);
                return;
            }
        }
    }

    /**
     * se imprime el heap
     */
    public void printHeap()
    {
        /*System.out.println(heap.firstElement());
        System.out.println(heap.get(1));*/
        System.out.print("Cola prioridad "+ "\n");
        for (int i = 0; i < tamHeap; i++)
            System.out.print(heap.get(i).toString() +" ");
        System.out.println();
    }


}
