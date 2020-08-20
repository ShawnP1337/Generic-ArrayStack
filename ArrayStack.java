class ArrayStack<T> {

 private int top;
 private int size;

 private T arr[];

 public ArrayStack(int size) {
  arr = (T[]) new Object[size];
  top = -1;
  size = 0;

 }

 public boolean isFull() {
  if (size == arr.length) {
   return true;
  } else {
   return false;
  }

 }

 public boolean isEmpty() {
  if (size == 0) {
   return true;
  } else {
   return false;
  }

 }

 public void push(T var) {
  if (isFull() != true) {
   top++;
   arr[top] = var;
   size++;
  }

  else {
   allocateStack();
   top++;
   arr[top] = var;
   size++;
   System.out.println("Stack is full, incresed the size. ew size of stack is: " + arr.length + " units");
  }

 }

 public T pop() {
  if (isEmpty()) {

   System.out.println("Stack is Empty, Cannot remove element");
   System.exit(1);

  }
  T var = arr[top];
  top--;
  size--;

  return var;

 }

 public void displayStack() {
  for (int i = 0; i < size; i++) {
   System.out.println(arr[i]);

  }
 }

 public int stackLength() {
  return arr.length;
 }

 public void allocateStack() {
  T[] newArray = (T[]) new Object[arr.length * 2];
  for (int i = 0; i < arr.length; i++) {
   newArray[i] = arr[i];
  }

  arr = newArray;
 }

}