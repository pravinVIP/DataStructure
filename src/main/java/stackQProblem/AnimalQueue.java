package stackQProblem;

import java.util.LinkedList;

public class AnimalQueue {
	public static void main(String args[]) {
		AnimalQueue animals= new AnimalQueue();
		animals.enqueue(new Cat("Kiki"));
		animals.enqueue(new Cat("giki"));
		animals.enqueue(new Dog("hiki"));
		animals.enqueue(new Cat("hiki"));
		animals.enqueue(new Cat("jiki"));
		
		System.out.println(animals.dequeueAny().name);
		System.out.println(animals.dequeueDogs().name);
		System.out.println(animals.dequeueCats().name);
	}
	
	
	
LinkedList<Dog> dogs = new LinkedList<Dog>();
LinkedList<Cat> cats = new LinkedList<Cat>();
private int order=0;

public void enqueue(Animal a) {
	a.setOrder(order);
	order++;
	if(a instanceof Dog) {dogs.addLast((Dog)a);}
	else if(a instanceof Cat) { cats.addLast((Cat)a);}
}

public int size() {return dogs.size() + cats.size();}

public Dog dequeueDogs() {return dogs.poll();}

public Dog peekDogs() {return dogs.peek();}

public Cat dequeueCats() {return cats.poll();}

public Cat peekCats() {return cats.peek();}

public Animal dequeueAny() {
	if(dogs.size()==0) {return dequeueCats();}
	else if(cats.size()==0) {return dequeueDogs();}
	Dog dog= dogs.peek();
	Cat cat=cats.peek();
	
	if(dog.isOlderThan(cat)) {return dogs.poll();}
	else {return cats.poll();}
	
}

public Animal peek() {
	if(dogs.size()==0) {return cats.peek();}
	else if(cats.size()==0) {return dogs.peek();}
	
	Dog dog = dogs.peek();
	Cat cat=cats.peek();
	
	if(dog.isOlderThan(cat)) {return dogs.peek();}
	else {return cats.peek();}
}


	
}
