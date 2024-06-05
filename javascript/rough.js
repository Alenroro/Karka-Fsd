var name = "Alen";
var age =23;
console.log(`My name is ${name}
 and 
my age is ${age}`)


const originalArray = [1, 2, 3];
const copiedArray = [...originalArray]; 
console.log(copiedArray)


const array1 = [1, 2, 3];
const array2 = [4, 5, 6];

const combinedArray = [...array1, ...array2]; 
console.log(combinedArray)

const array = [1, 2, 3];
console.log(...array); 

const obj = { foo: 'bar' };
console.log(obj); 

const obj1 = { foo: 'bar' };
const obj2 = { baz: 'qux' };

const combinedObject = { ...obj1, ...obj2 }; 
console.log( combinedObject); 

function myFunction(x, y, z) {
    console.log(x, y, z);
}
  
  const args = [1, 2, 3];
  myFunction(...args);

  const numbers = [1, 2, 3, 4, 5];
  const even = numbers.map(number => number % 2==0);
  console.log(even)

  const add=(a,b)=> a+b;
 console.log(add(2,3));