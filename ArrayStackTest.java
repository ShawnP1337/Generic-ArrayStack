class ArrayStackTest<T> {

 public static void main(String[] args) {

  ArrayStack<Object> arrStack = new ArrayStack<Object>(2);

  arrStack.push(1);
  arrStack.push("Hello");
  arrStack.displayStack();
  arrStack.push(1.893);
  arrStack.displayStack();
  arrStack.pop();
  arrStack.displayStack();
  arrStack.pop();
  arrStack.pop();
  arrStack.pop();

 }
}