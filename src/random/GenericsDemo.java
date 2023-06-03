public class GenericsDemo {

    public static void main(String[] args) {

        MyGen<String> myGen = new MyGen<>("Mannu");
        MyGen<Long> myGenLong = new MyGen<>(234L);
        System.out.println(myGen.getObj());
        System.out.println(myGenLong.getObj());

    }
}

class MyGen <T> {

    T obj;

    MyGen(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
