interface MyFunc <T> {
    MyClass<T> func (T n);
}
class MyClass<T>{
    private T val;
    MyClass (T n){
        val = n;
    }
    MyClass (){
        val = null;
    }
    T  getVal(){
        return val;
    }

}
public class ConstructorRefDemo2 {

    public static void main (String args[]){
        MyFunc <Integer> myClone = MyClass<Integer>::new;
        MyClass<Integer> mc = myClone.func(256);
        System.out.println("mc:"+mc.getVal());
        


    }
}
