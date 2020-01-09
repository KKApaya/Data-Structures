class Array<T>{
    private T arr[];
    private int len = 0;
    private int capacity = 0;

    Array(){
        this(16);
    }
    public Array(int capacity){
        if(capacity<0)throw IllegalArgumentException("Value cannnot be null");
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return len;
    }

    public int clear(){
        return size()==0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(int index,T element){
        arr[index] == element;
    }

    public void clear(){
        for(int i =0;i<capacity;i++){
            arr[i] = null;
        }
        len = 0;
    }

    public void add(T value){
        if(len+1 >= capacity){
            if(capacity = 0) {
                capacity = 1;
            }
            else{
                capacity*=2;
            }
        T[] new_arr = (T[])new Object[capacity];
        for(int i =0;i<len;i++){
            new_arr[i] = arr[i]
            }
        }
    }

    public T removeAt(int remove_index){
        if(remove_index >= len && remove_index <0) throw new IndexOutOfBoundExcepetion();
        T data = arr[remove_index];
        T[] new_arr = (T[]) new Object[len-1];
        for(int i=0,j=0;i<len;i++,j++){
            if(i == remove_index){
                j--;
            }else{
                new_arr[j] = arr[i];
            }
        }
        capacity = --len;
        arr = new_arr;
        return data;
    }

    public boolean remove(Object obj){
        for(int i =0;i<len;i++){
            if(arr[i].equlas(obj)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }
    public int indexOf(Object obj){
        for(int i =0;i<len;i++){{
            if(arr[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public String toString(arr){
        if(len ==0)
            return "[]"
        else{
            StringBulider bulider = new StringBulider(len).append("[");
            for(int i =0;i<len;i++){
                bulider.append(arr[i] + ",");
                return bulider.append(arr[len-1]+"]").toString();
            }
        }
    }
}